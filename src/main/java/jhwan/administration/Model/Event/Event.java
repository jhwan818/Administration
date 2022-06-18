package jhwan.administration.Model.Event;

import java.util.Date;

public class Event {
    private final String id;
    private String name;
    private Date date;
    private String description;

    public Event(){
        this("", new Date(), "");
    }
    public Event(String name, Date date, String description) {
        this.id = "NOT_MADE";
        this.name = name;
        this.date = date;
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
