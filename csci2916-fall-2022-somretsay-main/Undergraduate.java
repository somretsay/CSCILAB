public class Undergraduate extends Student {
    private String major;
    private int numOfGenEdCredits;
    private int numOfMajorClasses;

    public Undergraduate(String name, String number, String email, String major, int numOfGenEdCredits, int numOfMajorClasses ) {
        super(name, number, email);
        this.major=major;
        this.numOfGenEdCredits=numOfGenEdCredits;
        this.numOfMajorClasses=numOfMajorClasses;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public int getGenEd(){
        return numOfGenEdCredits;
    }
    public void setGenEd(int numOfGenEdCredits){
        this.numOfGenEdCredits=numOfGenEdCredits;
    }
    public int getMajorClasses(){
        return numOfMajorClasses;
    }
    public void setMajorClasses(int numOfMajorClasses){
        this.numOfMajorClasses=numOfMajorClasses;
    }
    @Override
    public String toString() {
        return  "Student name: " + super.getName()+ " \nStudents Phone Number: " + super.getNumber() + " \nStudents Email:"  + super.getEmail() + " \nStudents Major: " + major+" \n Required GenEd Credits:"+ numOfGenEdCredits + "\n Required Major Credits:" +numOfMajorClasses;
        
        
    }

    
}
