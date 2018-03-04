package sara.hernandez.fractions;

public final class Operations {

	private Operations(){
		throw new AssertionError("");	
	}
	
	public static int maximoComunDivisor(int numeroUno, int numeroDos){
		return numeroDos == 0 ? numeroUno : maximoComunDivisor(numeroDos, numeroUno % numeroDos);
	}
	
	public static int minimoComunMultiplo(int numeroUno, int numeroDos){
		return (numeroUno * numeroDos) / maximoComunDivisor(numeroUno, numeroDos);
	}
	
}
