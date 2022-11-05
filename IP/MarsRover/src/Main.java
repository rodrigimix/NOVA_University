
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarsRover r = new MarsRover();
		System.out.println(r.getXPos());
		// 0.0 (double)
		System.out.println(r.getYPos());
		// 0.0 (double)
		r.setHeading(90);
		r.moveForward(1.0);
		System.out.println(r.getXPos());
		// 6.123234e-17 (double)
		System.out.println(r.getYPos());
		// 1.0 (double)
		r.setHeading(270);
		r.moveForward(2);
		System.out.println(r.getYPos());
		// -1.0 (double)
		System.out.println(r.getXPos());
		// -6.123234e-17 (double) Rever isto pk está a dar valores diferentes
		r.mark();
		r.setHeading(90);
		r.moveForward(2);
		System.out.println(r.getDistance());
		// 2.0 (double)
		r.setHeading(0);
		r.moveForward(2);
		System.out.println(r.getDistance());
		// 2.828427 (double)
	}

}
