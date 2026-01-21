package Quiz_Application;

public class RewardSystem {

    static int reward = 0;

    public static void giveReward(String name) {
        reward += 1000;
        System.out.println(Colors.GREEN + "Correct Answer!" );
        System.out.print("Congratulations " + name + "! ");
        System.out.print("You got ₹" + reward+ Colors.RESET);
    }

    public static void finalMessage(String name) {
        System.out.println("\n===== QUIZ COMPLETED =====");
        System.out.print(Colors.GREEN + "Congratulations " + name+" " );
        System.out.print("You won ₹" + reward+ Colors.RESET);
    }
}
