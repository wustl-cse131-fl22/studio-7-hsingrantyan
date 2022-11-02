package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	//INSTANCE VARIABLES
	private double length;
	private double width;
	
	//Constructor
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//Methods
	public double area() {
		System.out.print(this.length*this.width);
		return this.length*this.width;
	}
	
	public double perimeter() {
		System.out.print(2*(this.length+this.width));
		return 2*(this.length+this.width);
	}
	
	public boolean isSmaller(Rectangle r) {
		if (this.area() < r.area()) {
			System.out.print(true);
			return true;
		} else {
			System.out.print(false);
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			System.out.print(true);
			return true;
		} else {
			System.out.print(false);
			return false;
		}
	}
	
	public void draw() {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.002);
		StdDraw.rectangle(0.5, 0.5, this.width, this.length);
	}
	
	public static void main(String[] args) {
		Rectangle hi = new Rectangle(2,4);
		Rectangle hihi = new Rectangle(3,3);
		hi.area();
		
		hi.perimeter();
		
		hi.isSmaller(hihi);
		
		hi.isSquare();
	}
	
}
