package parteXXcambiosDeEstado;

import javax.swing.JFrame;

class EventoVentana01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoVentana miMarco = new MarcoEventoVentana();
		
		/*
		 * en este caso utilizamos DISPOSE_ON_CLOSE para poder dar
		 * tiempo a que aparezcan los eventos de proceso de cierre
		 * y de cierre
		 */
		miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//pone en escucha al marco
		miMarco.addWindowStateListener(new EventosDeVentana()); 

	}

}