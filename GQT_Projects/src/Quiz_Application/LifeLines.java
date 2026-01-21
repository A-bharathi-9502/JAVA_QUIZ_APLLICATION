package Quiz_Application;
import java.util.*;

public class LifeLines {

    public static boolean audienceUsed = false;
    public static boolean fiftyUsed = false;

    // Audience Poll
    public static void audiencePoll(char correctOption) {

        System.out.println( "\n========="+Colors.GREEN+" AUDIENCE POLL"+ Colors.RESET+" =================\n" );
        int correctPercent = 70;
        int remainingPercent = 30;
        int eachWrong = remainingPercent / 3;
        for (char opt = 'a'; opt <= 'd'; opt++) {
            if (opt == correctOption) {
                System.out.print( opt + " -> " + correctPercent + "%   " );
            } else {
                System.out.print( opt + " -> " + eachWrong + "%  ");
            }
        }

        System.out.println( "\n\n=========================================\n"  );

        audienceUsed = true;
    }
    public static void fiftyFifty(String[] options, char correctOption) {
    	System.out.println(Colors.GREEN+"=========Fifty Fifty Activated========="+Colors.RESET);
        List<Integer> wrongIndexes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (options[i].charAt(0) != correctOption) {
                wrongIndexes.add(i);
            }
        }

        Collections.shuffle(wrongIndexes);
        options[wrongIndexes.get(0)] = "";
        options[wrongIndexes.get(1)] = "";

        fiftyUsed = true;
    }
}
