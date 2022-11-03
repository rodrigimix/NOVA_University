public class Speed {
    private static final double MS_KM = 3.6;
    private static final double MS_MH = 2.236936;
    private static final double KM_MS = 0.277778;
    private static final double KM_MH = 0.621371;
    private static final double MH_MS = 0.44704;
    private static final double MH_KM = 1.609344;
    private double s_choose;
    private boolean KM, MS, MH;
    public Speed(){
        s_choose = 0;
        KM = false;
        MS = false;
        MH = false;
    }

    public void setInMS(double speed){
        if (speed > 0){
            s_choose = speed;
            MS = true;
            if (KM || MH){
                KM = false;
                MH = false;
            }
        }
    }

    public void setInKmH(double speed){
        if (speed > 0){
            s_choose = speed;
            KM = true;
            if (MS || MH){
                MS = false;
                MH = false;
            }
        }
    }

    public void setInMpH(double speed){
        if (speed > 0){
            s_choose = speed;
            MH = true;
            if (MS || KM){
                MS = false;
                KM = false;
            }
        }
    }

    public double getInMS(){
        if (!MS){
            if (KM){
                return s_choose * KM_MS;
            }
            else {
                return s_choose * MH_MS;
            }
        }
        return s_choose;
    }

    public double getInKmH(){
        if (!KM){
            if (MH){
                return s_choose * MH_KM;
            }
            else {
                return s_choose * MS_KM;
            }
        }
        return s_choose;
    }

    public double getInMpH(){
        if (!MH){
            if (KM){
                return s_choose * KM_MH;
            }
            else {
                return s_choose * MS_MH;
            }
        }
        return s_choose;
    }
}
