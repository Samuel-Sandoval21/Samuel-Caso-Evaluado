/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado;
import javax.swing.JOptionPane;

/**
 *
 * @author samu0
 */
public class Factura {

   public double calcularComision() {
       int cantidad = 0;
       double montoBase = 50000; // 50000 por 3 tipos de producto
       montoBase *= 10;
       double bono = 0;
       double comision = 0;
       boolean electricos = false;
       
       
       if (electricos) {
            comision += montoBase * 0.004;
      
       }
       boolean automotrices = false;
       
       if (automotrices) {
           comision += montoBase * 0.004;
           
       }
       boolean construccion = false;
       
       if (construccion) {
           comision += montoBase * 0.008;
       }
       return montoBase+comision;
       
       
   }

   public int calcularPuntos() {
        int puntos = 0;
       boolean electricos = false;
        if (electricos) puntos += 1;
       boolean automotrices = false;
        if (automotrices) puntos += 1;
       boolean construccion = false;
        if (construccion) puntos += 2;
       return puntos;
    }
   
    
}
