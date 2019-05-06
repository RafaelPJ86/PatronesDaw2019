package VistaControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
 
public class Controlador implements ActionListener {
 private Modelo modelo;
 private Vista vista;
 private Double cantidad;
  
 public Controlador(Modelo modelo, Vista vista) {
  this.modelo = modelo;
  this.vista = vista;
   
  this.vista.euros.addActionListener(this);
  this.vista.dolares.addActionListener(this);
 }
 public void iniciarVista() {
  vista.setTitle("Conversor");
  vista.pack();
  vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  vista.setLocationRelativeTo(null);
  vista.setVisible(true); 
 }
 public void actionPerformed(ActionEvent evento) {
  if(vista.euros == evento.getSource()) {
   if(!"".equals(vista.campoTexto.getText())) {
    try{
     cantidad = Double.parseDouble(vista.campoTexto.getText());
     modelo.setCantidad(cantidad);
     modelo.setMoneda(0.89);
     modelo.convetirDolarAEuro();
     vista.lResultado.setText(modelo.getResultado().toString());
    }catch(NumberFormatException e) {
     vista.lResultado.setText("Introduzca una cantidad valida...");
    }
   }
  }
  else if(vista.dolares == evento.getSource()) {
   if(!"".equals(vista.campoTexto.getText())) {
    try{
     cantidad = Double.parseDouble(vista.campoTexto.getText());
     modelo.setCantidad(cantidad);
     modelo.setMoneda(1.12);
     modelo.convertirEuroADolar();
     vista.lResultado.setText(modelo.getResultado().toString());
    }catch(NumberFormatException e) {
     vista.lResultado.setText("Introduzca una cantidad valida...");
    }
   }
  }
 }

}
