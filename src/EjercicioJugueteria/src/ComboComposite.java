import java.util.ArrayList;

public class ComboComposite implements Comprable{

    private Integer codigo;
    private ArrayList<Comprable> productos = new ArrayList<>();

    public ComboComposite(Integer codigo){
        this.codigo = codigo;
    }

    public void agregarProducto(Comprable c){
        this.productos.add(c);
    }


    @Override
    public Double getPrice() {
        Double precioTotal = 0.0;
        for (Comprable c:this.productos) {
            precioTotal += c.getPrice();
        }
        return precioTotal*0.85;
    }

    @Override
    public Double aplicarDescuento(String s) {
        if(s.equals("cupon15")){
            return this.getPrice()*0.85;
        } else {
            return this.getPrice()*0.70;
        }
    }
}
