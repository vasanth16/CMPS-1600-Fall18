import java.util.*;


public  abstract class Shape implements Displayable, Comparable<Shape>{

	private String type; // this is the type of the shape that is seen in all other child classes 
	protected  static int shapeCount; // amount of shapes

	public void display(){ // displays the type, area and the perimeter of the shape
		System.out.println("For this shape of type " + this.getShape() + " has an area of "+ this.area() + " and a perimeter of " + this.perimeter());
	}
	abstract double area (); // area of the shape

	abstract double perimeter (); // perimeter of the shape

	public String getShape(){ // returns the type of the shape 
		return this.type;
	}	

	public int compareTo(Shape other){ // compares 2 shape objects 
		if (this.area() > other.area()){
			return 1; // if larger
		}else if (this.area() < other.area()){
			return -1; // of smaller
		} else {
			return 0; // if equal
		}
	}

	public int getShapeCount(){
		return shapeCount; // gets the shape count
	}


}