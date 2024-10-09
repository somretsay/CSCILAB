import java.util.regex.Pattern;
import java.util.*;
public class Motorcycledemo {
    public static void main(String args[]){
        int yr=0;
        String m="";
        Motorcycle demo = new Motorcycle(yr,m);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the year of your Motorcycle(1900-2021)");
        yr = keyboard.nextInt();
        while (yr<1900||yr>2021){
           System.out.println("Enter the year of your Motorcycle(1900-2021)"); 
            yr = keyboard.nextInt();
        }
        demo.setYear(yr);
        demo.getYear();

        System.out.println("Enter the make of your Motorcycle");
        m = keyboard.next();
        demo.setMake(m);
        demo.getMake();
        System.out.println(demo);

        for (int i=0;i<7; i++){
            if(i<4){
                demo.getAcc();
                System.out.println(demo);
            }
            else if(i>3){
                demo.getDec();
                System.out.println(demo);
            }

        }




        
        


    }
}
