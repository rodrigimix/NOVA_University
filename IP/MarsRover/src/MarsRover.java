
public class MarsRover {
	private double x, y, direction;
	private double mark_x, mark_y, mark_heading;
	
	public MarsRover() {
		x = 0;
		y = 0;
		direction = 0;
		mark_x = 0;
		mark_y = 0;
		mark_heading = 0;
	}
	
	public void setHeading(double angle) {
		if (angle >= 0 && angle < 360.0){
			direction = angle;
		}
	}
	
	public double getXPos() {
		return x;
	}
	
	public double getYPos() {
		return y;
	}
	
	public double getHeading() {
		return direction;
	}
	
	public void mark() {
		mark_x = x;
		mark_y = y;
		mark_heading = direction;
	}
	
	public double getDistance() {
		if(mark_heading != direction) {
			double x_final = mark_x - x;
			double y_final = mark_y - y;
			return Math.sqrt((Math.pow(x_final, 2) + Math.pow(y_final, 2)));
		}
		else if(mark_x != x) {
			return mark_y-y;
		}
		else {
			return mark_x - x;
		}
	}
	
	public void moveForward(double distance) {
		x += distance * Math.cos(Math.toRadians(direction));
		y += distance * Math.sin(Math.toRadians(direction));
	}
}
