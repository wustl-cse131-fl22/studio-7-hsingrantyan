package studio7;

public class Complex {
	
	//instance variables
	private double real;
	private double imaginary;
	
	//constructor
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//methods
	public void add(Complex c) {
		this.real = this.real+c.real;
		this.imaginary = this.imaginary+c.imaginary;
	}
	
	public void product(Complex c) {
		this.real = this.real*c.real - this.imaginary*c.imaginary;
		this.imaginary = this.real*c.imaginary + this.imaginary*c.real;
	}
	
	public void print() {
		if (this.imaginary < 0) {
			System.out.print(String.valueOf(this.real) + String.valueOf(this.imaginary) + "i");
		} else if (this.imaginary > 0) {
			System.out.print((String.valueOf(this.real) + "+" + String.valueOf(this.imaginary) + "i"));
		} else {
			System.out.print(this.real);
		}
	}
	
	
	
	public static void main(String[] args) {
		Complex hi = new Complex(1,4);
		Complex hey = new Complex(1,1);
		
		hi.add(hey);
		hi.print();

	}

}
