
/**
 * Somret Say
 * Lab 6
 * Prompt user to which quiz they would like to take 
 * Generate random number generator per equation 
 * Create method for menu, question, outputting amount of questions answered correctly
 * random integer from 1-10
 * In method for questions, declare correct answers 
 * If statement for whether question is correct or not 
 * method for each type +-* 
 * 
 * */

import java.util.*;

public class Lab {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        choice = menu();
        if (choice == 1) {
            add(choice);
        }
        else if (choice == 2) {
            sub(choice);
        }
        else if (choice == 3) {
            multi(choice);
        }
    }

    /**
     * menu display
     * 
     * @return
     */
    public static int menu() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Addition\n" + "2. Subtraction\n" + "3. Multiplication");
        int choice;
        choice = keyboard.nextInt();
        return choice;

    }

    public static int choice(int choice) {
        Scanner keyboard = new Scanner(System.in);
        while (!keyboard.hasNextInt()) {
            System.out.println("Please enter a number");// input validation
            keyboard.next();
        }
        choice = keyboard.nextInt();
        return choice;

    }

    /**
     * additon
     * if statement for choice
     * if statement for correct answer
     * 
     * @param choice
     * @return
     */
    public static int add(int choice) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int correct = 0;
        int incorrect = 0;
        for (int i = 0; i < 10; i++) {

            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int answer = x + y;
            int userAns;

            // while loop to repeat 10 times
            System.out.println(x + "+" + y + "=");
            userAns = keyboard.nextInt();
            if (userAns == answer) {
                System.out.println("Correct, good job bud!");
                correct = correct + 1;

            } else if (userAns != answer) {
                System.out.println("Sorry bud, next one!");
                incorrect = incorrect + 1;

            }
        }
        System.out.println("You have gotten " + correct + " correct answers and" + incorrect + "answer(s)");
        return correct;
    }

    /**
     * Subtract
     * for loop to repeat 10x
     * change formula for if y is gretaer than x so there are no negative numbers
     * 
     * @param choice
     * @return
     */
    public static int sub(int choice) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int correct = 0;
        int incorrect = 0;

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int answer = x - y;
            int answerTwo = y - x;
            int userAns;
            if (x >= y) {
                System.out.println(x + "-" + y + "=");
                userAns = keyboard.nextInt();
                if (userAns == answer) {
                    System.out.println("Correct, good job bud!");
                    correct = correct + 1;

                } else if (userAns != answer) {
                    System.out.println("Sorry bud, next one!");
                    incorrect = incorrect + 1;
                }
            } 
            else if (y <= x) {
                System.out.println(y + "-" + x + "=");
                userAns = keyboard.nextInt();
                if (userAns == answerTwo) {
                    System.out.println("Correct, good job bud!");
                    correct = correct + 1;

                } else if (userAns != answerTwo) {
                    System.out.println("Sorry bud, next one!");
                    incorrect = incorrect + 1;
                }

            }

        }
        System.out.println("You have gotten" + correct + " correct answer(s) and " + incorrect + "incorrect answers.");
        return choice;

    }

    /**
     * muliplication
     * similar to addition
     * 
     * @param choice
     * @return
     */
    public static int multi(int choice) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int correct = 0;
        int incorrect = 0;
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);

            int answer = x * y;
            int userAns;

            if (choice == 3) {
                // while loop to repeat 10 times
                System.out.println(x + "*" + y + "=");
                userAns = keyboard.nextInt();
                if (userAns == answer) {
                    System.out.println("Correct, good job bud!");
                    correct = correct + 1;

                } else if (userAns != answer) {
                    System.out.println("Sorry bud, next one!");
                    incorrect = incorrect + 1;
                }
            }

        }
        System.out.println("You have have" + correct + " correct answers and" + incorrect + " incorrect answers. ");
        return correct;

    }
}
