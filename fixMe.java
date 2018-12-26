package myapplication;

import java.awt.*;
public class MyApplication {
static final String startStr="\n****start of the program****";
final static String endStr="\n****end of the program****";
public static void main(String []arg){
    MyApplication SB=new MyApplication();
		SB.printMessage(startStr);
		Square s=new Square(100);
		System.out.println(s.computePerimeter());
		System.out.println(s.computeSurface());
		Point p1=new Point(10,10);
		Point p2=new Point(10.1,10.2);
		ColorPoint cp1=new ColorPoint(1,1);
		ColorPoint cp2=new ColorPoint(1,1,new Color(12,34,56));
		p1=cp1;
	MyApplication myA=new MyApplication();
		myA.printMessage(endStr);
		myA.printMessage(myA.endStr);
}//main Method
private void printMessage(String str)
{
	System.out.println(str);
}
////////////////////////////////
static class Square {
	public Square(int init_x){x=init_x;}
	public int computeSurface(){return x*x;}
	public int computePerimeter(){return 4*x;}
	private int x;
}//square
}//myApplication
class Point{
	public Point(double init_x,double init_y){
		x=init_x;
		y=init_y;
	}
	public void move(int init_x,int init_y){
		x+=init_x;
		y+=init_y;
	}
	protected double x,y;
}//point
class ColorPoint extends Point{
	public ColorPoint(int init_x,int init_y){
		super(init_x,init_y);
		color=Color.blue;
	}
        public ColorPoint(int init_x,int init_y , Color color){
		super(init_x,init_y);
		this.color = color ;
	}
	Color color;
}//ColorPoint