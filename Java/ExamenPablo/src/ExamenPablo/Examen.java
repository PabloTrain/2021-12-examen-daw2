/**
 * @package ExamenPablo
 */
package ExamenPablo;

/**
 * @author Pablo Traín Cardiel
 * @version 1.0
 */

public class Examen {

	/**
	 * @param saludo
	 */
	static String saludo = "Hola mundo desde el examen";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * @param saludo
		 */
		try {
			System.out.println(saludo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @param suma
	 * @return suma
	 */
	public int sumar() {
		int suma = 55;
		
		return suma;
	}

	
	/**
	 * @deprecated metodoNoValido
	 */
	public static void metodoNoValido() {
		
	}
}
