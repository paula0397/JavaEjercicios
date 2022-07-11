package Ejercicio8;

import java.util.ArrayList;

public class Constructora implements Comprable {

    private ArrayList<Comprable> paquetes = new ArrayList<>();

    public void addProducto(Comprable c){
        this.paquetes.add(c);
    };



    public void generarReporte(){
        for(Comprable c: this.paquetes){
            System.out.println("El paquete" + c.getClass() + " tiene un precio de " + c.getPrecio());
        }
    }

    @Override
    public Double getPrecio() {
        Double total = 0.0;
        for(Comprable p: paquetes){
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
