package test;

import entidades.Contribuyente;

public class testCONTRIBUYENTE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		try {
			System.out.println("ESCENARIO CON CUIT VALIDO");
			System.out.println("Ejemplo 1:");
			Contribuyente contribuyente = new Contribuyente("Rios", "Edgar", 39418831, 'm', "20394188310");
			System.out.println(contribuyente);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("\n\nESCENARIO CON CUIT INVALIDO");
			System.out.println("Ejemplo 2:");
			Contribuyente contribuyente = new Contribuyente("Rios", "Edgar", 39418831, 'm', "20394158310");
			System.out.println(contribuyente);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		System.out.println(con);

		
	}

}
