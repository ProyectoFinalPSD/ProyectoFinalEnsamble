package vista;

public class MundoVista
{ 
	private JFrameFacturaVenta VPFV;
	private JFrameGestionClientes VPGCL;
	private JFrameGestionProveedores VPGP;
	private JFrameGestionProductos VPGPRO;
	private JFrameRegistroTiendaParametros VPRTP;

	public MundoVista()
	{
		VPFV =  new JFrameFacturaVenta();
		VPGCL = new JFrameGestionClientes();
		VPGP =  new JFrameGestionProveedores();
		VPGPRO =  new JFrameGestionProductos();
		VPRTP = new JFrameRegistroTiendaParametros();
	}

	public JFrameFacturaVenta getVPFV() 
	{
		return VPFV;
	}

	public void setVPFV(JFrameFacturaVenta vPFV) 
	{
		VPFV = vPFV;
	}

	public JFrameGestionClientes getVPGCL() 
	{
		return VPGCL;
	}

	public void setVPGCL(JFrameGestionClientes vPGCL)
	{
		VPGCL = vPGCL;
	}

	public JFrameGestionProveedores getVPGP() 
	{
		return VPGP;
	}

	public void setVPGP(JFrameGestionProveedores vPGP) 
	{
		VPGP = vPGP;
	}

	public JFrameGestionProductos getVPGPRO() 
	{
		return VPGPRO;
	}

	public void setVPGPRO(JFrameGestionProductos vPGPRO) 
	{
		VPGPRO = vPGPRO;
	}

	public JFrameRegistroTiendaParametros getVPRTP() 
	{
		return VPRTP;
	}

	public void setVPRTP(JFrameRegistroTiendaParametros vPRTP) 
	{
		VPRTP = vPRTP;
	}

}
