package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

import java.lang.Math;
abstract class ShapeLap6{
	private String name;
	
	public ShapeLap6(String name){
		setName(name);
		
	}
	public void setName(String name){
		this.name = name;
	
	}
	
	public abstract double calArea();
	public abstract double calLine();
	
	public String toString(){
		return "\nName: " + name ;
	}

}

abstract class Polygon extends ShapeLap6{
	private int noOfside;
	
	public Polygon(String name ,int no){
		super(name);
		setNoOfside(no);
	}
	public void setNoOfside(int no){
		noOfside = no;
		
	}
	public abstract double calArea();
	public abstract double calLine();
	public String toString(){
		return super.toString() + "\nNo: " + noOfside;
	
	}

}

final class Triangle extends Polygon{
	private double width;
	private double high;
	private double wh;
	public Triangle(String name ,int no){
		super(name,no);
	}
	public void setWidth(double w1){
		width = w1;
		
	}
	public void setHigh(double h1){
		high = h1;
		
	}
	public void setWH(double wh1){
		wh = wh1;
	
	}
	public double calArea(){
		double area1 = width*high/2.0;
		return area1;
	
	}
	public double calLine(){
		double area2,s = 0.0;
			s = (width+high+wh)/2.0;
			area2 = Math.sqrt(s*(s-width)*(s-high)*(s-wh));
		return area2;
		
	}
	 public String toString(){
		return super.toString();

}
}

class UseShapeLap6 {
	public static void main(String[]args){
		
		/*Shape obj1 = new Shape("ShapeJA");
		System.out.println(obj1.toString());
		
		
		Polygon obj2 = new Polygon("PolygonKA",0);
		System.out.println(obj2.toString());*/
		
		
		Triangle obj3 = new Triangle("Triangle",3);
		
		//System.out.println("Area: " + obj3.calArea(1.2,3.4));
		//System.out.println("Line: " + obj3.calLine(3.0,1.2,3.4));
		System.out.println(obj3.toString());
		obj3.setWidth(1.2);
		obj3.setHigh(3.4);
		System.out.println("Area: " + obj3.calArea());
		obj3.setWidth(3.0);
		obj3.setHigh(1.2);
		obj3.setWH(3.4);
		System.out.println("Line: " + obj3.calLine());
		
		
		
		
	}
}
