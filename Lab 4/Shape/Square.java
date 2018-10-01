

public class Square extends Rectangle{
	private int size = 0;
	private String type = "Square";

	public int getSize(){
		return this.size;
	}

	public String getShape(){
		return this.type;
	}
	public Square (int s){ // constructor that sets the size
		this.size = s;
		this.setLength(size);
		this.setHeight(size);
		this.type = "Square";
		shapeCount+=1;
	}

}