package jhwan.administration.Model.Util;

import java.util.ArrayList;

public abstract class ListTemplate<T> {
    private final ArrayList<T> list;

    public ListTemplate(){
        list = new ArrayList<>();
    }
    public ListTemplate(ArrayList<T> list){
        this.list = list;
    }

    public ArrayList<T> getList() {
        return list;
    }
    public T get(int index){
        return list.get(index);
    }

    public void add(T object){
        list.add(object);
    }
    public void remove(int index){
        list.remove(index);
    }
}
