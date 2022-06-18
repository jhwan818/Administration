package jhwan.administration.Model.Supply;

public class Supply {
    private String name;
    private double pay;

    public Supply(){
        this("",0);
    }
    public Supply(String name, double pay){
        this.name = name;
        this.pay = pay;
    }
}
