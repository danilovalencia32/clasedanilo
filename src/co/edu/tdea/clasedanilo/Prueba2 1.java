package co.edu.tdeaclase15agosto;
import java.util.Scanner;
public class Prueba2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ingrese numero de la base :");
		int base = sc.nextInt();
				
		System.out.println("ingrese el exponente :");
		int exponente = sc.nextInt();
		
		double resultado = 0;
		
		if (exponente > 0) {		
			
			
		       resultado = Math.pow(base, exponente);
		       
		} else if (exponente == 0) {
		    resultado = 1;			
		}else {
			resultado = 1/Math.pow(base, exponente);
			
		}
		
		System.out.println(" el resultado es: " + resultado);

		
	}     

}
