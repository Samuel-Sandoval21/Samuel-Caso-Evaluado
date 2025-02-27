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
public class Agente {
    private String nombreAgente;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean vehiculoPropio;
    private double comision = 0.0;
    private int totalPuntos = 0;

    Agente() {
        
    }

    Agente(String nombreAgente, String cedula, String codigo, String sucursal, double comision, int totalPuntos, boolean vehiculoPropio) {
       
    }
    
    public String getNombreAgente() {    
        return nombreAgente;
        
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    // Constructor
    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public Agente(String nombreAgente, String cedula, String codigo, String sucursal, boolean vehiculoPropio, double comision, int totalPuntos) {
        this.nombreAgente = nombreAgente;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculoPropio = vehiculoPropio;
        this.comision = 0;
        this.totalPuntos = 0;
    }
    
    public void mostrarInformacion() {
    System.out.println("=================================");
    System.out.println("       Información del Agente    ");
    System.out.println("=================================");
    System.out.println("Nombre           : " + nombreAgente);
    System.out.println("Cédula           : " + cedula);
    System.out.println("Código           : " + codigo);
    System.out.println("Sucursal         : " + sucursal);
    System.out.println("Vehículo Propio  : " + (vehiculoPropio ? "Sí" : "No"));
    System.out.println("Comisión         : $" + String.format("%.2f", comision));
    System.out.println("Total de Puntos  : " + totalPuntos);
    System.out.println("=================================");
}

    
}
    

  
    

    
    
    
 
    
    

    