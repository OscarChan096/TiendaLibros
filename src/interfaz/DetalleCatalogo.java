package interfaz;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class DetalleCatalogo extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAgregarLibro, btnOpcion1, btnOpcion2, btnComprar;
	private JTable tabla;
	private JPanel panelBotones, panelCatalogo;
	private JLabel labCantidad;
	private JTextField jtfCantidad;
	
	public DetalleCatalogo() {
		
		// layoutManager
		setLayout(new BorderLayout());
		
		// Array unidimensional y bidimensional para la tabla
		String[][] libros = {};
		String[] Encabezado = {"ISBN", "Título", "Precio"};
		
		// se crean los paneles necesarios
		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.NORTH);
		
		panelCatalogo = new JPanel();
		add(panelCatalogo, BorderLayout.CENTER);
		panelCatalogo.setLayout(new BoxLayout(panelCatalogo, BoxLayout.Y_AXIS));
		
		JPanel panelSubCatalogo = new JPanel();
		
		JPanel panelCant = new JPanel();
		panelCant.setLayout(new BoxLayout(panelCant, BoxLayout.Y_AXIS));
		
		JPanel panelBtnCompra = new JPanel();
		panelBtnCompra.setLayout(new BoxLayout(panelBtnCompra, BoxLayout.Y_AXIS));
		
		// se crean los componentes para agregar a los paneles
		btnAgregarLibro = new JButton("Adicionar libro");
		btnAgregarLibro.setPreferredSize(new Dimension(155,28));
		btnOpcion1 = new JButton("Opcion 1");
		btnOpcion1.setPreferredSize(new Dimension(155,28));
		btnOpcion2 = new JButton("Opcion 2");
		btnOpcion2.setPreferredSize(new Dimension(155,28));
		labCantidad = new JLabel("Cantidad");
		jtfCantidad = new JTextField();
		btnComprar = new JButton("Comprar");
		
		// creacion de la tabla
		tabla = new JTable(libros,Encabezado);
		// Scroll por si existen mas datos que no caben en la tabla
		JScrollPane JS = new JScrollPane(tabla);
		// tamaño de los componentes
		JS.setPreferredSize(new Dimension(100,150));
		jtfCantidad.setPreferredSize(new Dimension(70,18));
		
		// borde con titulo para el panel catalogo
		TitledBorder border = BorderFactory.createTitledBorder("Detalle del catalogo");
		border.setTitleColor(Color.BLUE);
		panelCatalogo.setBorder(border);
		
		// agregando los componentes al panelBotones
		panelBotones.add(btnAgregarLibro);
		panelBotones.add(btnOpcion1);
		panelBotones.add(btnOpcion2);
		
		// agregando los componentes al panelCatalogo
		panelCatalogo.add(JS);
		panelCatalogo.add(panelSubCatalogo);
		
		// agregando panelCant y panelBtnCompra al panelSubCatalogo
		panelSubCatalogo.add(panelCant);
		panelSubCatalogo.add(panelBtnCompra);
		
		// agregando componenetes a panelCant y panelBtnCompra
		panelCant.add(labCantidad);
		panelCant.add(jtfCantidad);
		panelBtnCompra.add(Box.createRigidArea(new Dimension(1,15)));
		panelBtnCompra.add(btnComprar);
	}
	

}
