/*
 * _n was _a down the street with his friends. On their way to the _p, 
 * they rain into a _ad _animal. They were all _e ! 
 * Open file
 * read file 
 * read for _
 * Change each _ for specific variable
 * Close file 
 * Print File
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Random;  
public class Lab12 {
    public static void main(String args[])throws IOException{
        File file = new File("madlib.txt");
        Scanner inputFile = new Scanner(file);
        String word = " ";
        String w;
        while(inputFile.hasNext()){
            word = inputFile.nextLine();
            String words[] = word.split(" ");
            for(int i = 0; i < words.length; i++){
                if(words[i].startsWith("_") && words[i].endsWith("n")){
                    words[i] = name() ;
                   
                }
                else if(words[i].startsWith("_") && words[i].endsWith("a")){
                    words[i] = action();
                   
                }
                else if(words[i].startsWith("_") && words[i].endsWith("p")){
                    words[i] = place();
                   
                }
                else if(words[i].startsWith("_") && words[i].endsWith("ad")){
                    words[i] = adjective();
                   
                }
                else if(words[i].startsWith("_") && words[i].endsWith("animal")){
                    words[i] = animal();
                   
                }
                else if(words[i].startsWith("_") && words[i].endsWith("e")){
                    words[i] = emotion();
                   
                }
                System.out.printf(words[i] + " ");
            }
        }
        System.out.println(inputFile);
        inputFile.close();
       
        
    }
        public static String name(){
            String [] name ={"John","Mary","Kalea","AP","Gavin","Justice"};
            Random rand = new Random();
            return name[rand.nextInt(name.length)];
        }
        public static String action(){
            String [] action ={"running","walking","biking","jumping","skipping","dancing"};
            Random rand = new Random();
            return action[rand.nextInt(action.length)];
        }
        public static String place(){
            String [] place ={"school","gas station","chilis","movie theater","playground","zoo"};
            Random rand = new Random();
            return place[rand.nextInt(place.length)];
        }
        public static String adjective(){
            String[] adjective ={"scary","big","small","quiet","ugly","fat"};
            Random rand = new Random();
            return adjective[rand.nextInt(adjective.length)];
        }
        public static String animal(){
            String[] animal ={"shark","monkey","eagle","snake","turtle","tiger"};
            Random rand = new Random();
            return animal[rand.nextInt(animal.length)];
        }
        public static String emotion(){
            String[] emotion ={"scared","happy","excited","sad","surpirsed","unamused"};
            Random rand = new Random();
            return emotion[rand.nextInt(emotion.length)];
        }

}
