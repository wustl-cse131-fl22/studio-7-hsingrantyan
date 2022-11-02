package studio7;

public class Fraction {
	
	//INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//methods
	public void add(Fraction f) {
		this.numerator = this.numerator*f.denominator + f.numerator*this.denominator;
		this.denominator = this.denominator*f.denominator;
	}
	
	public void multiply(Fraction f) {
		this.numerator = this.numerator*f.numerator;
		this.denominator = this.denominator*f.denominator;
	}
	
	public void reciprocal() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
	}
	
	public void simplify() {
		int max = Math.max(numerator, denominator);
		int factor = 1;
		for (int i = 2; i < max; i ++) {
			if(numerator%i == 0 && denominator%i==0) {
				factor = i;
			}
		}
		this.numerator = this.numerator/factor;
		this.denominator = this.denominator/factor;
	}
	
	public void print() {
		System.out.println(String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator));
	}
	
	
	public static void main(String[] args) {
		Fraction hey = new Fraction (2,4);
		Fraction hi = new Fraction (1,3);
		
		hey.add(hi);
		hey.print();
		
		hey.multiply(hi);
		hey.print();
		
		hey.reciprocal();
		hey.print();
		
		hey.simplify();
		hey.print();

	}

}
