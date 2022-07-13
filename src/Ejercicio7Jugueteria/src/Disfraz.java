public class Disfraz implements Comprable{

    private String descripcion;
    private String tallaDisfraz;
    private Double precio;

    public Disfraz(String descripcion, String tallaDisfraz, Double precio) {
        this.descripcion = descripcion;
        this.tallaDisfraz = tallaDisfraz;
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
