package co.edu.tdeaclase15agosto;

import java.util.Scanner;

public class Prueba1hoy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese numero del 1 al 7");
		int numeroDia = sc.nextInt();
		String dia = "";
		
		if (numeroDia >=1 && numeroDia <=7) {
			switch (numeroDia) {
			
			case 1:
				dia = "lunes";
				break;
			case 2:
			    dia = "martes";
			    break;
			case 3:
				dia = "miercoles";
				break;
			case 4:
				dia = "jueves";
				break;
			case 5:
				dia = "vienes";
				break;
			case 6:
				dia = "sabado";
				break;
			case 7:
				dia = "domingo";
				break;
			}		
				System.out.println("el dia correspondiente al numero es: " + dia);
			
		}else {
			System.out.println("numero erroneo");
				
			
				
				
				
			
		}

	}

}
