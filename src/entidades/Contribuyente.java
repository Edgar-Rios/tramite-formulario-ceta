package entidades;


public class Contribuyente {


	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;

	/**
	 * @param apellido
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @param cuil
	 */
	public Contribuyente(String apellido, String nombre, long dni, char sexo, String cuil) throws Exception {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.setSexo(sexo);
		this.setCuil(cuil);
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) throws Exception {
		if (!this.sexoValido(Character.toUpperCase(sexo))) {
			throw new Exception("Error: Sexo incorrecto.");
		}
		this.sexo = Character.toUpperCase(sexo);
	}

	/**
	 * @return the cuil
	 */
	public String getCuil() {
		return (this.cuil.substring(0, 2) + "-" + this.cuil.substring(2, 10) + "-" + this.cuil.substring(10));
	}

	/**
	 * @param cuil the cuil to set
	 */
	public void setCuil(String cuil) throws Exception {
		if (!(this.isValidCUIT(cuil))) {
			throw new Exception("ERROR: cuit invalido");
		}
		this.cuil = cuil;
	}

//-----------------------------------------------------
//------------------------------------------------------
	public boolean sexoValido(char sexo) {
		return ((sexo == 'M' || sexo == 'F'));
	}


	private boolean isValidCUIT(String cuit) throws Exception {

		if (cuit.length() > 11)
			return false;

 		char[] cuitAux = cuit.toCharArray();

		if ((cuitAux[1] != '7' && this.sexo == 'F') || (cuitAux[1] != '0' && this.sexo == 'M'))
			return false;

		int sumadorAux = 0, control = 0, multiplicador = 5;

		for (int i=0;i<cuitAux.length-1;i++) {
			sumadorAux += (Integer.parseInt(String.valueOf(cuitAux[i])) * multiplicador);
			
			if (multiplicador != 2)
				multiplicador--;
			else
				multiplicador = 7;
		}

		control = sumadorAux % 11;
		control = 11 - control;

		if (control == 11 && cuitAux[10] == '0')
			return true;

		if (control == 10 && cuitAux[10] == '9')
			return true;

		if (control == Integer.parseInt(String.valueOf(cuitAux[10])))
			return true;

		return false;
	}

	public String toString() {
		return ("\n" + this.nombre + " " + this.apellido + "\n sexo: " + this.sexo
				+ "\n D.N.I        " + this.dni + "\n C.U.I.L   " + this.getCuil());
	}

	public boolean equals(Contribuyente contribuyente) {
		return (this.getCuil().equals(contribuyente.getCuil())) && (this.getDni() == contribuyente.getDni());
	}
}
