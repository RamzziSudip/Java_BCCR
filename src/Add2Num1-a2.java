import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class CliInput {
    private final int[] numbers;
    private final int bufferSize;

    public CliInput(int size) {
        this.bufferSize = size;
        this.numbers = new int[size];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setNumbers(byte source) throws IOException {
        if (source == 2) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            while (i>this.bufferSize){
                for (int number:
                        Arrays.stream(input.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()) {
                    this.numbers[i] = number;
                    i++;
                }
            }
            System.out.println(Arrays.toString(this.numbers));
        } else if (source == 1) {
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < bufferSize; i++) this.numbers[i] = input.nextInt();

        }
    }

    public int sum() {
        return Arrays.stream(this.numbers).sum();
    }

}

class Add2Num1 {
    public static void main(String[] args) throws IOException {
        System.out.print("How many numbers do you want to add?\n> ");
        Scanner input = new Scanner(System.in);
        CliInput reader = new CliInput(input.nextInt());

        System.out.println("""
                Choose the version in command line argument:
                                [1]Using Scanner
                                [2]Using BufferedReader""");
        byte bufferType = input.nextByte();
        if ((bufferType != 1) && (bufferType != 2)) {
            throw new RuntimeException("Invalid choice!");
        }
        System.out.print("Enter " + reader.getBufferSize() + " numbers: ");
        reader.setNumbers(bufferType);
        System.out.println("Sum of " + Arrays.toString(reader.getNumbers()) + ": " + reader.sum());
    }
}
