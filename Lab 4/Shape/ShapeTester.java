import java.util.*;

public class ShapeTester{

	public static  void displayArray(ArrayList<Shape> x){
		for (int i = 0; i < x.size(); i++){
			x.get(i).display();
		}
	}

	public static void main(String[] args) {
		Circle c = new Circle (5);
		Triangle t = new Triangle (5,8,4);
		Rectangle r = new Rectangle (5,6);
		Square s = new Square (5);


		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(c);
		shapes.add(r);
		shapes.add(t);
		shapes.add(s);

		/*for (int i = 0; i < shapes.size(); i++){
			System.out.println(shapes.get(i).getShape());


		}
		for (int i = 0; i < shapes.size(); i++){
			if (shapes.get(i).getShape() == "Circle"){
				System.out.println("Circle at index " + i);
			}
		}*/

		Collections.sort(shapes);

		System.out.println("There are "+s.getShapeCount()+" shapes");
		displayArray(shapes);
	}
	




}