package Ejercicio8;

import java.util.ArrayList;

public class CompositePremium implements Comprable {

    private ArrayList<Comprable> paquetes = new ArrayList<>();
    private String nombre;
    private Double bonificacion;


    public CompositePremium(String nombre, Double bonificacion) {
        this.nombre = nombre;
        this.bonificacion = bonificacion;
    }

    public void agregarPaquete(Comprable c){
        this.paquetes.add(c);
    }

    @Override
    public Double getPrecio() {
        Double total = 0.0;
        for(Comprable p: paquetes){
            total += p.getPrecio();
        }
        total *= (100 - bonificacion) / 100;
        return total;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}