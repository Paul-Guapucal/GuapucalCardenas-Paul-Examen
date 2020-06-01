/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.IDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.SortedSet;

/**
 *
 * @author paul_
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {

    private SortedSet <Electrodomestico> lista;

    @Override
    public void create(Television television) {
        lista.add(television);
    }

    @Override
    public void create(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevision() {
        return null;
    }

    @Override
    public List<Lavadora> listarLavadora() {
        return null;
    }
    
}
