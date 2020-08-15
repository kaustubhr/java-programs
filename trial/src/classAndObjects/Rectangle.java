package classAndObjects;

public class Rectangle {
	
	double length;
	double breadth;
	double area() {
		return this.length * this.breadth;
	}
	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
		
		System.out.println("Area is "+area());
	}
	
	Rectangle(double number) {
		this.length = number;
		this.breadth = number;
		
		System.out.println("Area is "+area());
	}
	
	Rectangle() {
		this.length = 0;
		this.breadth = 0;
		
		System.out.println("Area is "+area());
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10.0);
		Rectangle r3 = new Rectangle(10.0,20.0);
		
		
		

	}

}
