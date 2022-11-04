public class Decathlon {

    private static final double CEM_A = 25.4347, CEM_B = 18.00, CEM_C = 1.81;
    private static final double QUATRO_A = 1.53775, QUATRO_B = 82.00, QUATRO_C = 1.81;
    private static final double MILQUINHENHROS_A = 0.03768, MILQUINHENHROS_B = 480.00, MILQUINHENHROS_C = 1.85;
    private static final double CEMDEZ_A = 5.74352, CEMDEZ_B = 28.50, CEMDEZ_C = 1.92;
    private static final double HJ_A = 0.8465, HJ_B = 75.00, HJ_C = 1.42;
    private static final double PV_A = 0.2797, PV_B = 100.00, PV_C = 1.35;
    private static final double LJ_A = 0.14354, LJ_B = 220.00, LJ_C = 1.40;
    private static final double S_A = 51.39, S_B = 1.50, S_C = 1.05;
    private static final double D_A = 12.91, D_B = 4.00, D_C = 1.10;
    private static final double J_A = 10.14, J_B = 7.00, J_C = 1.08;

    private double points;

    public Decathlon(){
        points = 0;
    }

    public int getPoints(){
        return Math.toIntExact(Math.round(points));
    }

    public void set100Meters(double t){
        if (t > 0){
            points += CEM_A * Math.pow((CEM_B - t), CEM_C);
        }
    }

    public void set400Meters(double t){
        if (t > 0){
            points += QUATRO_A * Math.pow((QUATRO_B - t), QUATRO_C);
        }
    }

    public void set1500Meters(double t){
        if (t > 0){
            points += MILQUINHENHROS_A * Math.pow((MILQUINHENHROS_B - t), MILQUINHENHROS_C);
        }
    }

}