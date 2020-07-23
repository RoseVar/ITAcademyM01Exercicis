
package ejercicios;


/**
 * Solution of Exercise "Variables, Constants i bucle For - Fase 2" of  IT Academy Developer Program.
 * @author rhia7
 *
 */
public class Fase02App {

	public static void main(String[] args) {
		
		//Variables de Fase1
		String nom = "Roser";
		String cognom1=  "Vargas";
		String cognom2= "Del Rio";
		int dia = 28, mes= 10, any=1977;
		
		//----- FASE 2----------
		//Sabent que l’any 1948 es un any de traspàs: 
		//Creeu una constant amb el valor de l’any (1948).
		final int ANY_INICI = 1948;
		
		//Creeu una variable que guardi cada quan hi ha un any de traspàs.
		int rangTraspas= 4;
		
		//Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
		int anysTraspasCalculats=0;
		for (int i=ANY_INICI; i<=any; i=i+rangTraspas) {
			anysTraspasCalculats= anysTraspasCalculats + 1;
		}
						
		//Mostreu per pantalla el resultat del càlcul.
		System.out.println("Hi ha " + anysTraspasCalculats + " anys de traspàs des de 1948, inclouent-hi aquest.");
	}

}
