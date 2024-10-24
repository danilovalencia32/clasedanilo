package co.edu.tdea.pruebas;

import java.util.Scanner;

public class PruebaClase3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¡Obtenga un descuento!");
		System.out.println("Por favor digite el valor de su compra:");
		double valorCompra = sc.nextDouble();
		
		if (valorCompra >= 20000) {
			System.out.println("Por favor digite su edad:");
			int edad = sc.nextInt();
			
			if (edad >= 18 && edad <= 30) {
				
				double valorDescuento = (valorCompra * 0.2);
				double valorTotal = (valorCompra - valorDescuento);
				System.out.println("El valor de su compra ahora es de: " + valorTotal);
				System.out.println("El descuento es del 20%");			
			
			}else if (edad > 30 && edad < 105){
				
				double valorDescuentoDos = (valorCompra * 0.3);
				double valorTota = (valorCompra - valorDescuentoDos);
				System.out.println("El valor de su compra ahora es de: " + valorTota);
				System.out.println("El descuento es del 30%");
				
			}else if (edad < 18 && edad > 3) {
				
				double valorDescuent = (valorCompra * 0.25);
				double valorTot = (valorCompra - valorDescuent);
				System.out.println("El valor de su compra es de: " + valorTot);
				System.out.println("El descuento es del 25%");
				
			}else {
				
				System.out.println("Edad no válida para descuentos");
				
			}
			
		}else {
			System.out.println("Vuelva pronto tacaño");
		}
		
	}

}
