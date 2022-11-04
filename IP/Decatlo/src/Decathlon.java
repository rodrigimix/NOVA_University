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

    private double m100, m400, m1500, m110, shot, discuss, javelin;
    private int HJ, LJ, PVJ;

    public Decathlon(){
        m100 = 0;
        m400 = 0;
        m1500 = 0;
        m110 = 0;
        shot = 0;
        discuss = 0;
        javelin = 0;
        HJ = 0;
        LJ = 0;
        PVJ = 0;
    }

    public int getPoints(){
        return Math.toIntExact(Math.round(m100+m400+m1500+m110+shot+discuss+javelin+HJ+LJ+PVJ));
    }

    public void set100Meters(double t){
        if (t > 0){
            m100 = CEM_A * Math.pow((CEM_B - t), CEM_C);
        }
    }

    public void set400Meters(double t){
        if (t > 0){
            m400 = QUATRO_A * Math.pow((QUATRO_B - t), QUATRO_C);
        }
    }

    public void set1500Meters(double t){
        if (t > 0){
            m1500 = MILQUINHENHROS_A * Math.pow((MILQUINHENHROS_B - t), MILQUINHENHROS_C);
        }
    }

    public void set110MetersHurdles(double t){
        if (t > 0){
            m110 = CEMDEZ_A * Math.pow((CEMDEZ_B - t), CEMDEZ_C);
        }
    }

    public void setHighJump(int m){
        if (m > 0){
            HJ = Math.toIntExact(Math.round(HJ_A * Math.pow((m - HJ_B), HJ_C)));
        }
    }

    public void setLongJump(int m){
        if (m > 0){
            LJ = Math.toIntExact(Math.round(LJ_A * Math.pow((m - LJ_B), LJ_C)));
        }
    }

    public void setPoleVaultJump(int m){
        if (m > 0){
            PVJ = Math.toIntExact(Math.round(PV_A * Math.pow((m - PV_B), PV_C)));
        }
    }

    public void setShot(double d){
        if (d > 0){
            shot = S_A * Math.pow((d - S_B), S_C);
        }
    }

    public void setDiscus(double d){
        if (d > 0){
            discuss = D_A * Math.pow((d - D_B), D_C);
        }
    }

    public void setJavelin(double d){
        if (d > 0){
            javelin = J_A * Math.pow((d - J_B), J_C);
        }
    }

    public void reset(){
        m100 = 0;
        m400 = 0;
        m1500 = 0;
        m110 = 0;
        shot = 0;
        discuss = 0;
        javelin = 0;
        HJ = 0;
        LJ = 0;
        PVJ = 0;
    }


}