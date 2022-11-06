public class RegularPolygon {

    private double side, radious;

    public RegularPolygon(double s, double r){
        if (s >= 3 && r > 0){
            side = s;
            radious = r;
        }
        else
            System.exit(1);
    }

    public double getNumberOfSides(){
        return side;
    }

    public double getRadius(){
        return radious;
    }

    public double getSide(){
        return 2 * radious * Math.cos((Math.PI/side));
    }

    public double getApothem(){
        return radious * Math.cos((Math.PI/side));
    }

    public double getPerimeter(){
        return side * this.getApothem();
    }

    public double getArea(){
        return 0.5 * this.getPerimeter() * this.getApothem();
    }
}
