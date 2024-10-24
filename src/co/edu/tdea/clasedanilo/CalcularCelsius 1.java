package co.edu.tdea.taller;

import java.util.Scanner;

public class CalcularCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite los grados en celsius (°C)");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		double kelvin = celsius + 273.15;
		double rankine = (celsius + 273.15) * 1.8;
		
		System.out.println("La conversión a fahrenheit es: " + fahrenheit);
		System.out.println("La conversión a kelvin es: " + kelvin);
		System.out.println("La conversión a rankine es: " + rankine);
	}

}
