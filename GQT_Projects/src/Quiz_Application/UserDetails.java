package Quiz_Application;
import java.util.Scanner;

public class UserDetails {
    static Scanner sc = new Scanner(System.in);
    public static String getUserName() {
        System.out.print("Enter your Name: ");
        return sc.nextLine();
    }
    public static int getUserAge() {
        System.out.print("Enter your Age: ");
        return sc.nextInt();
    }
}
