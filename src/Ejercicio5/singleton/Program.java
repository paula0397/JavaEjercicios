package Ejercicio5.singleton;

public class Program {
    public static void main(String[] args) {


        CajeroSupermercado lola = new CajeroSupermercado("Lola Lopez", 52525);

        Double monto = lola.aplicarDescuento(10.0, 154556.0);
        System.out.println(monto);

        Contador rodolfo = new Contador("Rodolfo", "UBA");
        Double monto2 = rodolfo.aplicarIVA(200.00);
        System.out.println(monto);
    }
}


