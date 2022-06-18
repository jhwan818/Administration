package jhwan.administration.Model.Bank;

import jhwan.administration.Model.Bank.Transfer.TransferHistory;

public class Bank {
    private TransferHistory transferHistory;

    public Bank(){
        this(new TransferHistory());
    }
    public Bank(TransferHistory transferHistory) {
        this.transferHistory = transferHistory;
    }

    public TransferHistory getTransferHistory() {
        return transferHistory;
    }

    public void setTransferHistory(TransferHistory transferHistory) {
        this.transferHistory = transferHistory;
    }
}
