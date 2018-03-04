package sara.hernandez.fractions;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public final class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction(final int numerator, final int denominator){
		if (denominator == 0){
			throw new IllegalArgumentException("Denominator does not must be zero (0)");
		}
		simpliflyFraction(numerator, denominator);
	}
	
	public void simpliflyFraction(final int numerator, final int denominator){	
		final int maximoComunDivisor = Operations.maximoComunDivisor(numerator, denominator);
		this.numerator = numerator/maximoComunDivisor;
		this.denominator = denominator/maximoComunDivisor;
	}
	
	public Fraction sum(final Fraction fraction2){
		int mcm = Operations.minimoComunMultiplo(this.denominator, fraction2.denominator);
		int a = (mcm/this.denominator) * this.numerator;
		int b = (mcm/fraction2.denominator) * fraction2.numerator;
		return new Fraction(a + b, mcm);
	}
	
	public Fraction subtract(final Fraction fraction2){
		return sum(new Fraction(-fraction2.numerator, fraction2.denominator));
	}

	public Fraction multiply(final Fraction fraction2){
		int numerator = this.numerator * fraction2.numerator;
		int denominator = this.denominator * fraction2.denominator;
		return new Fraction(numerator, denominator);
	}
	
	public Fraction divide(final Fraction fraction2){
		return multiply(new Fraction(fraction2.denominator, fraction2.numerator));
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(numerator, denominator);
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return  true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction)obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
	return String.format("%d/d%", numerator, denominator);	
	}
}
