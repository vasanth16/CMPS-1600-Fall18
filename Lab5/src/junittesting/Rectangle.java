//package junittesting;

import java.util.*;

public class Rectangle {
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
    public Rectangle (){

    }
    public int getRectangleID(){
        return this.rectangleID;
    }

    public int getCounter(){
        return this.counter;
    }
    public String toString(){
        //System.out.println("Your rectangle with the id "+ this.rectangleID +" has a length of "+ this.len +" units and a height of "+ this.wid +" units");
        return "Your rectangle with the id "+this.getRectangleID()+" has a length of "+ this.getLength()+" units and a height of "+ this.getHeight()+" units";
    }
}
