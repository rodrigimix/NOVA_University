public class Main {
    public static void main(String[] args){
        //ok
        Speed snail = new Speed();
        snail.setInMS(0.001);
        System.out.println(snail.getInMS());
// 0.001 (double)
        System.out.println(snail.getInKmH());
// 0.003600 (double)
        System.out.println(snail.getInMpH());
// 0.002237 (double)
        Speed obikwelu = new Speed();
        obikwelu.setInKmH(36.0);
        System.out.println(obikwelu.getInMS());
// 10.0 (double)
        System.out.println(obikwelu.getInKmH());
// 36.0 (double)
        System.out.println(obikwelu.getInMpH());
// 22.369360 (double)
        obikwelu.setInMpH(24.0);
        System.out.println(obikwelu.getInKmH());
// 38.624261 (double)
    }
}
