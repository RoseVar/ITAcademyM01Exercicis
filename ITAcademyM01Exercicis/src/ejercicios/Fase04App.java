
package ejercicios;


/**
 * Solution of Exercise "Variables, Constants i bucle For - Fase 3" of  IT Academy Developer Program.
 * @author rhia7
 *
 */
public class Fase04App {

	public static void main(String[] args) {
		
		//Variables y Constantes de Fase1 + Fase2 + Fase 3
				String nom = "Roser";
				String cognom1=  "Vargas";
				String cognom2= "Del Rio";
				int dia = 28, mes= 10, any=1977;
				int anyCalculat = 1948;
				int rangTraspas= 4;
				boolean esDeTraspas= false;
				String esCert= "El meu any de naixement és de traspàs."; //La varío para ajustarla al ejercicio
				String esFals= "El meu any de naixement no és de traspàs."; //La varío para ajustarla al ejercicio
				
				//Cálculo para saber si el año de nacimiento es bisiesto de Fase 3
				do {
					if (anyCalculat==any) {
						esDeTraspas= true;
					}
					anyCalculat+= 4;
				}while (any>anyCalculat);
				
					
				
				// ------FASE 4
				//Creeu una variable on juntareu el nom i els cognoms (tot en una variable) 
				String nomComplet = nom + " "  + cognom1 + " " + cognom2;
				
				//i un altre on juntareu la data de naixement separada per “/” (tot en una variable).
				String anyComplet= dia+"/"+mes+"/"+any;
				
				//Mostreu per consola les variables del nom complet, la data de naixement i si l’any de naixement es de traspàs o no.
				String missatgeDeTraspas= "";
				if (esDeTraspas==true) {
					missatgeDeTraspas= esCert;
				} else {
					missatgeDeTraspas= esFals;
				}
				
				System.out.println("El meu nom és "+nomComplet + ".");
				System.out.println("Vaig néixer el "+anyComplet+".");
				System.out.println(missatgeDeTraspas);
			}

}
