
/** ***********************
* @author Somret Say
* @date: 9/23/2022
* Assignment: Files Operation Menu
*
* Algorithm
* Open, Write what is needed in file, Close file
* Run menu for entirety to run sales and sum
* User has to input how many weeks of sales 
* Program allows user to input sales depending on weeks 
* Display the total based on users input 
* Loop number of sales to create total 
* 
* ***********************/
import java.util.Scanner;
import java.io.*;

public class lab4{
    public static void main(String[] args) throws IOException
    {
        double one = 0;
        int counter = 0; 
        boolean run = true;
        Scanner keyboard = new Scanner(System.in); 
        int weeks = 0;
        int w = 0;    
        while (run == true){ 
            
        
            System.out.println("*** Operations Menu***");
            System.out.println("1. Enter Sales Figures (in File)-must be done first");
            System.out.println("2. Display Sales Figures");
            System.out.println("3. Display Total Sales");
            System.out.println("4. Exit Program");

            int choice;
            double salesFigure;
            choice = keyboard.nextInt();
            //option 1
            if (choice==1){
                PrintWriter outputFile = new  PrintWriter("sales.txt");
                run = true;

                System.out.println("How many weeks of sales figures do you have to enter?");
                weeks = keyboard.nextInt();
            
                //loops for amount of sales user input
                for (int i = 1; i <= weeks; i++){
        
            
                    System.out.print("Enter week " +
                            " "  + i + " sales figure: ");
                    salesFigure = keyboard.nextDouble();

                    outputFile.println(salesFigure);
        
                }
                outputFile.close();
            }
            
                //option 2            
            else if(choice==2){
                run= true;
                
                File file = new File("sales.txt");
                Scanner inputFile = new Scanner(file);
            
                while(inputFile.hasNext()){
                double number = inputFile.nextDouble();
                System.out.println(number);
                


                }
                
                
                
                inputFile.close();



            } 
            //option 3
            else if(choice==3){
                System.out.println("Total Sales");
                File file = new File("sales.txt");
                Scanner inputFile = new Scanner(file);
                
                while(inputFile.hasNext()){
                double number = inputFile.nextDouble();
                one += number;
                counter++;
                if (counter==weeks){
                    System.out.println(one);




                }
                
            
               

                


                }
                inputFile.close();
                 


            }
            else if(choice==4){
                run = false;
                System.out.println("Thanks for using the program");

            }
        }
            
        


    }
}
