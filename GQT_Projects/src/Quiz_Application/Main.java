package Quiz_Application;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = UserDetails.getUserName();
        int age = UserDetails.getUserAge();
        System.out.println(Colors.CYAN + "Welcome to quiz " + name + Colors.RESET);
        System.out.println("\n===== QUIZ INSTRUCTIONS =========");
        System.out.println("1. The quiz contains 10 questions.");
        System.out.println("2. You must choose the correct option to continue among the options.");
        System.out.println("3. If you enter a wrong answer, the quiz will end immediately.");
        System.out.println("4. Two lifelines are available: Audience Poll and 50/50.Each lifeline can be used only once");
        System.out.println("5. Lifelines are not available for the 10th question.");
        System.out.println("6. Correct answers will be shown in green, wrong answers in red.");
        System.out.println("====================================\n");
        for (int i = 0; i < QuestionBank.questions.length; i++) {
            boolean lifelineUsedInThisQuestion = false;
            while (true) {
                System.out.println("\nQ" + (i + 1) + ": "+ QuestionBank.questions[i]);
                for (String opt : QuestionBank.options[i]) {
                    if (!opt.equals(""))
                        System.out.print(opt + "  ");
                }
                if (i != 9 &&
                    !lifelineUsedInThisQuestion &&
                    !(LifeLines.audienceUsed && LifeLines.fiftyUsed)) {
                    System.out.println("e) Lifeline");
                }
                System.out.print("\nEnter option (a/b/c/d/e): ");
                String input = sc.next();
                if (input.equals("e") &&i != 9 &&!lifelineUsedInThisQuestion &&!(LifeLines.audienceUsed && LifeLines.fiftyUsed)) {
                    System.out.println(Colors.YELLOW + "\nChoose Lifeline:" + Colors.RESET);
                    if (!LifeLines.audienceUsed)
                        System.out.println("1) Audience Poll");
                    if (!LifeLines.fiftyUsed)
                        System.out.println("2) 50/50");
                    int choice = sc.nextInt();
                    if (choice == 1 && !LifeLines.audienceUsed) {
                        LifeLines.audiencePoll(QuestionBank.answers[i]);
                        lifelineUsedInThisQuestion = true;
                    }
                    else if (choice == 2 && !LifeLines.fiftyUsed) {
                        LifeLines.fiftyFifty(
                                QuestionBank.options[i],
                                QuestionBank.answers[i]);
                        lifelineUsedInThisQuestion = true;
                    }
                    else {
                        System.out.println(
                                Colors.RED + "This lifeline is already used." + Colors.RESET);
                    }

                    continue;
                    }
                char userAnswer = input.toLowerCase().charAt(0);
                if (AnswerValidate.isCorrect(userAnswer, QuestionBank.answers[i])) {
                    RewardSystem.giveReward(name);
                    break;
                } else {
                    System.out.println(Colors.RED + "Sorry your failed " + Colors.RESET);
                    System.out.println("Quiz Ended!");
                    RewardSystem.finalMessage(name);
                    sc.close();
                    return;
                }
            }
        }

        RewardSystem.finalMessage(name);
        sc.close();
    }
}
