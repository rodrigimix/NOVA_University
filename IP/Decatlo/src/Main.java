public class Main {
    public static void main(String[] args){
        Decathlon d = new Decathlon();
        d.set100Meters(10.4);
        System.out.println(d.getPoints());
// 999 (int)
        d.reset();
        System.out.println(d.getPoints());
// 0 (int)
        d.set100Meters(10.4);
        d.setLongJump(736);
        System.out.println(d.getPoints());
// 1900 (int)
        d.setShot(13.53);
        System.out.println(d.getPoints());
// 2600 (int)
        d.setHighJump(210);
        System.out.println(d.getPoints());
// 3497 (int)
    }
}
