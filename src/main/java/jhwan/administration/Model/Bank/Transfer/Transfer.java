package jhwan.administration.Model.Bank.Transfer;

import java.util.Date;

public class Transfer {
    private final String id;
    private String emissor;
    private String receptor;
    private String money;
    private String description;
    private String category;
    private Date date;

    public Transfer(){
        this("","","","","", new Date());
    }
    public Transfer(String emissor, String receptor, String money, String description, String category, Date date){
        id = "NOT_MADE";
        this.emissor = emissor;
        this.receptor = receptor;
        this.money = money;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public String getEmissor() {
        return emissor;
    }
    public String getReceptor() {
        return receptor;
    }
    public String getMoney() {
        return money;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Date getDate(){
        return date;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDate(Date date){
        this.date = date;
    }
}
