public class Main {
    public static void main(String[] args){
        Diet d = new Diet();
        System.out.println( d.getBalance());
// 0 (int)
        System.out.println( d.getEatTimes());
// 0 (int)
        d.eat(50);
        d.eat(75);
        System.out.println( d.getEatTimes());
// 2 (int)
        System.out.println( d.getBurnTimes());
// 0 (int)
        d.burn(20);
        System.out.println( d.getBalance());
// 105 (int)
        d.eat(75);
        d.eat(100);
        d.burn(40);
        d.burn(30);
        System.out.println( d.getBalance());
// 210 (int)
        System.out.println( d.getEatTimes());
// 4 (int)
        System.out.println( d.getBurnTimes());
// 3 (int)
        System.out.println( d.averageEatenCalories());
// 75.0 (double)
        System.out.println( d.averageBurntCalories());
// 30.0 (double)
        System.out.println( d.isBalanceNegative());
// false (boolean)
    }
}
