package jhwan.administration.Model.Bank.Transfer;

import jhwan.administration.Model.Util.ListTemplate;

import java.util.ArrayList;

public class TransferHistory extends ListTemplate<Transfer> {
    public TransferHistory(){
        this(new ArrayList<>());
    }
    public TransferHistory(ArrayList<Transfer> transferHistory){
        super(transferHistory);
    }
}
