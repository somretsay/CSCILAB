import java.util.Scanner;

public class SomretSayBMI {
   /** ***********************
* @author Somret Say
* @date: 9/2/2022
* Assignment: SomretsayBMI
*
* Algorithm
* Ask the user for his/her name
* Asks the user for his/her height in feet and inches
* Converts the height into inches
* Asks the user for his/her weight in pounds.
*  Calculates the BMI (see formula above).
*  Output Name BMI and their category
* Metric system 
*
* ***********************/

    public static void main(String[]args){

        //Introduction to calc;
        System.out.println("This is a Body Mass Index Calculator Program");
        System.out.println("You will be asked for your name, weight in pounds, and height in feet and inches");
        System.out.println("**********************************************");
        
        //Ask user for their name
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.println ("What is your name?");
        name=keyboard.nextLine();
        

        //Asks user his/her height in feet and inches
        float heightf;
        float heighti;

        System.out.println("Enter your height in feet first.");
        heightf=keyboard.nextInt();
        System.out.println("Enter you height then by inches. ");
        heighti=keyboard.nextInt();
    

        //Converts the height into inches
        float height;
       height=((heightf*12)+(heighti));

        

        //Asks the user for his/her weight in pounds 
        float weight;
        System.out.println("What is your weight in pounds?");
        weight=keyboard.nextFloat();

        //Calculates BMI
        float BMI;
        BMI=(703*(weight/(height*height)));
        
        //Outputs name, BMI and category
        String category = "";
        
        if (BMI < 19) {
                category="Underweight";

                
            }
            else if(BMI >= 19 && BMI <=25  ){

                category="Healthy";
            }
            else if (BMI >=25 && BMI <=30){

                category="Overweight";
            }
            else if (BMI > 30) {
                category="Obese";
            }

            

        System.out.println("Hi "+name +" your BMI is " + BMI +" which means you are " + category );

        //Metric system conversion 
        



}
}
