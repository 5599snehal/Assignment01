
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle (double length , double width) {
		
	this.length = length ;
	this.width = width;
	}	
	public void getArea() {
		
		System.out.println("Calculate the area of a Rectangle=" +(length*width));
	}
}
