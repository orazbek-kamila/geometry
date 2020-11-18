package Geo;

public abstract class Shape {
	public double x;
	public double y;
	
	Shape(){
		x=0;
		y=0;
	}
Shape(double x, double y){
	this.x=x;
	this.y=y;
}
public double getX() {
	return x;
}
public double getY() {
	return y;
}
public abstract double calcArea();
}
