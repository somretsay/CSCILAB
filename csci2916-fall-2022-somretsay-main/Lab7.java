/*
Somret Say
Lab 7
User input for 
Use rejex to make sure userinput is valid and fits the formatting
Output the user input at the end
 */ 
import java.util.*;
import java.util.regex.Pattern;
public class Lab7 {
    public static void main(String[] args){
       String name=number1();
       String id=number2();
       String phoneNum=number3();
       String birthDate=number4();
       
    output(name,id,phoneNum,birthDate);
       
    }
    public static String number1(){
        Scanner Keyboard = new Scanner(System.in);
        boolean repeat = true;
        String name=" ";
        System.out.println("Enter your first name alpha (A-Z) only");
        name= Keyboard.nextLine();
        String namePat="[A-Za-z]{1,11}";
        while(repeat){
        if(Pattern.matches(namePat, name)){
            repeat=false;
                    }
                    else{
                        System.out.println("Enter your first name with only alpha (A-Z) only");
                        name= Keyboard.nextLine();
                    }
                }
        return name;
    }
    public static String number2(){
        Scanner Keyboard = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("Enter your student id starting with @");
        String idPat="[@]{1}[0-9]{9}";
        String id=" ";
        id = Keyboard.nextLine();
        while(repeat){
        if(Pattern.matches(idPat, id)){
            repeat=false;
                    }
                    else{
                        System.out.println("Invalid entry Enter your studentID in the following format @######### ");
                        id = Keyboard.nextLine();
                    }
                }
         return id;

    }
    public static String number3(){
        Scanner Keyboard = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("Enter your phone number (###)###-####");
        String numberpat="[(]{1}[1-9]{1}[0-9]{2}[)]{1}[0-9]{3}[-]{1}[0-9]{4}";
        String phoneNum=" ";
        phoneNum = Keyboard.nextLine();
        while(repeat){
        if(Pattern.matches(numberpat, phoneNum)){
            repeat=false;
                    }
                    else{
                        System.out.println("Invalid entry, Enter your Phone number in the following format (###)###-####");
                        phoneNum = Keyboard.nextLine();
                    }
                }
         return phoneNum;
    }
    public static String number4(){
        Scanner Keyboard = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("Enter your date of birth ##/##/####");
        String birthdaypat="^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
        String birthDate=" ";
        birthDate = Keyboard.nextLine();
        while(repeat){
        if(Pattern.matches(birthdaypat, birthDate)){
            repeat=false;
                    }
                    else{
                        System.out.println("Invalid entry, Enter your birthday in the following format (##/##/####)");
                        birthDate = Keyboard.nextLine();
                    }
                }
        return birthDate;
    }

    public static String output(String name,String id,String phoneNum,String birthDate){
        System.out.println("Name:"+ name+ " ID: "+id+  "Phone: "+phoneNum +  "Birthday: "+ birthDate);

return name;
    }
}
