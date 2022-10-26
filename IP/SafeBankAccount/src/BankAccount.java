public class BankAccount {
    private static final int FINE = 200;
    private static final int OPT1 = 2000;
    private static final int OPT2 = 1000;
    private static final double T1 = 0.01;
    private static final double T2 = 0.02;
    private static final double T3 = 0.03;

    private int balance;
    public BankAccount(int amount){
        balance = amount;
    }
    public BankAccount(){
        balance = 0;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public boolean isInRedZone(){
        return balance < 0;
    }
    public void withdraw(int amount){
        if (amount > balance){
            balance -= FINE;
        }
        else{
            balance -= amount;
        }
    }
    public int getBalance(){
        return balance;
    }

    public int computeInterest(){
        double interestRate;
        if (balance <= OPT1){
            interestRate = T1;
        }
        else {
            if (balance <= OPT2){
                interestRate = T2;
            }
            else {
                interestRate = T3;
            }
        }
        return Math.toIntExact(Math.round(balance * interestRate));
    }
    public void applyInterest(){
        balance += this.computeInterest();
    }
}
