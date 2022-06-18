package jhwan.administration.Model.Person.Teacher;

import jhwan.administration.Model.Util.ListTemplate;

import java.util.ArrayList;

public class TeacherList extends ListTemplate<Teacher> {
    public TeacherList(){
        this(new ArrayList<>());
    }
    public TeacherList(ArrayList<Teacher> teachers){
        super(teachers);
    }
}
