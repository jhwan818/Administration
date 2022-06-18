package jhwan.administration.Model.ClassRoom;

import jhwan.administration.Model.Person.Student.Student;

import java.util.ArrayList;

public class ClassRoom {
    private String name;
    private String teacher;
    private ArrayList<Student> students;

    public ClassRoom(){
        this("","",new ArrayList<>());
    }
    public ClassRoom(String name, String teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public String getTeacher() {
        return teacher;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
