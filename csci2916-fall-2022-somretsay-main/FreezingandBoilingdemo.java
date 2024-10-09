import java.util.*;
/*
 * Somret Say 
 * Oct 28 2022
 * 
 * Call Class
 * Set Temp through class in order to run toString 
 * Inputvalidation for temperature 
 * print demo for class
 */
public class FreezingandBoilingdemo {
    public static void main(String[] args){
        FreezingandBoiling demo= new FreezingandBoiling();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a Temperature");
        int temp;
        while(!keyboard.hasNextInt()){
            System.out.println("Enter number");
            keyboard.next();


        }
        temp=keyboard.nextInt();
        demo.settemp(temp);
        demo.gettemp();
        System.out.println(demo);
    }
    
}
