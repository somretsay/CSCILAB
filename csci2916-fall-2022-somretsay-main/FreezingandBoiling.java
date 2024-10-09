/*
 * FreezingandBoiling

-Int temp

-Boolean point

+freezingandboiling(int temp, boolean point) 
+freezingandboiling()
+gettemp(int:t)void
+isEthylFreezing()):boolean
+isEthylBoiling():boolean
+isOxygenFreeezing():boolean
+isOxygenBoilding():boolean
+isWaterFreezing():boolean
+isWaterBoiling():boolean
+toString():String

 */
public class FreezingandBoiling {
    private int temp;

    public FreezingandBoiling(int t){
        temp=t;
        

    }
    public FreezingandBoiling(){
        
        
    }
    public void settemp(int t){
        temp=t;
    }
    public int gettemp(){
        return temp;
    }
    
    public boolean isEthylFreezing(){
       
        return temp<=-173;

    }
    public boolean isEthylBoiling(){
       
        return temp>=172;

    }
    public boolean isOxygenFreeezing(){
       
        return temp<=-362;
    }
    public boolean isOxygenBoiling(){
       
        return temp>=306;
    }
    public boolean isWaterFreezing(){
        
        return temp<=32;
    }
    public boolean isWaterBoiling(){
        
        return temp>=212;
    }
    public String toString(){
        if (isEthylFreezing()==true){
            System.out.println("Ethyl will freeze");
        }
        if(isEthylBoiling()==true){
            System.out.println("Ethyl will boil");
        }
        if(isOxygenBoiling()==true){
            System.out.println("Oxygen will Boil");
        }
        if(isOxygenFreeezing()==true){
            System.out.println("Oxygen will freeze");
        }
        if(isWaterFreezing()==true){
            System.out.println("Water will freeze");
        }
        if(isWaterBoiling()==true){
            System.out.println("Water will boil");
        }
        return"";
    }


}
