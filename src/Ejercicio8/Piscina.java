package Ejercicio8;

public class Piscina implements Comprable{

    private String tipo;
    private Double cantLitros;
    private String forma;
    private Boolean iluminacion;
    private Double precioXLitro;
    private Double precioIluminacion;

    public Piscina(String tipo, Double cantLitros, String forma, Boolean iluminacion, Double precioXLitro, Double precioIluminacion) {
        this.tipo = tipo;
        this.cantLitros = cantLitros;
        this.forma = forma;
        this.iluminacion = iluminacion;
        this.precioXLitro = precioXLitro;
        this.precioIluminacion = precioIluminacion;
    }

    @Override
    public Double getPrecio() {
        Double total;
        total = this.cantLitros * precioXLitro;
        if (iluminacion){
            total += precioIluminacion;
        }
        return total;
    }

    public String getTipo() {
        return this.tipo;
    }

}