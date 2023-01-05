import java.util.Scanner;

class Armstrong {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, sum = 0, last;

        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }

        return n == sum;
    }

    public static void main(String[] args) {
        int srange, erange, i;
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the start of range( >= 1 ): ");
        srange = x.nextInt();

        System.out.print("Enter the end of range: ");
        erange = x.nextInt();

        if (srange >= 1 && erange >= srange) {
            for (i = srange; i <= erange; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter starting range and ending range carefully!");
        }
    }
}
