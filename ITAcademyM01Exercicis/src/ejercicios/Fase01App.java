package ejercicios;


/**
 * Solution of Exercise "Variables, Constants i bucle For - Fase 1" of  IT Academy Developer Program.
 * @author rhia7
 *
 */
public class Fase01App {

	public static void main(String[] args) {
		//Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
		String nom = "Roser";
		String cognom1=  "Vargas";
		String cognom2= "Del Rio";
		
		//Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
		int dia = 28, mes= 10, any=1977;
		
		//Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
		System.out.println(cognom1 + " " + cognom2 +", "+ nom);
		
		//Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
		System.out.println(dia + "/" + mes +"/"+ any);

	}

}
