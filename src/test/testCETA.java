package test;

import java.time.LocalDate;

import entidades.Ceta;
import entidades.Contribuyente;
import entidades.Rodado;

public class testCETA {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			System.out.println("ESCENARIO 1: comprador y vendedor no pueden ser los mismos"
					+ "\n");
			
			Contribuyente vendedor = new Contribuyente("Rios", "Edgar", 39418831, 'm', "20394188310");
			Contribuyente comprador = new Contribuyente("Rios", "Edgar", 39418831, 'm', "20394188310");
			Rodado auto1 = new Rodado("titular", 207, "Peugot");
			
//			System.out.println(vendedor.equals(comprador));
			Ceta cetaA = new Ceta(LocalDate.now(), vendedor, comprador, auto1, 500000, true);
			System.out.println(cetaA);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n******************************\n");
		
		try {
			System.out.println("ESCENARIO 2: OK"
					+ "\n");
			
			Contribuyente vendedor = new Contribuyente("Rios", "Edgar", 39418831, 'm', "20394188310");
			Contribuyente comprador = new Contribuyente("Cañete", "Armando", 17254359, 'm', "20172543597");
			Rodado auto1 = new Rodado("titular", 207, "Peugot");
			
//			System.out.println(vendedor.equals(comprador));
			Ceta cetaA = new Ceta(LocalDate.now(), vendedor, comprador, auto1, 500000, true);
			System.out.println(cetaA);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
