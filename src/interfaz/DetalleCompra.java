package interfaz;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class DetalleCompra extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2193752813323015332L;
	private JTable tabla;
	private JButton btnBorrar;
	private JLabel labTotal, labPrecioTotal;
	private JPanel panelTabla, panelTotal, panelPrincipal;
	
	public DetalleCompra() {
		setLayout(new BorderLayout());
		
		TitledBorder border = BorderFactory.createTitledBorder("Detalle del carrito de compras");
		border.setTitleColor(Color.BLUE);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(border);
		panelTabla = new JPanel();
		panelTotal = new JPanel();
		Border borde = BorderFactory.createLineBorder(Color.gray);
		
		String[][] libros = {};
		String[] encabezado = {"ISBN","Titulo","Cantidad","Subtotal"};
		
		btnBorrar = new JButton("Borrar");
		labTotal = new JLabel("Total");
		labPrecioTotal = new JLabel(" $ 0");
		labPrecioTotal.setPreferredSize(new Dimension(150,30));
		labPrecioTotal.setBorder(borde);
		
		tabla = new JTable(libros,encabezado);
		JScrollPane jsTabla = new JScrollPane(tabla);
		
		btnBorrar.setPreferredSize(new Dimension(155,28));
		jsTabla.setPreferredSize(new Dimension(480,150));
		
		add(panelPrincipal);
		panelPrincipal.add(panelTabla, BorderLayout.NORTH);
		panelPrincipal.add(panelTotal, BorderLayout.CENTER);
		panelTabla.add(jsTabla);
		panelTotal.add(btnBorrar);
		panelTotal.add(Box.createRigidArea(new Dimension(115,0)));
		panelTotal.add(labTotal);
		panelTotal.add(labPrecioTotal);
		
	}
	

}
