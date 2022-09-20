package assignment.three;

class Account {
    private static int acIdx = 0;
    protected String customerName;
    protected int acNo;
    protected String type;
    protected double balance = 0;

    protected void setAcNo(){
        acIdx++;
        acNo = acIdx;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("%,f₹ amount has been deposited.%nNew balance: %,f₹%n", amount, balance);
    }

    public void balance() {
        System.out.printf("Account[%d] has balance: %,f₹%n", acNo, balance);
    }

    public  void withdraw(double amount) {
        if (balance - amount > 0){
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.printf("%,f₹ has been withdrawn.%nNew Balance: %,f₹%n", amount, balance);
    }
}

class Curr_Acct extends Account {
    public Curr_Acct(String name, double initialDeposit) {
        type = "current";
        setAcNo();
        customerName = name;
        balance = initialDeposit;
    }

    @Override
    public void withdraw(double amount) {
        double new_balance = balance - amount;
        if ((new_balance < 1000) && (new_balance > 0)) {
            balance -= 100;
            System.out.println("100₹ has been deducted as penalty");
        }
        super.withdraw(amount);
    }
}

public class BankingSystem7 {
    public static void main(String[] args) {

    }
}
