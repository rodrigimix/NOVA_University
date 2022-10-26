public class Bank {
    private int balance;
    public Bank(int amount){
        balance = amount;
    };
    public Bank(){
        balance = 0;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public boolean isInRedZone(){
        return balance < 0;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public int getBalance(){
        return balance;
    }
}
