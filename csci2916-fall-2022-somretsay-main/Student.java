/**
 * name 
 * number
 * email 
 * 
 * Student()
 * Student(n,num,e)
 * 
 * +getname()
 * +setname():String
 * +getnumber()
 * +setnumber():String
 * +getemail()
 * +setemail():String
 * 
 * Undergraduate
 * -major:String
 * -numGen:int
 * -numMaj:int
 * Undergraduate(n,num,e,gen,maj)
 * 
 * Graduate
 * -fieldOfStudy:String
 * -numofCredits
 * +graduate(n,num,e,foS,c)
 */
public class Student {
    private String name;
    private String number;
    private String email;
   

    public Student(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
