package section3_oop;

public class data_hiding_encapsulation {
    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.deposit(1000);
        acc1.withraw(500);
        acc1.withraw(1000);

        System.out.println("Balance: " + acc1.getBalance());
    }
}

class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount > 0 ? amount : 0;
    }

    public void withraw(double amount){
        if(amount > this.balance){
            System.out.println("Withdraw amount is greater than balance");
            return;
        }
        else if(amount <= 0){
            System.out.println("Withdraw amount is less than 0");
           return;
        }
        else {
            this.balance -= amount;
        }
    }
}
