package Assignment2;

class BankAccount {
    private static int nextAccNo = 1000000;
    private String name;
    private String address;
    private int accNo;
    private long balance;

    public void init(String name, String address, long balance) {
        nextAccNo++;
        this.name = name;
        this.address = address;
        this.accNo = nextAccNo;
        this.balance = balance;
    }

    public void init(String name, String address){
        init(name, address, 0);
    }

    public long deposit(long amount) {
        this.balance += amount;
        return this.balance;
    }

    public long withdraw(long amount) {
        if (this.balance < amount) System.out.println("[x] Insufficient balance!");
        else this.balance -= amount;
        return this.balance;
    }

    public void info() {
        System.out.println("---[Bank Account]("+this.accNo+")---");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: $" + this.balance);
        System.out.println("-".repeat(20));
    }

}

public class Bank9 {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.init("Tyler Caron", "59707 Vito Turnpike Apt. 798, Texas, USA");
        ac.info();
        System.out.println("New balance after deposit: $"+ac.deposit(1000));
        ac.withdraw(5000);
        System.out.println("New balance after withdraw: $"+ac.withdraw(500));
        ac.info();
    }
}
