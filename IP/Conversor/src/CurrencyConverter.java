public class CurrencyConverter {
    private static final double USD_EUR = 1.01;
    private static final double EUR_GBP = 0.87;
    private boolean eur, gbp, usd;
    private double money;

    public CurrencyConverter(){
        eur = false;
        gbp = false;
        usd = false;
        money = 0;
    }

    public void setInEuros(double amount){
        if (gbp || usd){
            gbp = false;
            usd = false;
        }
        eur = true;
        money = amount;
    }

    public void setInPounds(double amount){
        if (eur || usd){
            eur = false;
            usd = false;
        }
        gbp = true;
        money = amount;
    }

    public void setInDollars(double amount){
        if (eur || gbp){
            eur = false;
            gbp = false;
        }
        usd = true;
        money = amount;
    }

    public double getInEuros(){
        if (eur){
            return money;
        }
        else if (gbp){
            return money / EUR_GBP;
        }
        else{
            return money * USD_EUR;
        }
    }
}
