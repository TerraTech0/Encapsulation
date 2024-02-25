import org.w3c.dom.ls.LSOutput;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    Account(){

    }
    Account(String id, String name){

    }
    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public int credit(int amount){
        amount = balance;
        return amount;
    }
    public int debit(int amount){
        return amount - balance;
    }
    public int transferTo(int amount, Account another){
            balance-= amount;
            another.balance += amount;


        return amount;
    }
    public String toString() {

        return " " ;
    }


}

