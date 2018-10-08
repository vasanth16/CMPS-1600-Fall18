import junittesting.Rectangle;

import java.util.*;
//package junittesting;

 public class Square extends Rectangle {
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
