package entidades;

import java.time.LocalDate;


public class Ceta {
	
	private static int ID=0;
	private int IdCeta;
	private LocalDate fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private Rodado rodado;
	private double valorTransferencia;
	private boolean firmaComprador;
	
	public String toString() {
		return ("ID #"+this.IdCeta+"        "+this.fecha+"\n comprador: "+this.comprador+"\n vendedor: "+this.vendedor+"\n\n rodado: "+this.rodado+"\n  valor: $"+this.valorTransferencia+"\n             firma: "+firmaComprador);
	}
	
	
	public Ceta(LocalDate fecha, Contribuyente vendedor, Contribuyente comprador, Rodado rodado, double valor, boolean firma ) throws Exception{
		if(vendedor.equals(comprador)) {
			throw new Exception("Error: Comprador y vendedor son iguales.");
		}
		ID++;
		this.IdCeta=ID;
		this.setFecha(fecha);
		this.setVendedor(vendedor);
		this.setComprador(comprador);
		this.rodado = rodado;
		this.valorTransferencia = valor;
		this.firmaComprador = firma;
		
	}

	/**
	 * @return the idCeta
	 */
	public int getIdCeta() {
		return IdCeta;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) throws Exception{
		if(this.validarFecha(fecha)) {
			throw new Exception("Error: Fecha invalida.");
		}
		this.fecha = fecha;
	}

	/**
	 * @return the vendedor
	 */
	public Contribuyente getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(Contribuyente vendedor){
		this.vendedor = vendedor;
	}

	/**
	 * @return the comprador
	 */
	public Contribuyente getComprador() {
		return comprador;
	}

	/**
	 * @param comprador the comprador to set
	 */
	public void setComprador(Contribuyente comprador) {

		this.comprador = comprador;
	}

	/**
	 * @return the valorTransferencia
	 */
	public double getValorTransferencia() {
		return valorTransferencia;
	}

	/**
	 * @param valorTransferencia the valorTransferencia to set
	 */
	public void setValorTransferencia(double valorTransferencia) {
		this.valorTransferencia = valorTransferencia;
	}

	/**
	 * @return the firmaComprador
	 */
	public boolean isFirmaComprador() {
		return firmaComprador;
	}

	/**
	 * @param firmaComprador the firmaComprador to set
	 */
	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}

//------------------------------------------------------------
	
	public boolean validarFecha(LocalDate fecha) {
		return(fecha.isAfter(LocalDate.now()));		
	}
	

	

}
