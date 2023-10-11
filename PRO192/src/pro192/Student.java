package pro192;

public class Student extends Person{
    protected String major;
    
    public Student(String name, String email, String birthYear, String gender, String phoneNumber, String address, String major){
        super(name, email, birthYear, gender, phoneNumber, address);
        this.major = major;
    }

    @Override
    public void display(){
        System.out.println("\tName: " + this.name);
        System.out.println("\tMajor: " + this.major);
    }

}