package sara.hernandez.fractions;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FractionTest 
{
	//@Test
    public void FractionDenominatorZeroTest()
    {
    	new Fraction(2,0);
    }
	
	//@Test
	public void simplifyFractionVenticuatroTreintaDosAvosIsTresCuartos(){
		assertThat(new Fraction(24, 32), is(new Fraction(3, 4)));
	}
	
	@Test
	public void sumFractionsDosCuartosAndUnMedioIsUno(){
		Fraction fraction1 = new Fraction(2, 4);
		assertThat(fraction1.sum(new Fraction(1, 2)), is(new Fraction(1,1)));
	}

	@Test
	public void sumFractionsUnTercioAndDosQuintosIsOnceQuinceAvos(){
		Fraction fraction1 = new Fraction(1, 3);
		assertThat(fraction1.sum(new Fraction(2, 5)), is(new Fraction(11,15)));
	}

	@Test
	public void subtractFractionsCuatroQuintosAndUnMedioIsTresDecimos(){
		Fraction fraction1 = new Fraction(4, 5);
		assertThat(fraction1.subtract(new Fraction(1, 2)), is(new Fraction(3,10)));
	}
	
	@Test
	public void subtractFractionsVeinteCuartosAndDosQuintosIsVeintitresQuintos(){
		Fraction fraction1 = new Fraction(20, 4);
		assertThat(fraction1.subtract(new Fraction(2, 5)), is(new Fraction(23,5)));
	}

	@Test
	public void multiplyFractionsVeinteCuartosAndDosQuintosIsVeintitresQuintos(){
		Fraction fraction1 = new Fraction(1, 2);
		assertThat(fraction1.multiply(new Fraction(2, 3)), is(new Fraction(1,3)));
	}

	@Test
	public void multiplyFractionsDoceTerciosAndTreintaySeisNovenos(){
		Fraction fraction1 = new Fraction(12, 3);
		assertThat(fraction1.multiply(new Fraction(36, 9)), is(new Fraction(16,1)));
	}

	@Test
	public void divideFractionsDoceTerciosAndUnNoveno(){
		Fraction fraction1 = new Fraction(12, 3);
		assertThat(fraction1.divide(new Fraction(1, 9)), is(new Fraction(36,1)));
	}
	
    public void testApp()
    {
        assertTrue( true );
    }
}
