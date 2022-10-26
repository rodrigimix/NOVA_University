public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        System.out.println(b1.getBalance());
// 2000
        b1.deposit(2);
        b1.deposit(8);
        System.out.println(b1.isInRedZone());
// false
        System.out.println(b1.getBalance());
// 2010
        b1.withdraw(3000);
        System.out.println(b1.getBalance());
// -990
        System.out.println(b1.isInRedZone());
// true;
    }
}