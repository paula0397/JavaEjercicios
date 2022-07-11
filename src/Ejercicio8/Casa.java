package Ejercicio8;

public class Casa implements Comprable{

    private String tipoDeCasa;
    private Double metroCuadradoCubierto;
    private Double precioMetroCuadrado;
    private Integer cantMaxAmbientes;

    public Casa(String tipoDeCasa, Double metroCuadradoCubierto, Double precioMetroCuadrado, Integer cantMaxAmbientes) {
        this.tipoDeCasa = tipoDeCasa;
        this.metroCuadradoCubierto = metroCuadradoCubierto;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.cantMaxAmbientes = cantMaxAmbientes;
    }

    @Override
    public Double getPrecio() {
        Double total = 0.0;
        total = this.metroCuadradoCubierto * precioMetroCuadrado;
        return total;
    }

    public String getTipo() {
        return this.tipoDeCasa;
    }

}
