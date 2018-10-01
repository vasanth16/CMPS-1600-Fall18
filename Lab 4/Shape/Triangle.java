import java.util.*;
import java.lang.Math;



public class Triangle extends Shape{
	private double sideA;
	private double sideB;
	private double sideC;

	private String type = "Triangle";


	public double area (){
		double p = ((sideA + sideB + sideC)/2);
		//System.out.println(p + " " +  sideA+ " " + sideB+ " " + sideC);

		//areaa = p * (p-sideA) * (p-sideB) * (p-sideC);
		return Math.sqrt((p * (p-sideA) * (p-sideB) * (p-sideC))) ;
	}

	public double perimeter (){
		return (sideA + sideB + sideC);
	}

	public String getShape(){
		return this.type;
	}

	

	public Triangle (double a, double b, double c){ // constructor that sets three sides of the triangle
		sideA = a;
		sideB = b;
		sideC = c;

		this.type = "Triangle";
		shapeCount = shapeCount + 1;
	}
}