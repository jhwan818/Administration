package jhwan.administration.Model.Person.Teacher;

import jhwan.administration.Model.Bank.Transfer.TransferHistory;
import jhwan.administration.Model.Person.Person;
import jhwan.administration.Model.Person.Student.StudentList;

public class Teacher extends Person {
    private final String id;
    private String classRoom;
    private StudentList students;
    public Teacher(){
        this("",0,"","");
    }
    public Teacher(String name, int age, String telefon, String email){
        this(name, age, telefon, email, new StudentList(), new TransferHistory(), "");
    }
    public Teacher(String name, int age, String telefon, String email, StudentList students, TransferHistory transferHistory, String classRoom){
        super(name, age, telefon, email, transferHistory);
        id = "NOT_MADE";
        this.classRoom = classRoom;
        this.students = students;
    }

    public String getId(){
        return id;
    }
    public String getClassRoom() {
        return classRoom;
    }
    public StudentList getStudents() {
        return students;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
    public void setStudents(StudentList students) {
        this.students = students;
    }
}
