package modelo;

public class Mundo {
	private Cliente c;
	private Producto prod;
	private Proveedor prov;
	
	private ModCliente modCl;
	private ModProducto modprod;
	private ModProveedor modprov;
	
	public Mundo(String valor1, String val2, String val3, String val4, String val5)
	{
		c = new Cliente(valor1, val2, val3, val4, val5);
		prod = new Producto(valor1, val2, val3, val4, val5);
		prov = new Proveedor(valor1, val2, val3, val4, val5);
		
		modCl = new ModCliente();
		modprod = new ModProducto();
		modprov = new ModProveedor();
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Producto getProd() {
		return prod;
	}

	public void setProd(Producto prod) {
		this.prod = prod;
	}

	public Proveedor getProv() {
		return prov;
	}

	public void setProv(Proveedor prov) {
		this.prov = prov;
	}

	public ModCliente getModCl() {
		return modCl;
	}

	public void setModCl(ModCliente modCl) {
		this.modCl = modCl;
	}

	public ModProducto getModprod() {
		return modprod;
	}

	public void setModprod(ModProducto modprod) {
		this.modprod = modprod;
	}

	public ModProveedor getModprov() {
		return modprov;
	}

	public void setModprov(ModProveedor modprov) {
		this.modprov = modprov;
	}

}
