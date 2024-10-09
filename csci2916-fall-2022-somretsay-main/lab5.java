/**
 * Somret Say
 * Lab 5
 * Conversion
 * Display Menu
 * Ask user which currency they would like to convert
 * Create a method for every conversion 
 * Use at least one returning value
 *  
 */
import java.util.*;
public class lab5 {

    public static void main(String[] args){
    
    boolean run = true;
    double dollars=0;
    
    while (run ==true){
     System.out.println("1.Convert to Japanese Yen");
    System.out.println("2. Convert to Canadian Dollar");
    System.out.println("3. Convert to Thai Baht");
    System.out.println("4.Exit program");
    System.out.println("Select the converstion (1-4)");
    int choice = 0;
    choice = choice(choice);
    
    

    if (choice ==1){
        

        yen();
    }
    else if(choice==2){
       
        canadianDollar();


    }
    else if(choice==3){
        
        thaiBaht();
    }
    else if(choice==4){

        run=false;
        System.out.println("Thank you for using this program");
    }
    
    }
    


    }


    public static int choice(int choice){
        Scanner keyboard = new Scanner(System.in);
        while(!keyboard.hasNextInt()){
            System.out.println("Please enter a number");//input validation
            keyboard.next();
        }
        choice = keyboard.nextInt();
        return choice;


    }
    public static void yen(){
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the number of US dollars you would like to convert");
            while(!keyboard.hasNextInt()){
                System.out.println("Please enter a number");//input validation
                keyboard.next();
            }
            double dollars = keyboard.nextDouble();
            while(dollars<=0){
                System.out.println("Please enter postive number");
                dollars = keyboard.nextInt();
            }
            double yen=dollars*144.38;
            System.out.println(dollars+"US dollars:" + yen +" Japanese Yen");
        
        
     }
    public static void canadianDollar(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of US dollars you would like to convert");
        while(!keyboard.hasNextInt()){
            System.out.println("Please enter a number");//input validation
            keyboard.next();
        }
        double dollars = keyboard.nextDouble();
        while(dollars<=0){
            System.out.println("Please enter postive number");
            dollars = keyboard.nextInt();
        }
        double canadianDollar=dollars*1.37;
        System.out.println(dollars+"US dollars:" +  canadianDollar+" Canadian Dollars");
    
    

    }
    public static void thaiBaht(){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of US dollars you would like to convert");
        while(!keyboard.hasNextInt()){
            System.out.println("Please enter a number");//input validation
            keyboard.next();
        }
        double dollars = keyboard.nextDouble();
        while(dollars<=0){
            System.out.println("Please enter postive number");
            dollars = keyboard.nextInt();
        }
        double thaiBaht=dollars*37.81;
        System.out.println(dollars+"US dollars:" +  thaiBaht+" Thai Baht");
    
    

    }
       
        











    



}

