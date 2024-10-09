
/** ***********************
* @author Somret Say
* @date: 9/9/2022
* Assignment: Fish
*
* Algorithm
* Ask the user for fish.
* Randomly select a fish from list.
* Compare the computer choice to user choice.
* If computer choice equal user choice, add. 
* Display number of correct guesses
* ***********************/
import java.util.*;

public class labtwo {
    public static void main(String args[]) {
        //LOOP
        int correct=0;
        String fish1=" ";
        Scanner keyboard = new Scanner(System.in);

    for(int i=1;i<=10;i++){  
        System.out.println("I'm thinking of fish.");

        Random random = new Random();
        int x = random.nextInt(4);

        String computerGuess = " ";
        if (x == 0) {
            computerGuess = "AHI";
            

        } else if (x == 1) {

            computerGuess = "OPAH";
        } else if (x == 2) {

            computerGuess = "MAHIMAHI";
        } else if (x == 3) {

            computerGuess = "ONO";
        }

        // Guess 1
        System.out.println("Is it Ahi , Opah, Mahimahi, Ono?");
        
        
        
        {
            
            fish1 = keyboard.nextLine();
            String upperFish=fish1.toUpperCase();
            if (upperFish.equals(computerGuess)) {
                correct += 1;

            } 
            System.out.println("You selected " + upperFish);
            System.out.println("The computer chose " + computerGuess);

            
            }
            
            
    }  
    System.out.println("You have made " + correct + " correct guesses");
}
}
