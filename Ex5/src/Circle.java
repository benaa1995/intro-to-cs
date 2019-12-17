
public class Circle {

	public double centerX,centerY,radius;
	
	public Circle() {
		centerX = 0;
		centerY = 0;
		radius = 1;	
	}
	public Circle(double x,double y, double r) {
		centerX = x;
		centerY = y;
		
		if (r>0) 
			radius = r;
		else
            radius = 1;
	}
    public double getCenterX(){
	return centerX;	
    }
	public String toString() {
		return "Circle at ("+centerX+", "+centerY+") radius "+radius;
	}
	public double area() {
		return radius*radius*Math.PI;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public void resize (double factor) {
		if (factor>0)
			radius = radius*factor;
	}
	public void moveTo (double x,double y) {
		centerX = x;
		centerY = y;	
	}
	public boolean isIn(double x,double y) {
		if((centerX-x)*(centerX-x)+(centerY-y)*(centerY-y)<=radius*radius)
			return true;
		else
			return false;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double setR) {
		radius=setR;
		}
    }