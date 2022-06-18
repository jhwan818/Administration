package jhwan.administration.Model.Person.Student;

import jhwan.administration.Model.Util.ListTemplate;

import java.util.ArrayList;

public class StudentList extends ListTemplate<Student> {
    public StudentList(){
        this(new ArrayList<>());
    }
    public StudentList(ArrayList<Student> students){
        super(students);
    }
}
