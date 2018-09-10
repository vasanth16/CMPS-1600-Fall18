import java.util.*;



class Rectangle{
	private double len;
	private	double wid;

	public static int counter = 0;

	private int rectangleID;
	

	public double area (){
		return len * wid;
	}

	public double perimeter (){

		return 2*len + 2*wid;
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

	public Rectangle(double l, double w){
		len = l;
		wid = w;
		

		this.rectangleID = counter;
		counter ++;
	}

	public int getRectangleID(){
		return this.rectangleID;
	}

	public int getCounter(){
		return this.counter;
	}
}

class RectangleTester{
	public static void main (String[] args){


		Rectangle yent = new Rectangle(5,10);

		System.out.println("Rectangle "+ yent.getRectangleID()+"'s Length is "+ yent.getLength());
		System.out.println("Rectangle "+ yent.getRectangleID()+"'s width is "+ yent.getHeight());

		System.out.println("The Area of the Rectangle is "+ yent.area());
		System.out.println("The Perimeter of the Rectangle is "+ yent.perimeter());
		
		yent.setLength(20);

		System.out.println("Rectangle "+ yent.getRectangleID()+"'s Length is "+ yent.getLength());
		System.out.println("Rectangle "+ yent.getRectangleID()+"'s width is "+ yent.getHeight());
		
		System.out.println("The Area of the Rectangle is "+ yent.area());
		System.out.println("The Perimeter of the Rectangle is "+ yent.perimeter());

		Rectangle woke = new Rectangle(4,6);
		System.out.println(woke.getCounter() + " rectangles have been created");

		System.out.println("The id for yent rectangle is "+yent.getRectangleID());
		System.out.println("The id for the woke rectangle is "+woke.getRectangleID());


	}
}

