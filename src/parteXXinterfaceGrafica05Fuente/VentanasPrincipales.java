package parteXXinterfaceGrafica05Fuente;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{
	
	public VentanasPrincipales() {
		
		setBounds(5,50,500,500);
		
		Paneles panel = new Paneles();
		
		add(panel);
		
		setVisible(true);
	}

}
