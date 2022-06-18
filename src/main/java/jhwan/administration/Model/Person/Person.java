package jhwan.administration.Model.Person;

import jhwan.administration.Model.Bank.Transfer.TransferHistory;

public abstract class Person {
    private String name;
    private int age;
    private String telefon;
    private String email;
    private TransferHistory transferHistory;

    protected Person(){
        name = "";
        age = 0;
        telefon = "";
        email = "";
        transferHistory = new TransferHistory();
    }
    protected Person(String name, int age, String telefon, String email){
        this.name = name;
        this.age = age;
        this.telefon = telefon;
        this.email = email;
        transferHistory = new TransferHistory();
    }
    protected Person(String name, int age, String telefon, String email, TransferHistory transferHistory){
        this.name = name;
        this.age = age;
        this.telefon = telefon;
        this.email = email;
        this.transferHistory = transferHistory;
    }

    public String getName() {
        return name;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getEmail() {
        return email;
    }
    public TransferHistory getTransferHistory(){
        return transferHistory;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTransferHistory(TransferHistory transferHistory){
        this.transferHistory = transferHistory;
    }
}
