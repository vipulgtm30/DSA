package oops;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
		simplify();
	}
	
	//made this private as this is only used for internal calculations
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2; i<=smaller; i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void print() {
		System.out.println(this.numerator+ " / " +this.denominator);
	}

	public void increement() {
		numerator = numerator + denominator;
		simplify();
	}

	

}
