/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;

import Clase_Imagen_Fondo.ImagenFondo;
import vista_Informes.Consulta_Agenda;
import vista_Informes.Consulta_Cliente;
import vista_Informes.Consulta_Empleado;
import vista_Informes.Consulta_Orden_de_Trabajo;
import vista_Informes.Consulta_Verificacion;
import vista_Movimiento.Agenda;
import vista_Movimiento.Boleta_de_Pago;
import vista_Movimiento.Orden_de_trabajo;
import vista_Movimiento.Presupuesto;
import vista_Movimiento.Recepcion;
import vista_Movimiento.Verificacion;

/**
 *
 * @author HOME
 */
public class menu extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setSize(1200, 700);
        setTitle("Menu del Sistema");
        setLocationRelativeTo(null);
       escritorio.setBorder(new ImagenFondo());
       //setIconImage( new ImageIcon(getClass()).getImage()("imagen/tpser.png"));
    }

    public void centrarVentana(JInternalFrame internal){
        int x = (escritorio.getWidth()/2)- internal.getWidth()/2;
        int y = (escritorio.getHeight()/2)- internal.getHeight()/2;
            if(internal.isShowing()){
                internal.setLocation(x, y);
            }else{
                escritorio.add(internal);
                internal.setLocation(x, y);
                internal.show();
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuConsulta = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Itemverificacion = new javax.swing.JMenuItem();
        ItemOrdendetrabajo = new javax.swing.JMenuItem();
        Itemempleado = new javax.swing.JMenuItem();
        ConItemagenda = new javax.swing.JMenuItem();
        Administrador = new javax.swing.JMenu();
        ItemEmpleado = new javax.swing.JMenuItem();
        ItemCargo = new javax.swing.JMenuItem();
        ItemUsuario = new javax.swing.JMenuItem();
        itemcliente = new javax.swing.JMenuItem();
        itemtipo_de_documento = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        AdmServMenu = new javax.swing.JMenu();
        ItemServicio = new javax.swing.JMenuItem();
        ItemTipodeservicio = new javax.swing.JMenuItem();
        ItemIva = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemvehiculo = new javax.swing.JMenuItem();
        ItemModelo = new javax.swing.JMenuItem();
        ItemMarca = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ItemCiudad = new javax.swing.JMenuItem();
        Itemnacionalidad = new javax.swing.JMenuItem();
        itemdepartamento = new javax.swing.JMenuItem();
        itembarrio = new javax.swing.JMenuItem();
        itempais = new javax.swing.JMenuItem();
        itemestado = new javax.swing.JMenuItem();
        itemformasdepago = new javax.swing.JMenuItem();
        itemperfil = new javax.swing.JMenuItem();
        Gestion = new javax.swing.JMenu();
        ItemRecepcion = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ItemVerificacion = new javax.swing.JMenuItem();
        Itemagenda = new javax.swing.JMenuItem();
        ItemPresupuesto = new javax.swing.JMenuItem();
        ItemOdendetrabajo = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ItemBoleta = new javax.swing.JMenuItem();
        Informe = new javax.swing.JMenu();
        jMenuItemayuda = new javax.swing.JMenuItem();
        jMenuIteminfo_del_sistema = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        ItemCerrarsesion = new javax.swing.JMenuItem();
        ItemSalir = new javax.swing.JMenuItem();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);
        getContentPane().add(escritorio);
        escritorio.setBounds(0, 0, 670, 440);

        MenuConsulta.setText("Consulta");

        itemClientes.setText("Clientes");
        MenuConsulta.add(itemClientes);
        itemClientes.addActionListener(this);
        MenuConsulta.add(jSeparator1);

        Itemverificacion.setText("Verificacion");
        MenuConsulta.add(Itemverificacion);
        Itemverificacion.addActionListener(this);

        ItemOrdendetrabajo.setText("Orden de trabajo");
        MenuConsulta.add(ItemOrdendetrabajo);
        ItemOrdendetrabajo.addActionListener(this);
     

        Itemempleado.setText("Empleado");
        MenuConsulta.add(Itemempleado);
        Itemempleado.addActionListener(this);

        ConItemagenda.setText("Agenda");
        MenuConsulta.add(ConItemagenda);
        ConItemagenda.addActionListener(this);

        jMenuBar1.add(MenuConsulta);

        Administrador.setText("Administrador");

        ItemEmpleado.setText("Empleado");
        Administrador.add(ItemEmpleado);
        ItemEmpleado.addActionListener(this);

        ItemCargo.setText("Cargo");
        Administrador.add(ItemCargo);
        ItemCargo.addActionListener(this);

        ItemUsuario.setText("Usuario");
        Administrador.add(ItemUsuario);
        ItemUsuario.addActionListener(this);

        itemcliente.setText("Cliente");
        Administrador.add(itemcliente);
        itemcliente.addActionListener(this);

        itemtipo_de_documento.setText("Tipo de Documento");
        Administrador.add(itemtipo_de_documento);
        itemtipo_de_documento.addActionListener(this);
        Administrador.add(jSeparator2);

        AdmServMenu.setText("Servicio");
        ItemServicio.setText("Servicios");
        ItemServicio.addActionListener(this);
        AdmServMenu.add(ItemServicio);

        ItemTipodeservicio.setText("Tipo de servicio");
        AdmServMenu.add(ItemTipodeservicio);
        ItemTipodeservicio.addActionListener(this);

        ItemIva.setText("Iva");
        AdmServMenu.add(ItemIva);
        ItemIva.addActionListener(this);

        Administrador.add(AdmServMenu);
        Administrador.add(jSeparator3);

        itemvehiculo.setText("Vehiculo");
        Administrador.add(itemvehiculo);
        itemvehiculo.addActionListener(this);

        ItemModelo.setText("Modelo");
        Administrador.add(ItemModelo);
        ItemModelo.addActionListener(this);

        ItemMarca.setText("Marca");
        Administrador.add(ItemMarca);
        ItemMarca.addActionListener(this);

        ItemCiudad.setText("Ciudad");
        Administrador.add(ItemCiudad);
        ItemCiudad.addActionListener(this);

        Itemnacionalidad.setText("Nacionalidad");
        Administrador.add(Itemnacionalidad);
        Itemnacionalidad.addActionListener(this);

        itemdepartamento.setText("Departamento");
        Administrador.add(itemdepartamento);
        itemdepartamento.addActionListener(this);

        itembarrio.setText("Barrios");
        Administrador.add(itembarrio);
        itembarrio.addActionListener(this);

        itempais.setText("Pais");
        Administrador.add(itempais);
        itempais.addActionListener(this);

        itemestado.setText("Estado");
        Administrador.add(itemestado);
        itemestado.addActionListener(this);

        itemformasdepago.setText("Formas de Pago");
        Administrador.add(itemformasdepago);
        itemformasdepago.addActionListener(this);

        itemperfil.setText("Perfil");
        Administrador.add(itemperfil);
        itemperfil.addActionListener(this);
        

        jMenuBar1.add(Administrador);

        Gestion.setText("Gestion");

        ItemRecepcion.setText("Recepcion");
        Gestion.add(ItemRecepcion);
        ItemRecepcion.addActionListener(this);
        Gestion.add(jSeparator5);
        

        ItemVerificacion.setText("Verificacion");
        Gestion.add(ItemVerificacion);
        ItemVerificacion.addActionListener(this);

        ItemPresupuesto.setText("Presupuesto");
        Gestion.add(ItemPresupuesto);
        ItemPresupuesto.addActionListener(this);
        
        Itemagenda.setText("Agenda");
        Gestion.add(Itemagenda);
        Itemagenda.addActionListener(this);

        ItemOdendetrabajo.setText("Orden de Trabajo");
        Gestion.add(ItemOdendetrabajo);
        ItemOdendetrabajo.addActionListener(this);
        Gestion.add(jSeparator6);

        ItemBoleta.setText("Boleta de Pago");
        Gestion.add(ItemBoleta);
        ItemBoleta.addActionListener(this);

        jMenuBar1.add(Gestion);

        Informe.setText("Acerca de");

        jMenuItemayuda.setText("Ayuda");
        Informe.add(jMenuItemayuda);

        jMenuIteminfo_del_sistema.setText("Info del Sistema");
        Informe.add(jMenuIteminfo_del_sistema);

        jMenuBar1.add(Informe);

        MenuSalir.setText("Salir");
        

        ItemCerrarsesion.setText("Cerrar sesion");
        MenuSalir.add(ItemCerrarsesion);

        ItemSalir.setText("Salir");
        MenuSalir.add(ItemSalir);

        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdmServMenu;
    private javax.swing.JMenu Administrador;
    private javax.swing.JMenuItem ConItemagenda;
    private javax.swing.JMenu Gestion;
    private javax.swing.JMenu Informe;
    private javax.swing.JMenuItem ItemRecepcion;
    private javax.swing.JMenuItem ItemBoleta;
    private javax.swing.JMenuItem ItemCargo;
    private javax.swing.JMenuItem ItemCerrarsesion;
    private javax.swing.JMenuItem ItemCiudad;
    private javax.swing.JMenuItem ItemEmpleado;
    private javax.swing.JMenuItem ItemIva;
    private javax.swing.JMenuItem ItemMarca;
    private javax.swing.JMenuItem ItemModelo;
    private javax.swing.JMenuItem ItemOdendetrabajo;
    private javax.swing.JMenuItem ItemOrdendetrabajo;
    private javax.swing.JMenuItem ItemPresupuesto;
    private javax.swing.JMenuItem Itemagenda;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenuItem ItemServicio;
    private javax.swing.JMenuItem ItemTipodeservicio;
    private javax.swing.JMenuItem ItemUsuario;
    private javax.swing.JMenuItem ItemVerificacion;
    private javax.swing.JMenuItem Itemempleado;
    private javax.swing.JMenuItem Itemnacionalidad;
    private javax.swing.JMenuItem Itemverificacion;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itembarrio;
    private javax.swing.JMenuItem itemcliente;
    private javax.swing.JMenuItem itemdepartamento;
    private javax.swing.JMenuItem itemestado;
    private javax.swing.JMenuItem itemformasdepago;
    private javax.swing.JMenuItem itempais;
    private javax.swing.JMenuItem itemperfil;
    private javax.swing.JMenuItem itemtipo_de_documento;
    private javax.swing.JMenuItem itemvehiculo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemayuda;
    private javax.swing.JMenuItem jMenuIteminfo_del_sistema;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==itemperfil){
		Perfil per= new Perfil();
		centrarVentana(per);
	}
		if(e.getSource()==itemestado){
			Estado est=new Estado();
			centrarVentana(est);
		}
		if(e.getSource()==itembarrio){
			Barrios ba=new Barrios();
			centrarVentana(ba);
		}
		if(e.getSource()==ItemCargo){
			Cargo car=new Cargo();
		centrarVentana(car);
		}
		if(e.getSource()==ItemCiudad){
			Ciudades ciu=new Ciudades();
			centrarVentana(ciu);
		}
		if(e.getSource()==itemcliente){
			Cliente cli =new Cliente();
			centrarVentana(cli);
		}
		if(e.getSource()==itemdepartamento){
			Departamento dep=new Departamento();
			centrarVentana(dep);
		}
		if(e.getSource()==ItemEmpleado){
			Empleado emp =new Empleado();
			centrarVentana(emp);
		}
		if(e.getSource()==itemformasdepago){
			Formas_de_Pago For =new Formas_de_Pago();
			centrarVentana(For);
		}
		if(e.getSource()==ItemIva){
			Iva Iv=new Iva();
			centrarVentana(Iv);
		}
		if(e.getSource()==ItemMarca){
			Marca mar=new Marca();
			centrarVentana(mar);
		}
		if(e.getSource()==ItemModelo){
			Modelo Mod=new Modelo();
			centrarVentana(Mod);
		}
		if(e.getSource()==Itemnacionalidad){
			Nacionalidad Nacio =new Nacionalidad();
			centrarVentana(Nacio);
		}
		if(e.getSource()==itempais){
			Paises pai=new Paises();
			centrarVentana(pai);
		}
		if(e.getSource()==ItemServicio){
			Servicios ser =new Servicios();
			centrarVentana(ser);
		}
		if(e.getSource()==itemtipo_de_documento){
			Tipo_de_Documento Tip =new Tipo_de_Documento();
			centrarVentana(Tip);
		}
		if(e.getSource()==ItemTipodeservicio){
			Tipo_de_Servicio TipS =new Tipo_de_Servicio();
			centrarVentana(TipS);
		}
		if(e.getSource()==ItemUsuario){
			Usuario Usu =new Usuario();
			centrarVentana(Usu);
		}
		if(e.getSource()==itemvehiculo){
			Vehiculo vehi =new Vehiculo();
			centrarVentana(vehi);
		}
		if(e.getSource()==Itemagenda){
			Agenda agen=new Agenda();
			centrarVentana(agen);
		}
		if(e.getSource()==ItemBoleta){
			Boleta_de_Pago Bole=new Boleta_de_Pago();
			centrarVentana(Bole);
		}
		if(e.getSource()==ItemOdendetrabajo){
			Orden_de_trabajo orde =new Orden_de_trabajo();
			centrarVentana(orde);
		}
		if(e.getSource()==ItemPresupuesto){
			Presupuesto pres =new Presupuesto();
			centrarVentana(pres);
		}
		if(e.getSource()==ItemRecepcion){
			Recepcion rec =new Recepcion();
			centrarVentana(rec);
		}
		if(e.getSource()==ItemVerificacion){
			Verificacion veri=new Verificacion();
			centrarVentana(veri);
		}
		if(e.getSource()==ConItemagenda){
		Consulta_Agenda ConA =new Consulta_Agenda();
			centrarVentana(ConA);
		}
		if(e.getSource()==itemClientes){
			Consulta_Cliente conC=new Consulta_Cliente();
			centrarVentana(conC);
		}
		if(e.getSource()==Itemempleado){
			Consulta_Empleado conE=new Consulta_Empleado();
			centrarVentana(conE);
		}
		if(e.getSource()==ItemOrdendetrabajo){
			Consulta_Orden_de_Trabajo  conOT=new Consulta_Orden_de_Trabajo();
			centrarVentana(conOT);
		}
		if(e.getSource()==Itemverificacion){
			Consulta_Verificacion conV =new Consulta_Verificacion();
			centrarVentana(conV);
		}
	
	}
}

