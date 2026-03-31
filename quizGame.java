import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables + Array Declaration
        String userInput = "";
        int score = 0;
        String[] questionBank = { "Q1. What does CPU stand for?",
                "Q2. Which data structure uses FIFO (First In First Out)?",
                "Q3. What is the time complexity of binary search?",
                "Q4. Which language is primarily used for Android development?",
                "Q5. What does HTML stand for?",
                "Q6. Which of the following is not a programming language?",
                "Q7. What is the brain of the computer?",
                "Q8. Which data structure uses LIFO (Last In First Out)?",
                "Q9. What is the full form of RAM?",
                "Q10. Which company developed Java?"
        };
        int length = questionBank.length;
        String[][] optionBank = {
                { "A. Central Processing Unit", "B. Computer Personal Unit", "C. Central Performance Unit",
                        "D. Control Processing Unit" },
                { "A. Stack", "B. Queue", "C. Array", "D. Tree" },
                { "A. O(n)", "B. O(log n)", "C. O(n^2)", "D. O(1)" },
                { "A. Python", "B. Java", "C. C++", "D. Swift" },
                { "A. Hyper Trainer Marking Language", "B. Hyper Text Markup Language", "C. High Text Machine Language",
                        "D. Hyper Tool Multi Language" },
                { "A. Python", "B. Java", "C. HTML", "D. C++" },
                { "A. RAM", "B. CPU", "C. Hard Disk", "D. Keyboard" },
                { "A. Queue", "B. Array", "C. Stack", "D. Linked List" },
                { "A. Random Access Memory", "B. Read Access Memory", "C. Run Access Memory",
                        "D. Rapid Access Memory" },
                { "A. Microsoft", "B. Google", "C. Sun Microsystems", "D. Apple" }
        };

        String[] answerBank = {
                "A",
                "B",
                "B",
                "B",
                "B",
                "C",
                "B",
                "C",
                "A",
                "C"
        };

        System.out.println("Welcome to the quiz!");
        int response = 1;

        while(response == 1){
            score = 0;
            for (int i = 0; i < length; i++) {
            System.out.println(questionBank[i]);
            for (int j = 0; j < optionBank[i].length; j++) {
                System.out.println(optionBank[i][j]);
            }
            System.out.print("Enter your guess: ");
            userInput = scanner.nextLine().toUpperCase();
            if ("ABCD".contains(userInput) && userInput.length() == 1) {
                if (userInput.equals(answerBank[i])) {
                    score += 1;
                }
            }
            else{
                System.out.println("Not a valid choice! Rerun code");
                System.out.println();
                i--;
                continue;
            }
        }
        if(score ==10){
            System.out.printf("Your score was: %d / %d. Perfect Score!!!🔥🏅\n", score, length);
        }
        else if (score>8){
            System.out.printf("Your score was: %d / %d. Outstanding!!🔥\n", score, length);
        }
        else if(score>=5){
            System.out.printf("Your score was: %d / %d. Good job!\n", score, length);
        }
        else{
            System.out.printf("Your score was: %d / %d. Nice try!\n", score, length);
        }

        System.out.println("Try again? (1 = yes, 2 = no)");
        response = scanner.nextInt();
        scanner.nextLine();
        }
        scanner.close();
    }
}
