package entidades;

public class Rodado {
	private static int ID=0;
	private int IDrodado;
	private String dominio;
	private int modelo;
	private String marca;
	
	public Rodado( String Dominio, int Modelo, String Marca) {
		
		ID++;
		this.IDrodado= ID;
		this.setDominio(Dominio);
		this.modelo= Modelo;
		this.marca= Marca;
	}

	public int getIDrodado() {
		return IDrodado;
	}

	public void setIDrodado(int iDrodado) {
		IDrodado = iDrodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//--------------------------------
	public String toString() {
		return ("   ID: "+this.IDrodado+"\n  Marca: "+marca+"     Modelo:  "+modelo);
	}
	
	public boolean equals(Rodado rodado) {
		if(!(this.IDrodado == rodado.IDrodado)) {
			return false;
		}
		return true;
	}
	
	
}
