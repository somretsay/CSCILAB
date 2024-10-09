
/** ***********************
* @author Somret Say
* @date: 9/16/2022
* Assignment: Encryption
*
* Algorithm
* Ask user for secret message
* Determine shift number by user
* Encrypt code by shifting number
* Loop for nonspecial characters only 
* Condition code to run the table for lowercase letters and uppercase
* Display encrypted code
* ***********************/

import java.util.*;

public class labthree {

    public static void main(String args[]) {
    
        //secret message
        String code;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your secret message?");
        code = keyboard.nextLine();
        
       
        
        System.out.println("What will be your shifting key?");
        int codeNumber;
        codeNumber = keyboard.nextInt();
        int shift = codeNumber;
        int newNumber;
        char letter;
        int counter=0;
       
        while(counter<=code.length()){
            letter = code.charAt(counter);
            if(letter<64 || (letter < 97 && letter > 90) ) 
            {
                
            }
            //check if uppercase
            else if(letter>64  && letter < 91){

                letter += shift;

                if(letter >90){

                    newNumber=letter %90; //calculates how much more the number is passed 90
                    letter=64;
                    letter+=newNumber;


                }
            }
            else if( letter>96 && letter<123){
    
            letter += shift;
            

            if (letter >122){
                newNumber=letter %122; //calculates how much more the number is passed 90
                letter=96;
                letter+=newNumber;

            }


            }
        
            System.out.printf("%c", letter);
            counter++;

     }



    }

        
        
        

        

}
        
    

