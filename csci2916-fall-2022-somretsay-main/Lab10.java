/**
 * Somret Say 
 * Nov 4 2022
 * 
 * Create an Array with my favorite foods
 * Create an array for the prices
 * MEthod displaying the foods
 * Method displaying the food and price
 * Method for their sum
 * Method for average
 * Random generator for Name array 
 * Print the random name
 */
public class Lab10 {
    public static void main(String args[]){
        String [] foodArray = {"Ham","Lasgana","Mashed Potatoes","Corn","Pumpkin Pie"};
        Double [] priceArray ={25.95,15.99,6.99,6.99,11.95};
        showFood(foodArray);
        showPrice(foodArray, priceArray);
        sumPrice(priceArray);
        avgPrice(priceArray);
        ranFood(foodArray);


    }
    public static void showFood(String[] foodArrayString){
        System.out.println("My Favoirte Thanksgiving Foods are");
        for (int index=0;index<foodArrayString.length;index++){
            System.out.println(foodArrayString[index]);

        }

    }
    public static void showPrice(String[] foodArrayString, Double[] priceArrayDouble){
        System.out.println("Favorite Thanksgiving Foods and Prices");
        for (int index=0;index<foodArrayString.length;index++){
            System.out.println(foodArrayString[index]+"      "+priceArrayDouble[index]);

        }
    }
    public static double sumPrice(Double[] priceArrayDoubles){
        double sum=0;
        for(int index=0;index<priceArrayDoubles.length;index++){
            sum =sum+priceArrayDoubles[index];
        }
        System.out.println("If I were to buy all of the Thanksgiving food, it would cost me " + sum);

        return sum;
    }
    public static double avgPrice(Double[] priceArrayDoubles){
        double avg=0;
        double sum=0;
        for(int index=0;index<priceArrayDoubles.length;index++){
            sum=sum+priceArrayDoubles[index];
            avg =sum/5;
        }
        System.out.println("Average cost of the foods are:");
        System.out.printf("%.2f" ,avg);

        return avg;
    }
    public static String ranFood(String[] foodArrayStrings){
        var randomItem = foodArrayStrings[(int) Math.floor(Math.random()*foodArrayStrings.length)];
        System.out.println("Random Food: "+randomItem);
        return randomItem;
        
   }
   

}
