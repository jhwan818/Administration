package jhwan.administration.Model.Event;

import jhwan.administration.Model.Util.ListTemplate;

import java.util.ArrayList;

public class EventList extends ListTemplate<Event> {

    public EventList(){
        this(new ArrayList<>());
    }
    public EventList(ArrayList<Event> events){
        super(events);
    }
}
