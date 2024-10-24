package co.edu.tdea.taller;

import java.util.Scanner;

public class SupermercadoDoñaMechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a Supermercado Doña Mechas");
		
		System.out.println("Por favor digite el valor de su compra:");
		double valorCompra = sc.nextDouble();
		
		if (valorCompra >= 300000) {
			
			System.out.println("¿Tiene tarjeta súpercliente? (true/false): ");
			boolean tarjeta = sc.nextBoolean();
			
			if (tarjeta == true) {
				
				System.out.println("¿Va a pagar en efectivo? (true/false)");
				boolean pago = sc.nextBoolean();
				
				if (pago == true) {
					
					double descuento = valorCompra * 0.75;
					System.out.println("El valor final de su compra con el 25% es de: " + descuento);
					
				}else {
					double descuento = valorCompra * 0.83;
					System.out.println("El valor final de su compra con el 17% es de: " + descuento);
				}
				
			}else {
				
				System.out.println("¿Va a pagar en efectivo? (true/false): ");
				boolean pago = sc.nextBoolean();
				
				if (pago == true) {
					
					double descuento = valorCompra * 0.80;
					System.out.println("El valor final de su compra con el 20% es de: " + descuento);
				
				}else {
					double descuento = valorCompra * 0.85;
					System.out.println("El valor final de su compra con el 15% es de: " + descuento);
				}
			}
			
		}else {
			
			if (valorCompra >= 10000) {
				System.out.println("¿Tiene tarjeta súpercliente? (true/false): ");
				boolean tarjeta = sc.nextBoolean();
				
				if (tarjeta == true) {
					
					System.out.println("¿Va a pagar en efectivo? (true/false)");
					boolean pago = sc.nextBoolean();
					
					if (pago == true) {
						
						double descuento = valorCompra * 0.88;
						System.out.println("El valor final de su compra con el 12% es de: " + descuento);
						
					}else {
						double descuento = valorCompra * 0.97;
						System.out.println("El valor final de su compra con el 3% es de: " + descuento);
					}
					
				}else {
					System.out.println("¿Va a pagar en efectivo? (true/false): ");
					boolean pago = sc.nextBoolean();
					
					if (pago == true) {
						
						double descuento = valorCompra * 0.93;
						System.out.println("El valor final de su compra con el 7% es de: " + descuento);
					
					}else {
						double descuento = valorCompra * 1;
						System.out.println("El valor final de su compra con el 0% es de " + descuento);
					}
				}
			}else {
				System.out.println("EL valor final de su compra es de: " + valorCompra);
			}
			
		}
		
	}

}