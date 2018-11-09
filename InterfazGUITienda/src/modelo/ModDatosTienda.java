package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JOptionPane;


public class ModDatosTienda {
	
	//private Parametros pa;
	private Properties p;
	private File carpetaC;
	
	public ModDatosTienda()
	{
	}
	

	public Properties getP() {
		return p;
	}


	public void setP(Properties p) {
		this.p = p;
	}


	public void crearCarpeta(String nombreTienda)
	{
			String carpeta= "./"+nombreTienda;
			carpetaC = new File(carpeta);
			carpetaC.mkdirs();
			if(carpetaC.exists()==true)
			{
				JOptionPane.showMessageDialog(null,"Existe");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Existe");
			}
	}
	public void crearArchivos(String nombreTienda, String tipoComercio, String NIT, String ciudadOrigen, String valorIva, String tasaInteres, String nombreBanco, String numeroCuenta,String nombreGerente)
	{
		try {
		crearCarpeta(nombreTienda);
		File configuracion = new File ("./"+nombreTienda+"/configuracion.properties");
		configuracion.createNewFile();
		FileInputStream fs = new FileInputStream(configuracion);
		p = new Properties();
		p.load(fs);
		
		p.setProperty("nombreTienda", nombreTienda);
		p.setProperty("TipoComercio", tipoComercio);
		p.setProperty("NIT", NIT);
		p.setProperty("CiudadOrigen", ciudadOrigen);
		p.setProperty("IVA", valorIva);
		p.setProperty("TasaI", tasaInteres);
		p.setProperty("NombreBanco", nombreBanco);
		p.setProperty("NumeroCuenta", numeroCuenta);
		p.setProperty("NombreGerente", nombreGerente);
		
		p.store(new FileOutputStream(configuracion), null);
		

			
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Error");
		}
	}
	public boolean existeCarpeta(String nombre)
	{
		boolean existe = false;
		crearCarpeta(nombre);
		if(carpetaC.exists() == true)
		{
			existe = true;
		}
	
		
		return existe;
	}
	public boolean cargarArchivos(String nombreTienda, String pregunta)
	{
		boolean cargar = false;
		
		boolean existe = existeCarpeta(nombreTienda);
		
		if (existe == true) 
		{
			p.getProperty("nombreTienda");
			if(nombreTienda.equalsIgnoreCase(pregunta) )
			{
				cargar = true;
			}
		} 
		else 
		{

		}
		
		
		return cargar;
	}
	
}