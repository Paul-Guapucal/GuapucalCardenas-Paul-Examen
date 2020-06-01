/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author paul_
 */
public class Television extends Electrodomestico {
    
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }
    
    @Override
    public double obtenerPrecioFinal() {
        double bono1 = 0.00;
        double bono2 = 0.00;
        
        if(resolucion > 40){
            
            bono1 = (precioBase*0.3);
            
        }else if(puertoHDMI=true){
            bono2 = 50;
        }
        return (precioBase + bono1 + bono2);
    }
    
    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }

}