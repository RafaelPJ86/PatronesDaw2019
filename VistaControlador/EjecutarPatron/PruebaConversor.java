package EjecutarPatron;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
 
import VistaControlador.Controlador;
import VistaControlador.Modelo;
import VistaControlador.Vista;
 
public class PruebaConversor {
 public static void main(String arf[]) {
  try {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  }
  catch (UnsupportedLookAndFeelException e) {
  }
  catch (ClassNotFoundException e) {
  }
  catch (InstantiationException e) {
  }
  catch (IllegalAccessException e) {
  }
  Modelo modelo = new Modelo();
  Vista vista = new Vista();
  Controlador controlador = new Controlador(modelo, vista);
  controlador.iniciarVista();
 }
}