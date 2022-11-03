public class Diet {
    private int calories, eat_time, burn_time, balance;
    public Diet(){
        calories = 0; //Total
        eat_time = 0;
        burn_time = 0;
        balance = 0;
    }

    public void eat(int c){
        if (c > 0){
            balance += c;
            calories += c;
            eat_time++;
        }
    }

    public void burn(int c){
        if (c > 0){
            balance -= c;
            burn_time++;
        }
    }

    public int getEatTimes(){
        return eat_time;
    }

    public int getBurnTimes(){
        return burn_time;
    }

    public int getBalance(){
        return balance;
    }

    public boolean isBalanceNegative(){
        return balance < 0;
    }

    public double averageEatenCalories(){
        if (this.getEatTimes() > 0) {
            return Math.toIntExact(Math.round(calories / eat_time));
        }
        return 0;
    }

    public double averageBurntCalories(){
        if (this.getBurnTimes() > 0) {
            return Math.toIntExact(Math.round((calories - balance)/burn_time));
        }
        return 0;
    }
}
