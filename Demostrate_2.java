import java.util.Scanner;
//Its a file of Demosntate_1 
//which can be access the properties of Demostrate_2
public class Demostrate_2 {
    Scanner sc = new Scanner(System.in);
    private String message;

    public Demostrate_2(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    void add() {
        System.out.println("Enter the first num : ");
        int a = sc.nextInt();
        System.out.println("Enter the second num : ");
        int b = sc.nextInt();
        int c= a+b;
        System.out.println(c);
    }
    
}
