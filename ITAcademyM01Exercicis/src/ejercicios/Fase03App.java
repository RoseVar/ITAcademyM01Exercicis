
package ejercicios;


/**
 * Solution of Exercise "Variables, Constants i bucle For - Fase 3" of  IT Academy Developer Program.
 * @author rhia7
 *
 */
public class Fase03App {

	public static void main(String[] args) {
		
		//Variables y Constantes de Fase1 + Fase2
		String nom = "Roser";
		String cognom1=  "Vargas";
		String cognom2= "Del Rio";
		int dia = 28, mes= 10, any=1977;
		//final int ANY_INICI = 1948;
		int rangTraspas= 4;
		
		//-------- FASE 3		
		//Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement.
		//ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la.
		int anyCalculat = 1948;
		do {
			System.out.print(anyCalculat + ", ");
			anyCalculat+= 4;
		}while (any>anyCalculat);
		System.out.println("");

		//Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
		boolean esDeTraspas= false;
		do {
			if (anyCalculat==any) {
				esDeTraspas= true;
			}
			anyCalculat+= 4;
		}while (any>anyCalculat);
		
		//En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de
		//ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
		String esCert= "L’any de naixement és de traspàs.";
		String esFals= "L’any de naixement no és de traspàs.";
		
		if (esDeTraspas==true) {
			System.out.println (esCert);
		} else {
			System.out.println (esFals);
		}
	}
	
}
