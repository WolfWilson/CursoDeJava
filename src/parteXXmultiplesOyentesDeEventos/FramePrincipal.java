package parteXXmultiplesOyentesDeEventos;

import javax.swing.JFrame;

class FramePrincipal extends JFrame{
	
	public FramePrincipal() {
		
		setTitle("Multiples Oyentes de Eventos");
		setBounds(700, 5, 400, 300);
		
		PanelPrincipal panel = new PanelPrincipal();
		
		add(panel);
		
	}
	
}
