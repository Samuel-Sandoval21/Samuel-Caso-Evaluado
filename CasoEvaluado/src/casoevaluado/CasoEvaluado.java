/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado;
import javax.swing.JOptionPane;

/**
 *
 * @author samu0
 */
public class CasoEvaluado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

class Agente {
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private double comision;
    private int totalPuntos;
    private boolean vehiculoPropio;

    // Constructor
    public Agente(String nombre, String cedula, String codigo, String sucursal, double comision, int totalPuntos, boolean vehiculoPropio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.comision = comision;
        this.totalPuntos = totalPuntos;
        this.vehiculoPropio = vehiculoPropio;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        String info = "Información del Agente:\n"
                + "Nombre: " + nombre + "\n"
                + "Cédula: " + cedula + "\n"
                + "Código: " + codigo + "\n"
                + "Sucursal: " + sucursal + "\n"
                + "Comisión: " + comision + "\n"
                + "Puntos Acumulados: " + totalPuntos + "\n"
                + "Vehículo Propio: " + (vehiculoPropio ? "Sí" : "No");

        JOptionPane.showMessageDialog(null, info);
    }
}

    class Main {
    public static void main(String[] args) {
        // Pedir los datos al vendedor
        String nombreAgente = JOptionPane.showInputDialog("Ingrese el nombre del agente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del agente:");

        // Manejo seguro de entradas numéricas
        double comision = 0;
        int totalPuntos = 0;
        try {
            comision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la comisión del agente:"));
            totalPuntos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos acumulados:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Termina el programa si hay error en la entrada
        }

        // Preguntar por vehículo propio
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        // Si el usuario cierra la ventana, se cancela la operación
        if (respuesta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        boolean vehiculoPropio = (respuesta == JOptionPane.YES_OPTION);

        // Crear el objeto Agente
        Agente agente = new Agente(nombreAgente, cedula, codigo, sucursal, comision, totalPuntos, vehiculoPropio);

        // Mostrar la información del agente
        agente.mostrarInformacion();
    }
}

    }
}
    

