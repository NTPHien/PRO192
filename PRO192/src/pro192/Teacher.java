package pro192;
import java.util.ArrayList;

public class Teacher extends Person{
    protected  ArrayList<String> subjects;
    
    public Teacher(String name, String email, String birthYear, String gender, String phoneNumber, String address, ArrayList<String> subjects){
        super(name, email, birthYear, gender, phoneNumber, address);
        this.subjects= subjects;
    }

    public ArrayList<String> getSubjects(){
        return subjects;
    }
    public void setSubjects(ArrayList<String> subjects){
           this.subjects = subjects();
    }
    
    @Override
    public void display(){
        System.out.println("\tName: " + this.name);
        System.out.println("\tSubjects: " + this.subjects);
    }

    private ArrayList<String> subjects() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
    public void search(String email){
        if (email.equals(this.email)) {
            System.out.println("Found by email :");
            display();
        } else {
            System.out.println("Not found by email");
        }
    }
    
    public void search(ArrayList<String> subjects){
        if (subjects.containsAll(this.subjects)) {
            System.out.println("FOund by subject");
            display();
        } else {
            System.out.println("Not found by subject");
        }
    }
}
