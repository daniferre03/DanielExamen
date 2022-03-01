/**
 * @since 01/03/2022
 * @author Vespertino Daniel Ferreira
 * @version 1.0
 *
 */
public class Utilidad {

	/**
	 * 
	 * @param a
	 * @return factorial del parametro que hemos introducido
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * 
	 * @param n
	 * @return 1 si el parametro que hemos metido es igual a 1
	 * @return el parametro que hemos metido por el factorial del valor qeu hemos metido menos 1
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return un true si el calculo de d es primo
	 * @return un false sie el calculo de d no es primo
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
}

