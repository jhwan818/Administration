package jhwan.administration.Model.Supply;

import java.util.Date;

public class Receipt {
    private final String id;
    private String name;
    private Date date;
    private SupplyList supplyList;
    private String consumer;

    public Receipt(){
        this("", new Date(), new SupplyList(), "");
    }

    public Receipt(String name, Date date, SupplyList supplyList, String consumer) {
        id = "NOT_MADE";
        this.name = name;
        this.date = date;
        this.supplyList = supplyList;
        this.consumer = consumer;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public SupplyList getSupplyList() {
        return supplyList;
    }
    public String getConsumer() {
        return consumer;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setSupplyList(SupplyList supplyList) {
        this.supplyList = supplyList;
    }
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
