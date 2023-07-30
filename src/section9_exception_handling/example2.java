package section9_exception_handling;

public class example2 {

    public static void main(String[] args) {
        Account account = new Account(1, 200);
        try {
            account. withdraw(999999999);
            System.out.println("Withdraw Success");
        } catch (DataException e) {
            System.err.println("Failed with DataException");
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            System.err.println("Failed with InsufficientFundsException");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Account {
    private int accNo;
    private double balance;

    public Account(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    // return 0 for success, 1 for insufficient funds, 2 for data error
    public void withdraw(double amount) throws DataException, InsufficientFundsException{

        if(amount <= 0)
            throw new DataException("Amount cannot be 0 or below");

        double newBalance = balance - amount;

        if (newBalance < 0 )
            throw new InsufficientFundsException("Insufficient balance");

        balance = newBalance;

    }
}

class DataException extends Exception{
    public DataException(String reason){
        super(reason);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String reason){
        super(reason);
    }
}

