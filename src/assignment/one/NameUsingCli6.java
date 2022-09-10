package assignment.one;

public class NameUsingCli6 {
    public static void main(String[] args) {
        if (args.length < 2)
            throw new RuntimeException("Please enter your first name and last name as command line argument");
        System.out.println(args[0] + " " + args[1]);
    }
}
