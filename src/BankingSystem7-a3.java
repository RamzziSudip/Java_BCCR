import java.util.Scanner;

class Account {
    private static int acIdx = 1000;
    protected final int acNo;
    protected String customerName;
    protected String type;
    protected double balance;

    public Account(String type) {
        acIdx++;
        this.type = type;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.customerName = sc.nextLine();
        if (type.equals("current")) {
            System.out.print("Initial deposit amount: ");
            this.balance = sc.nextDouble();
        } else
            this.balance = 0;
        acNo = acIdx;
        System.out.println("New account has been created!\n" + this);
    }

    @Override
    public String toString() {
        return "Account{" +
               "customerName='" + customerName + '\'' +
               ", acNo=" + acNo +
               ", type='" + type + '\'' +
               ", balance=" + balance +
               '}';
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("%,.2f₹ amount has been deposited.%n", amount);
    }

    public void balance() {
        System.out.printf("Account[%d] has balance: %,.2f₹%n", acNo, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.printf("%,.2f₹ amount has been withdrawn.%n", amount);
    }

    public void depInterest() {
    }
}

class Curr_Acct extends Account {

    public Curr_Acct() {
        super("current");
    }

    @Override
    public void withdraw(double amount) {
        double new_balance = balance - amount;
        super.withdraw(amount);
        if ((new_balance < 1000) && (new_balance > 0)) {
            balance -= 100;
            System.out.println("100₹ has been deducted as penalty");
        }
    }
}

class Savn_Acct extends Account {
    private static final float interest = 5.1f;

    public Savn_Acct() {
        super("savings");
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    public void depInterest() {
        if (balance < 0)
            return;
        double amount = balance * (interest / 100);
        this.balance += amount;
        System.out.printf("%,.2f₹ has been deposited as interest.%n", amount);
    }

}

class BankingSystem {
    final Scanner input = new Scanner(System.in);
    Account acc;

    private static void exit() throws InterruptedException {
        System.out.println("Exiting the program bye bye...");
        Thread.sleep(5000);
        System.exit(0);
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            BankingSystem main = new BankingSystem();
            System.out.print("""
                    **Welcome to JavaBank**
                    Let's start by creating a new account for you!
                    [1] Current Account
                    [2] Savings Account
                    [0] Exit
                    """);
            System.out.print("> ");

            switch (main.input.nextByte()) {
                case 1 -> main.acc = new Curr_Acct();
                case 2 -> main.acc = new Savn_Acct();
                default -> exit();
            }
            main.Handler();
        }
    }

    private void Handler() throws InterruptedException {
        int counter = 0;
        while (true) {
            if (acc.type.equals("savings"))
                System.out.println("(Interest will be deposited automatically after every 3 commands)");
            System.out.print("""
                    Perform these following operations:
                    [1] Withdraw
                    [2] Deposit
                    [3] Check balance
                    [4] Create a new account
                    [0] Exit
                    """);
            System.out.print("> ");
            switch (input.nextByte()) {
                case 1 -> {
                    System.out.print("Enter your amount: ");
                    acc.withdraw(input.nextDouble());
                }

                case 2 -> {
                    System.out.print("Enter your amount: ");
                    acc.deposit(input.nextDouble());
                }

                case 3 -> acc.balance();

                case 4 -> {
                    return;
                }

                default -> exit();

            }
            if (acc.type.equals("savings")) {
                counter++;
                if (counter == 3) {
                    acc.depInterest();
                    counter = 0;
                }
            }
        }
    }
}