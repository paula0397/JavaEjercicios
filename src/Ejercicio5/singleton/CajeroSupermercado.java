package Ejercicio5.singleton;

public class CajeroSupermercado {
    //atributos
    private String nombre;
    private Integer id;

    private Calculadora calculadora = Calculadora.getInstance();


    //constructor


    public CajeroSupermercado(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    //metodos

    public Double aplicarDescuento(Double porcentaje, Double monto) {
        return this.calculadora.aplicarDescuento(monto,porcentaje);



        //return monto*(100-porcentaje); //porcetaje de descuento del 20%, se devuelve el 0.8

    }
    public Double aplicarRecargo(Double recargo, Double monto){
        return this.calculadora.aplicarIncremento(monto, recargo);
    }


}
