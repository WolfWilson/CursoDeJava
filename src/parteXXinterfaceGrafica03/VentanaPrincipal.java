package parteXXinterfaceGrafica03;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {

		setBounds(20, 30, 500, 600); //define tama�o y lugar en la pantalla		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //que pasa cuando apretamos el btn X
		Toolkit sistema = Toolkit.getDefaultToolkit(); //proporciona herramientas gr�ficas
		Image icono = sistema.getImage("gatito.png");//crea un objeto im�gen
		setIconImage(icono); //asigna el objeto imagen com �cono de la aplicaci�n
		setTitle("Mi tercer Ventana"); //defien el titulo de la ventana
		Paneles lamina= new Paneles(); //instancia un objeto Panel
		add(lamina); //agrega el panel a este Frame
		setVisible(true); //hae visible el Frame	

	}

}
