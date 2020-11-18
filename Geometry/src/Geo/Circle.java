package Geo;

public class Circle extends Shape {
	public int radius;
	public Circle(int i, int j) {
		super(i,j);
	
	}
public Circle(int i, int j, int radius) {
	super(i,j);
	this.radius=radius;
}
public double calcArea() {
	return Math.PI*radius*radius;
}
public String toString() {
	return "Cicrle: x=" + super.getX() + "y=" + super.getY();
}
}
