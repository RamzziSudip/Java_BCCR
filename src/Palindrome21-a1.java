import java.util.Scanner;

class Palindrome {
    public static String reverse(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string to check it's palindromic or not:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = reverse(str);
        if (str.equals(reversed))
            System.out.println(str + " is Palindrome");
        else System.out.println(str + " is not Palindrome");
    }
}
