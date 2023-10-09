package shapes_class;

public class Shape_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();
		
		System.out.println(rectangle.color);
		System.out.println(rectangle.Height);
		System.out.println(rectangle.Width);
		rectangle.getArea("rectangle");
		
		System.out.println(triangle.color);
		System.out.println(triangle.Height);
		System.out.println(triangle.Base);
		triangle.getArea("triangle");
		
		System.out.println(circle.color);
		System.out.println(circle.Radius);
		circle.getArea("circle");
	}

}
