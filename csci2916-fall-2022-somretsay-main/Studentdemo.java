import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Studentdemo {
    public static void main (String args[]){
    String n="";
    String num="";
    String e="";
    String m="";
    String foS="";
    int numMajor=0;
    int numGen=0;
    int numOfCredits=0;
    boolean repeat = true;
    Scanner keyboard = new Scanner(System.in);
    Undergraduate undergrad = new Undergraduate(n, num, e, m, numGen, numMajor);
    /**
     * Asks user for their information
     * User inputs information
     * Information gets sent back to class to toString
     */
    System.out.println("What is the name of the graduate student?");
    n=keyboard.nextLine();
    undergrad.setName(n);

    System.out.println("What is their phone number ((###)###-####)");
    String numPat="[(]{1}[1-9]{1}[0-9]{2}[)]{1}[0-9]{3}[-]{1}[0-9]{4}";
    num=keyboard.nextLine();
    while(repeat){
        if(Pattern.matches(numPat, num)){
            repeat=false;
            undergrad.setNumber(num);
        }
                    else{
                        System.out.println("Invalid entry, Enter your Phone number in the following format (###)###-####");
                        num = keyboard.nextLine();
                        }
                }
    
    
    System.out.println("what is their email address?");
    e=keyboard.nextLine();
    undergrad.setEmail(e);

    System.out.println("What is their major?");
    m=keyboard.nextLine();
    undergrad.setMajor(m);

    System.out.println("How many general education credit hours are required for this degree?");
    numGen=keyboard.nextInt();
    undergrad.setGenEd(numGen);

    System.out.println("How many required major credits are required?");
    numMajor=keyboard.nextInt();
    undergrad.setMajorClasses(numMajor);

    keyboard.nextLine();
    System.out.println(undergrad);

    Graduate grad = new Graduate(n, num, e, foS, numOfCredits);
    System.out.println("What is the name of the graduate student?");
    n=keyboard.nextLine();
    grad.setName(n);

    System.out.println("What is their phone number ((###)###-####)");
    num=keyboard.nextLine();
    grad.setNumber(num);

    System.out.println("what is their email address?");
    e=keyboard.nextLine();
    grad.setEmail(e);

    System.out.println("What is their field of study?");
    foS=keyboard.nextLine();
    grad.setFieldofStudy(foS);

    System.out.println("How many credit hours are required for this degree(enter number)?");
    numOfCredits=keyboard.nextInt();
    grad.setnumofcredits(numOfCredits);

    System.out.println(grad);





    

    }
    
}
