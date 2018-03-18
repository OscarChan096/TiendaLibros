package interfaz;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class TiendaLibros extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3898417281109811620L;
	private DetalleCatalogo detalleCatalogo;
	private DetalleCompra detalleCompra;
	
	public TiendaLibros() {
		Container contentPane = getContentPane();
		setTitle("Tienda de Libros");
		setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		setSize(500,560);
		setResizable(false);
		
		detalleCatalogo = new DetalleCatalogo();
		contentPane.add(detalleCatalogo);
		
		detalleCompra = new DetalleCompra();
		contentPane.add(detalleCompra);
		
	}

	public static void main(String[] args) {
		JFrame frame = new TiendaLibros();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
