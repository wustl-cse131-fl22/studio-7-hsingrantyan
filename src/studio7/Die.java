package studio7;

public class Die {
	
	//INSTANCE VARIABLES
	private int sides;
	
	//constructor
	public Die(int sides) {
		this.sides = sides;
	}
	
	//methods
	public int generateRanNum() {
		System.out.print((int)(Math.random()*this.sides)+1);
		return (int)(Math.random()*this.sides)+1;
	}
	
	public static void main(String[] args) {
		Die four = new Die(4);
		four.generateRanNum();
	}

}
