package shapes_class;

public class Shape {
	String color = "orange";
	double area = 0;
	
	public void getArea(String str) {
		switch (str) {
		case "rectangle":
			area = 4 * 2;
			System.out.println("Rectangle's area is " + area + " inches.");
			break;
		case "triangle":
			area = (12 /2) * 16;
			System.out.println("Triangle's area is " + area + " inches.");
			break;
		case "circle":
			area = Math.PI * 15;
			System.out.println("Circle's area is " + area + "cm");
		}
	}
		
}


