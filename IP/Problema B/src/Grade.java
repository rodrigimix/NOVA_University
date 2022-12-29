public class Grade {
    private final double MIN_NOTE = 9.5;
    private double p1, p2, t1, t2, e, d, val, v_p;
    public Grade(double n1,double n2,double n3,double n4,double n5,double n6){
        p1 = n1;
        p2 = n2;
        t1 = n3;
        t2 = n4;
        e = n5;
        d = n6;
        val = (n1*0.1) + (n2*0.25) + (n3*0.2) + (n4*0.35)+e+d;
        v_p = (n1+n2)/2;
    }
    public Grade(){
        p1 = 0;
        p2 = 0;
        t1 = 0;
        t2 = 0;
        e = 0;
        d = 0;
        val = 0;
        v_p = 0;
    }

    public boolean hasFreq(){
        return v_p >= MIN_NOTE;
    }

    public double finalGrade(){
        if (this.hasFreq()){
            return val;
        }
        else{
            return 0;
        }
    }

    public double neededExamGrade(){
        return (MIN_NOTE-v_p)/0.55;
    }
}
