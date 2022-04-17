package co.edu.unbosque.model.persistences;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.VentaMetas;

public class VentaMetasDAO {

	private ManejoConexion manejoConexion;
	private ManejoConexionDWH maneojoConexionDWH;

	public VentaMetasDAO() {
		manejoConexion = new ManejoConexion();
		maneojoConexionDWH = new ManejoConexionDWH();
	}

	public ArrayList<VentaMetas> tomarDatos() {
		ArrayList<VentaMetas> listaVentaMetas = new ArrayList<VentaMetas>();
		try {
			manejoConexion.establecerConexion();
			PreparedStatement consulta = manejoConexion.getConexion().prepareStatement(
					"Select a.nombre as nombre1, a.precio, b.nombre as nombre2, b.telefono, b.direccion, b.id_usuario, c.nombre as nombre3, d.nombre as nombre4, e.nombre as nombre5, f.fecha as fecha1, h.fecha as fecha2 from producto a, usuario b, tipo_producto c, tipo_pago d,"
							+ " categoria e, factura f, venta h where a.id_producto= h.id_productov and f.id_factura = h.id_facturav and b.id_usuario = h.id_usuariov and c.id_tipoproducto = a.id_tipoproducto and"
							+ " e.id_categoria = c.id_categoria and d.id_tipopago = f.id_tipopagof");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				VentaMetas ventaMetas = new VentaMetas(res.getString("nombre1"), res.getInt("precio"),
						res.getString("nombre2"), res.getString("telefono"), res.getString("direccion"),
						res.getInt("id_usuario"), res.getString("nombre3"), res.getString("nombre4"),
						res.getDate("fecha1"), res.getDate("fecha2"));
				listaVentaMetas.add(ventaMetas);
			}
			res.close();
			consulta.execute();
			consulta.close();
			manejoConexion.cerrarCon();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaVentaMetas;
	}

	public boolean insertarDWH(ArrayList<VentaMetas> listaVentas) {
		boolean verificar = false;
		try {
			maneojoConexionDWH.establecerConexion();
			Statement smt = maneojoConexionDWH.getConexion().createStatement();

			for (int i = 0; i < listaVentas.size(); i++) {
				smt.executeUpdate(
						"INSERT INTO proveedor (cod_proveedor, nomproveedor, dirproveedor, telproveedor) VALUES("
								+ (i + 7) + ",'" + listaVentas.get(i).getNombreUsuario() + "','"
								+ listaVentas.get(i).getDireccionUsuario() + "','"
								+ listaVentas.get(i).getTelefonoUsuario() + "')");
			}

			verificar = true;
			smt.close();
			maneojoConexionDWH.cerrarCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return verificar;
	}

}
