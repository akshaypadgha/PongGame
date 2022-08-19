package abstraction;


	public class Circle1 extends Shape1
	{
	private int radius;
	public Circle1()
	{
		
	}
	public Circle1(int radius)
	{
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle1 [radius=" + radius + ", calculateArea()=" + calculateArea() + "]";
	}

		
		

	}

