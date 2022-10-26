public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1000);
        System.out.println(ba1.getBalance());
// 1000
        ba1.withdraw(1500);
        System.out.println(ba1.getBalance());
// 800
        System.out.println(ba1.computeInterest());
// 8
        ba1.applyInterest();
        System.out.println(ba1.getBalance());
// 808
    }
}