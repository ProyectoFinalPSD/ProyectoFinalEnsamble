package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.ModProveedor;
import modelo.Mundo;
import vista.GPPanelRegistroProveedores;
import vista.GUI;
import vista.GUIM1;
import vista.JFrameGestionProveedores;
//import vista.Ventana;

public class Controlador implements ActionListener {

	private GUI v;
	private Mundo m;
	
	private JFrameGestionProveedores j;
	private GPPanelRegistroProveedores jp;
	private GUIM1 gui1;

	public Controlador()
	{
		v = new GUI();
		
		j = new JFrameGestionProveedores(); 
		jp = new GPPanelRegistroProveedores();
		gui1 = new GUIM1();
		
		v.setVisible(true);
		j.setVisible(false);
		jp.setVisible(false);
		
		
		gui1.getPom1().getBtnAgregar().addActionListener(this);
		v.getPo().getBtnDatos().addActionListener(this);
		j.getPanelBotones().getCrear().addActionListener(this);
		jp.getBtnAgregar().addActionListener(this);
		//v.getPanel().getBtnAgregar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals(v.getPo().DATOS)) 
		{
			gui1.setVisible(true);
		}
		else if(e.getActionCommand().equals(gui1.getPom1().AGREGAR))
		{
			m.getModdat().crearCarpeta(gui1.getPe().getTxtNT().getText());
			m.getModdat().crearArchivos(gui1.getPe().getTxtNT().getText(), gui1.getPe().getTxtTipoC().getText(),gui1.getPe().getTxtNIT().getText(),  gui1.getPe().getTxtCOrigen().getText(), gui1.getPe().getTxtIVa().getText(), gui1.getPe().getTxtTasaInteres().getText(), gui1.getPe().getTxtNBanco().getText(), gui1.getPe().getTxtNumCuenta().getText(), gui1.getPe().getTxtNGerente().getText());
			gui1.setVisible(false);
		}
		else if(e.getActionCommand().equals(v.getPo().PROV))
		{
			j.setVisible(true);
			v.setVisible(false);
		}
		
		else if(e.getActionCommand().equals(j.getPanelBotones().CREAR))
		{
			jp.setVisible(true);
		}
		else if(e.getActionCommand().equals(jp.getAgregar()))
		{
			String NIT = jp.getNit().getText();
			String tel = jp.getTel().getText();
			String nombre = jp.getNom().getText();
			String direccion = jp.getAdress().getText();
			String ciudad = jp.getCiudad_().getText();
			
			m.getModprov().agregarProveedor(NIT, nombre, direccion, tel, ciudad);
			
		}
	}
}
	
	

