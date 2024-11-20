package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    private static Scanner input = new Scanner(System.in);
    private static SecureRandom randomNumbers = new SecureRandom();
    static int randomValue;
    static int randomValue2;
    static int userMyInput;

    public static void main(String[] args) {
        String prompt = """
                Welcome to the application of multiplication
                """;
        System.out.println(prompt);
        newQuestions();
        userMyInput = input.nextInt();
        int totalRandomValue = randomValue * randomValue2;
        answerToQuestion(userMyInput, totalRandomValue);
    }

    public static void newQuestions() {
        randomValue = 1 + randomNumbers.nextInt(9);
        randomValue2 = 1 + randomNumbers.nextInt(9);
        System.out.println("How much is " + randomValue + " times " + randomValue2 + " ?");
        userMyInput = input.nextInt();
        answerToQuestion(userMyInput, randomValue * randomValue2);
    }

    public static void answerToQuestion(int userInput, int totalRandomValues) {
        if (userInput == totalRandomValues) {
            System.out.println("Good work!");
            newQuestions();
        } else {
            System.out.println("Try again");
            userInput = input.nextInt();
            answerToQuestion(userInput, randomValue * randomValue2);
        }
    }
}
