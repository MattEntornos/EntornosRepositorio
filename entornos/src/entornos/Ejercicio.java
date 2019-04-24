package entornos;

import java.awt.Frame;

import javax.swing.*;

public class Ejercicio {
	public static void main(String[] args) {
		// Instanciar la clase MiMarco
		MiMarco marco = new MiMarco();
		// Lo hacemos visible,porque por defecto viene invisible.
		marco.setVisible(true);
		// Le indicamos que tiene que hacer cuando se cierre el programa.

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//CAMBIO
//CAMBIO2.

class MiMarco extends JFrame {

	public MiMarco() {
		// Añadir tamaño con números enteros.
		setSize(1500, 500);
		// Donde queremos que nos cree nuestro marco
		setLocation(0, 0);
		// Podemos hacer los dos metodos anteriores con uno solo:
		// setBounds(L,L,S,S);
		// El metodo de abajo lo hago para que el usuario no pueda redimensionar
		// mis dimensiones ya ejecutadas.
		setResizable(false);
		// Para que se abra en pantalla completa
		// setExtendedState(Frame.MAXIMIZED_BOTH);
		// A continuación le asigno un titulo.
		setTitle("STAY STRONG");
		System.out.println("utfcu");
	}
}