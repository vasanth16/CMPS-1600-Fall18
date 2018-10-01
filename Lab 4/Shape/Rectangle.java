import java.util.*;
import java.lang.Math;


public class Rectangle extends Shape{
	private double len;
	private	double wid;


	private String type = "Rectangle";

	public String getShape(){
		return this.type;
	}



	public double area (){
		return len * wid;
	}

	public double perimeter (){

		return  2*len + 2*wid;
	}

	public double getLength(){ // getter for the length
		return this.len;
	}
	public void setLength(int le){ // setter for length
		this.len = le;
	}


	public double getHeight(){ // Getter for the width
		return this.wid;
	}
	public void setHeight(int wi){ // setter for width
		this.wid = wi; 
	}



	public Rectangle(double l, double w){ // constructor that sets the length and Height of the rectangle
		len = l;
		wid = w;
		
		shapeCount++;

		this.type = "Rectangle";
	}
	public Rectangle (){ // default constructor

	}
}