import java.util.*;


public class Square extends Rectangle{
	private int size = 0;

	public int getSize(){
		return this.size;
	}
	public Square (int s){
		this.size = s;
		this.setLength(size);
		this.setHeight(size);
	}
	@Override
	public String toString(){
		//System.out.println("Your square with the id "+this.getRectangleID()+" has a length of "+ this.getLength()+" units and a height of "+ this.getHeight()+" units");
		return "Your square with the id "+this.getRectangleID()+" has a length of "+ this.getLength()+" units and a height of "+ this.getHeight()+" units";
	}

	public boolean equals(Object other){
		if (!(other instanceof Square)){
			return false ;
		}
		Square s = (Square) other;
		if (this.size == s.size){
			return true;
		}else{
			return false;
		}
	}

}


public class SquareTester {
	public static void main(String[] args) {
		Rectangle a = new Rectangle (5.0, 6.0);
		Rectangle b = new Rectangle (5.0, 6.0);

		Square c = new Square (5);
		Square d = new Square (5);

		if (a == b ){
			System.out.println("The rectangles are Equal using ==");
		}else {
			System.out.println("The rectangles are not equal");
		}

		if (a.equals(b)){
			System.out.println("The rectangles are Equal using equals");
		}else{
			System.out.println("The Retangles are not equal");
		}

		if (c == d){
			System.out.println("The squares are Equal using ==");
		}else{
			System.out.println("The squares are not equal");
		}

		if (c.equals(d)){
			System.out.println("The squares are equal using the equals method");
		}else{
			System.out.println("The squares are not equal");
		}

	}
}
