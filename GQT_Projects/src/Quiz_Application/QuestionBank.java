package Quiz_Application;

public class QuestionBank {

    public static String[] questions = {
            "1. Java is a ___ language?",
            "2. Which keyword is used to inherit a class?",
            "3. Size of int data type in Java?",
            "4. Which operator is used for logical AND?",
            "5. Which company developed Java?",
            "6. JVM stands for?",
            "7. Which loop is entry controlled?",
            "8. Default value of boolean variable?",
            "9. Which package is automatically imported?",
            "10. Which method is the entry point of Java program?"
        };

        public static String[][] options = {
            {"a) Low-level", "b) High-level", "c) Assembly", "d) Machine"},
            {"a) super", "b) this", "c) extends", "d) implements"},
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends on OS"},
            {"a) &", "b) |", "c) &&", "d) ||"},
            {"a) Google", "b) Microsoft", "c) Sun Microsystems", "d) Apple"},
            {"a) Java Virtual Machine", "b) Java Visual Model", "c) Java Variable Method", "d) None"},
            {"a) for", "b) while", "c) do-while", "d) foreach"},
            {"a) true", "b) false", "c) 0", "d) null"},
            {"a) java.util", "b) java.io", "c) java.lang", "d) java.sql"},
            {
                "a) public static void main(String args[])",
                "b) static void main()",
                "c) void main(String[] args)",
                "d) main(String args)"
            }
        };

        public static char[] answers = {
            'b', 'c', 'b', 'c', 'c',
            'a', 'a', 'b', 'c', 'a'
        };


}
