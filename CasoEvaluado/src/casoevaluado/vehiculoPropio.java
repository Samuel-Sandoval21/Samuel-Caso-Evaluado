/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado;

/**
 *
 * @author samu0
 */
class vehiculoPropio {

    private boolean vehiculoPropio;
    public boolean isvehiculoPropio() {
        boolean vehiculoPropio = false;
        return vehiculoPropio;
    }
    
    public void setvehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }
    
    
   public void mostrarInformacion() {
       System.out.println("Vehículo Propio  : " + (vehiculoPropio ? "Sí" : "No"));
   }


}

