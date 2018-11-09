package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private FVPanelInfoCliente PFVPanelInfo;
	private FVPanelCantidadProducto PFVPanelProducto;
	private FVPanelBtnCompraProducto PFVPanelBotones;
	private FVPanelTablaProductos PFVPanelListadoPro;
	
	
	public JFrameFacturaVenta()
	{
		setSize(550,700);
		setResizable(false);
		setTitle("FACTURA DE VENTA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		PFVPanelInfo = new FVPanelInfoCliente();
		add(PFVPanelInfo, BorderLayout.NORTH);
		
		PFVPanelProducto = new FVPanelCantidadProducto();
		add(PFVPanelProducto, BorderLayout.WEST);
		
		PFVPanelBotones =  new FVPanelBtnCompraProducto();
		add(PFVPanelBotones, BorderLayout.SOUTH);
		
		PFVPanelListadoPro = new FVPanelTablaProductos();
		add(PFVPanelListadoPro, BorderLayout.CENTER);		
	}

}
