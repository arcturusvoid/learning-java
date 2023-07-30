package section7_solid;

/**
 * S - Single Responsibility Principle - A Class should have one and only one reason to change
 *
 *
 *
 */
public class solid1 {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        service.openAccount();
    }
}

// S in SOLID
class AccountService {
    private AccountRepository repository = new AccountRepository();
     private NotificationService notificationService = new NotificationService();
    public void openAccount(){
        // 1
        System.out.println("Fill account internal details");

        repository.create();

        notificationService.sendNotification();
    }
}

class AccountRepository {
    public void create(){
        // 2
        System.out.println("Store account object in database");
    }
}

class NotificationService {
    public void sendNotification(){
        // 3
        System.out.println("Send outs a welcome message");
    }
}
