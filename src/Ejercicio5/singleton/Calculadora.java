package Ejercicio5.singleton;

public class Calculadora { //es quien hace las cuentas, se transforma en dingleton para que todas puedan usarla

    //atributo
    private static Calculadora pepita;  //static significa que tiene scope global

    //constructor
    private Calculadora(){

    }

    public static  Calculadora getInstance(){
        if (pepita == null){
            pepita = new Calculadora();
        }
        return pepita;
    }


    //metodos

    public Double aplicarDescuento(Double monto, Double porcentajeDescuento){
        return monto*(100-porcentajeDescuento);
    }

    public Double aplicarIncremento(Double monto, Double porcentajeIncremento){
        return monto*(100-porcentajeIncremento);
    }

    public Double restarMonto(Double monto, Double cantidadRestar){
        return monto - cantidadRestar;
    }

    public Double sumarMonto(Double monto, Double cantidadSumar){
        return monto - cantidadSumar;
    }
}
