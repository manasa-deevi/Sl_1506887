package ex1;

public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
		super();
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter()
	{
		return side1+side2+side3;
	}
	
	public double getArea()
	{
		double s=this.getPerimeter();
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	public static void main(String[] args) {
		Triangle triangle=new Triangle(2, 6, 7);
		System.out.println("Printing values for parameterized constructor");
		System.out.println("Area of triangle is "+triangle.getArea());
		System.out.println("Perimeter of triangle is "+triangle.getPerimeter());
		System.out.println();
		
		Triangle triangle2=new Triangle();
		triangle2.side1=2;
		triangle2.side2=6;
		triangle2.side3=7;
		System.out.println("Printing values for non-parameterized constructor");
		System.out.println("Area of triangle is "+triangle2.getArea());
		System.out.println("Perimeter of triangle is "+triangle2.getPerimeter());
		
	}

}
