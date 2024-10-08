public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(){
        balance = 0;
    }
    public Account(String i, String n){
        id=i;
        name=n;
    }
    public Account(String i, String n, int ba){
        id=i;
        name=n;
        balance=ba;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount){
        balance+=amount;
        return balance;
    }
    public int debit(int amount){
        if (balance-amount>=0){
            balance = balance-amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (balance-amount>=0){
            debit(amount);
            another.credit(amount);
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account [id ="+ id +", name ="+ name +", balance = "+balance+"]";
    }
}
