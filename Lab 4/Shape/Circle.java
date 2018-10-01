import java.util.*;
import java.lang.Math;



public class Circle extends Shape{
	private String type = "Circle";
	private int radius; 
	



	public double area (){ 
		return 3.14 * Math.pow(this.radius, 2);
	}

	public void setRadius(int r){ // method to set radius of the circle 
		this.radius =  r;
		//shapeCount = shapeCount + 1;

	}

	public double perimeter (){ 
		return 2 * 3.14 * this.radius;
	}

	public String getShape(){
		return this.type;
	}

	public Circle (int r){ // constructor that sets the radius
		this.radius = r ;
		//this.type = "Circle";
		shapeCount = shapeCount + 1;
	}
	

}