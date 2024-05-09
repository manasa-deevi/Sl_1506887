package ex2.shapes;

public class Rectangle extends Shape{
	
	private float width;
	private float height;
	
	
	
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		float area=width*height;
		return area;
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle(8, 10);
		System.out.println("Area of rectangle is "+rectangle.getArea());
		
	}
	

}
