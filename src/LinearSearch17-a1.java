import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        int num, n;
        boolean isPresent = false;

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        num = x.nextInt();

        for (String str : args) {
            n = Integer.parseInt(str);
            if (num == n) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            System.out.println("The number " + num + " is present in the array.");
        } else {
            System.out.println("The number " + num + " is not present in the array.");
        }

    }
}
