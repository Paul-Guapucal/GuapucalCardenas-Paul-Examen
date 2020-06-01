/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import java.util.Scanner;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.modelo.Lavadora;
import java.util.List;
/**
 *
 * @author paul_
 */
public class VistaElectrodomestico {
    
    Scanner entrada = new Scanner(System.in);
    
    public Television ingresarTelevision() {
    
        System.out.println("\nIngrese los datos de la television");
        System.out.println("\nIngrese el codigo de la television");
        int codigo = entrada.nextInt();
        
        System.out.println("\nIngrese la descripcion del producto");
        String descripcion = entrada.next();

        System.out.println("\nIngrese el precio base de la television");
        double precioBase = entrada.nextDouble();
        
        System.out.println("\nIngrese el color de la television");
        String color = entrada.next();
        
        System.out.println("\nIngrese el consumo energetico que tiene la television");
        String consumoEnergetico = entrada.next();
        char cEnergetico = consumoEnergetico.charAt(0);
        
        System.out.println("\nIngrese el peso de la television en entero por favor");
        int peso = entrada.nextInt();
        
        System.out.println("\nIngrese la resolucion de la television");
        int resolucion = entrada.nextInt();
        
        System.out.println("\nIngrese true o false si tiene puerto HDMI");
        boolean puertoHDMI = entrada.nextBoolean();
        
        return new Television(resolucion, puertoHDMI, codigo, descripcion, precioBase, color, cEnergetico, peso);
        
    }
    
    public Lavadora ingresarLavadora() {
    
        System.out.println("\nIngrese los datos de la lavadora");
        System.out.println("\nIngrese el codigo de la lavadora");
        int codigo = entrada.nextInt();
        
        System.out.println("\nIngrese la descripcion del producto");
        String descripcion = entrada.next();

        System.out.println("\nIngrese el precio base de la lavadora");
        double precioBase = entrada.nextDouble();
        
        System.out.println("\nIngrese el color de la lavadora");
        String color = entrada.next();
        
        System.out.println("\nIngrese el consumo energetico que tiene la lavadora");
        String consumoEnergetico = entrada.next();
        char cEnergetico = consumoEnergetico.charAt(0);
        
        System.out.println("\nIngrese el peso de la lavadora en entero por favor");
        int peso = entrada.nextInt();
        
        System.out.println("\nIngrese la carga de la lavadora");
        int carga = entrada.nextInt();
        
        return new Lavadora(carga, codigo, descripcion, precioBase, color, cEnergetico, peso);
        
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
        
        for(Television television : televisiones){
            System.out.println("Datos de las televisiones: " +television);
        }
        
    }
    public void mostrarLavadoras(List<Lavadora> lavadoras){
        
        for(Lavadora lavadora : lavadoras){
            System.out.println("Datos de las lavadoras: " +lavadora);
        }
        
    }    
}
