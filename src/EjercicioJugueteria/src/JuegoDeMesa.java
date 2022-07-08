public class JuegoDeMesa implements Comprable{

    private String nombre;
    private Integer CantJugMin;
    private Integer CantJugMax;
    private Double precio;

    public JuegoDeMesa(String nombre, Integer cantJugMin, Integer cantJugMax, Double precio) {
        this.nombre = nombre;
        this.CantJugMin = cantJugMin;
        this.CantJugMax = cantJugMax;
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
        } else if (s.equals("cupon30")){
            return this.precio*0.7;
        } else {
            System.out.println("El cupon no es valido");
            return this.precio;
        }
    }
}
