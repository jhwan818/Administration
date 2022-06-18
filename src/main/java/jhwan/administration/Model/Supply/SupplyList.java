package jhwan.administration.Model.Supply;

import jhwan.administration.Model.Util.ListTemplate;

import java.util.ArrayList;

public class SupplyList extends ListTemplate<Supply> {
    public SupplyList(){
        this(new ArrayList<>(), false);
    }
    public SupplyList(ArrayList<Supply> supplies, Boolean payBack){
        super(supplies);
    }
}
