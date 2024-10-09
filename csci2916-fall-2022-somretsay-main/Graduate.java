public class Graduate extends Student {
private String fieldOfStudy;
private int numberOfCredits;
    public Graduate(String name, String number, String email,String fieldofStudy,int numberOfCredits) {
        super(name, number, email);
        this.fieldOfStudy=fieldofStudy;
        this.numberOfCredits=numberOfCredits;
    }
    public String getFieldofStudy() {
        return fieldOfStudy;
    }

    public void setFieldofStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public int getnNumOfCredits() {
        return numberOfCredits;
    }

    public void setnumofcredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    @Override
    public String toString() {
        return  "Student name: " + super.getName()+ " \nStudents Phone Number: " + super.getNumber() + " \nStudents Email:"  + super.getEmail() + " \nStudents Field of Study: " + fieldOfStudy+" \n Required Credits:"+ numberOfCredits;
        
        
    }
    
}
