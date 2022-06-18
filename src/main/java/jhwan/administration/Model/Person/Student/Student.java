package jhwan.administration.Model.Person.Student;

import jhwan.administration.Model.Bank.Transfer.TransferHistory;
import jhwan.administration.Model.Person.Person;

public class Student extends Person {
    private final String id;
    private String classRoom;
    private String teacher;
    public Student(){
        this("",0,"","");
    }
    public Student(String name, int age, String telefon, String email){
        this(name, age, telefon, email, new TransferHistory(), "", "");
    }
    public Student(String name, int age, String telefon, String email, TransferHistory transferHistory, String classRoom, String teacher){
        super(name, age, telefon, email, transferHistory);
        id = "NOT_MADE";
        this.classRoom = classRoom;
        this.teacher = teacher;
    }

    public String getId(){
        return id;
    }
    public String getClassRoom() {
        return classRoom;
    }
    public String getTeacher() {
        return teacher;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
