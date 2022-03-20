package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.MercadoLibre;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.view.Vista;

public class Controller implements ActionListener {

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
		}
		if (comando.equals(vista.getPanelCrearUsuario().getCOMANDO_CREAR())) {
			crearUsuario();
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

}
