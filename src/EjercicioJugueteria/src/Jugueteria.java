import java.util.ArrayList;

public class Jugueteria{

    private ArrayList<Comprable> productos;

    public void agregarProducto(Comprable c){
        if(this.productos == null){
            this.productos = new ArrayList<>();
        }
        this.productos.add(c);
    }

    public void generarReporte(){
        for(Comprable c: this.productos){
            System.out.println("El producto" + c.getClass() + "tiene un precio de " + c.getPrice());
        }
    }
}
