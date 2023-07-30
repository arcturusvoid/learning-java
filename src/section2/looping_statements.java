package section2;

public class looping_statements {
    public static void main(String[] args) {
        int i = 1;
        while ( i <= 10){
            System.out.println("Hello!");
            i++;
        }

        int j = 10;
        do {
            System.out.println("runs once");
        } while (j < 5);

        for (int x = 0; x < 10; x++){
            System.out.println("it is for ...");
        }
    }
}
