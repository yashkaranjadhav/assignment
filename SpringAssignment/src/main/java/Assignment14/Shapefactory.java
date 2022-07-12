package Assignment14;

public class Shapefactory {

	public static Shape getCircleObject()
	{
		return new Circle();
	}
	
	public static Shape getSquareObject()
	{
		return new Square();
	}
	
	public static Shape getRectangleObject()
	{
		return  new Rectangle();
	}
	
}
