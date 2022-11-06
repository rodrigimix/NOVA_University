public class Main {
    public static void main(String[] args){
        RegularPolygon t = new RegularPolygon(3, 1.0);
        System.out.println(t.getPerimeter());
// 5.196152 (double)
        System.out.println(t.getArea());
// 1.299038 (double)
        RegularPolygon q = new RegularPolygon(4, 1.0);
        System.out.println(t.getPerimeter());
// 6.928203 (double)
        System.out.println(t.getArea());
// 2.0 (double)
    }
}
