/**
 * 
 */
package co.edu.unbosque.model;

import java.util.Date;

/**
 *
 */
public class Factura {

	private int idFactura;
	private int idTipoPago;
	private Date fecha;
	private String estado;
	
	public Factura(int idFactura, int idTipoPago, Date fecha, String estado) {
		this.idFactura = idFactura;
		this.idTipoPago = idTipoPago;
		this.fecha = fecha;
		this.estado = estado;
	}

	/**
	 * @return the idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the idTipoPago
	 */
	public int getIdTipoPago() {
		return idTipoPago;
	}

	/**
	 * @param idTipoPago the idTipoPago to set
	 */
	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
