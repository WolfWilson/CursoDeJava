package parteXXmultiplesFuentesDeEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

class MultiplesFuentesDeEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		setBounds(10, 10, 600, 400);
		add(new Paneles());
		setVisible(true);
	}
	
}

class Paneles extends JPanel{
	
	private JLabel texto= new JLabel("");
	
	public Paneles() {
		
		EventoModificarColor colorRojo = new EventoModificarColor("rojo", Color.RED);
		EventoModificarColor colorAmarillo = new EventoModificarColor("amarillo", Color.YELLOW);
		EventoModificarColor colorVerde = new EventoModificarColor("verde", Color.GREEN);
		
		add(new JButton(colorRojo));
		add(new JButton(colorAmarillo));
		add(new JButton(colorVerde));
		add(texto);
		
		//PASO UNO: Crear mapa de entrada 
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//PASO DOS: Crear la combinaci�n de teclas a utilizar
		
		KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");
		KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl V");
		
		//PASO TRES: asignar combinaci�n de teclas al objeto
		
		mapaEntrada.put(teclaRoja, "Poner fondo en rojo");
		mapaEntrada.put(teclaAmarilla, "Poner fondo en amarillo");
		mapaEntrada.put(teclaVerde, "Poner fondo en verde");
		
		//PASO CUATRO: asignar objetos a acciones.
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("Poner fondo en rojo", colorRojo);
		mapaAccion.put("Poner fondo en amarillo", colorAmarillo);
		mapaAccion.put("Poner fondo en verde", colorVerde);
		
	}
	
	class EventoModificarColor extends AbstractAction{
		
		public EventoModificarColor(String nombre, Color colorFondo) {
			// TODO Auto-generated constructor stub
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "poner el color en "+nombre);
			putValue("color", colorFondo);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Color c =(Color)getValue("color");
			setBackground(c);
			texto.setText((String) getValue(Action.NAME));
			System.out.println(getValue(Action.NAME)+" -> "+getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
	
}