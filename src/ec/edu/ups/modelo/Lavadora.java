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
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double bono=0.00;
        
        if(carga>30){
        bono = 50;    
        
        }
        return precioBase + bono;
    }
    
    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

}