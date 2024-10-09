/**
 * Motorcycle
 * 
 * -year int
 * -make string
 * -speed int
 * 
 * +Motorcycle(yr:int,  )
 * +setYear(yr:int) :void
 * +setSpeed(spd:int) :void
 * +setMake(make:string):void
 * +getMake():String
 * +getYear():int
 * +getSpeed():int
 * +toString():String
 * +getAcc():int
 * +getDec():int
 */
public class Motorcycle {
    private int year;
    private String make;
    private int speed;


public Motorcycle(int yr,String m){
    year=yr;
    make=m;
    speed=0;
    
    

}
public Motorcycle(){
    speed=0;
    make="";
    year=0;
}
    public void setYear(int yr){
year=yr;
    }
    public void setSpeed(int spd){
speed=spd;
    }
    public void setMake(String m){
make=m;
    }
    public int getYear(){
        return year;
    }
    public int getSpeed(){
        return speed;
    }
    public String getMake(){
        return make;
    }
    public int getAcc(){
        speed+=5;
        return speed;
    }
    public int getDec(){
        speed-=5;
        return speed;
    }
    public String toString(){
        return "A" + year + " "+ make + "going"+ speed+ "miles per hour.";
    }
    


}

