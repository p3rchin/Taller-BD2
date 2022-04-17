package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import co.edu.unbosque.model.MercadoLibre;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.VentaMetas;
import co.edu.unbosque.view.Vista;

public class Controller implements ActionListener, KeyListener {

	private Vista vista;
	private MercadoLibre mercado;

	public Controller() {
		vista = new Vista(this);
		mercado = new MercadoLibre();

	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals(vista.getCOMANDO_CREAR_CLIENTE())) {
			vista.getPanelCrearUsuario().setVisible(true);
			vista.getPanelConsultaUsuario().setVisible(false);

		}
		if (comando.equals(vista.getPanelCrearUsuario().getCOMANDO_CREAR())) {
			crearUsuario();
		}
		if (comando.equals(vista.getCOMANDO_MOSTRAR_CLIENTE())) {
			mostrarUsuarios();
		}
		
		if (comando.equals(vista.getCOMANDO_PROCESO())) {
			String idUsuario = vista.pedirDato("Ingrese el id del usuario");
			mercado.getUsuario().cambiarSaldo(idUsuario);
			vista.mostrarMensajeInformacion("Saldo cambiado exitosamente");
		}
		
		if (comando.equals(vista.getCOMANDO_INSERTARDAWH())) {
			ArrayList<VentaMetas> ventas = mercado.getVentas().tomarDatos();
			if(mercado.getVentas().insertarDWH(ventas)) {
				vista.mostrarMensajeInformacion("Se insertado en el DWH");
			}
		}
	}

	public void crearUsuario() {
		String[] entradas = vista.getPanelCrearUsuario().verificarEntradas();
		if (entradas[0].equals("0")) {
			Usuario usuario = new Usuario(entradas[2], entradas[3], entradas[4], entradas[6], entradas[1], entradas[5],
					entradas[7], 50000, "A");
			if (mercado.getUsuario().crearUsuario(usuario)) {
				vista.mostrarMensajeInformacion("Se ha creado el usuario");
			} else {
				vista.mostrarMensajeAdvertencia("No se ha podido crear el usuario");
			}
		} else {
			vista.mostrarMensajeAdvertencia(entradas[1]);
		}

	}

	public void mostrarUsuarios() {
		ArrayList<Usuario> listaUsuarios = mercado.getUsuario().consultarUsuarios();
		String[][] infoUsuarios = mercado.getUsuario().mostarInfoUsuarios(listaUsuarios);
		vista.getPanelConsultaUsuario().getPanelTablas().limpiarPanel();
		vista.getPanelConsultaUsuario().getPanelTablas().mostrarTablaClientes(infoUsuarios);
		vista.getPanelCrearUsuario().setVisible(false);
		vista.getPanelConsultaUsuario().setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

		if (!vista.getPanelConsultaUsuario().getTxtNombre().getText().equals("")) {
			ArrayList<Usuario> listaUsuarios = mercado.getUsuario()
					.consultarUsuarios(vista.getPanelConsultaUsuario().getTxtNombre().getText());
			String[][] infoUsuarios = mercado.getUsuario().mostarInfoUsuarios(listaUsuarios);
			vista.getPanelConsultaUsuario().getPanelTablas().limpiarPanel();
			vista.getPanelConsultaUsuario().getPanelTablas().mostrarTablaClientes(infoUsuarios);
		}else if (vista.getPanelConsultaUsuario().getTxtNombre().getText().equals("")) {
			ArrayList<Usuario> listaUsuarios = mercado.getUsuario()
					.consultarUsuarios(vista.getPanelConsultaUsuario().getTxtNombre().getText());
			String[][] infoUsuarios = mercado.getUsuario().mostarInfoUsuarios(listaUsuarios);
			vista.getPanelConsultaUsuario().getPanelTablas().limpiarPanel();
			vista.getPanelConsultaUsuario().getPanelTablas().mostrarTablaClientes(infoUsuarios);
		}

	}

}
