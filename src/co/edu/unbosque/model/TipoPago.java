package co.edu.unbosque.model;

public class TipoPago {
	
	private int tipoPago;
	private String nombre;
	private String estado;
	
	
	public TipoPago(int tipoPago, String nombre, String estado) {
		this.tipoPago = tipoPago;
		this.nombre = nombre;
		this.estado = estado;
	}


	/**
	 * @return the tipoPago
	 */
	public int getTipoPago() {
		return tipoPago;
	}


	/**
	 * @param tipoPago the tipoPago to set
	 */
	public void setTipoPago(int tipoPago) {
		this.tipoPago = tipoPago;
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
