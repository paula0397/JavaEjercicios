public class Juguete implements Comprable {

    private String nombre;
    private Integer edadAptaParaNinos;
    private Double precio;

    public Juguete(String nombre, Integer edadAptaParaNinos, Double precio) {
        this.nombre = nombre;
        this.edadAptaParaNinos = edadAptaParaNinos;
        this.precio = precio;
    }

    @Override
    public Double getPrice() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String s) {
        if(s.equals("cupon15")){
            return this.precio*0.85;
        } else {
            return this.precio*0.7;
        }
    }
}
