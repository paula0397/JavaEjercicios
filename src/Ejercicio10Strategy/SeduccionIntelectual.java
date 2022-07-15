package Ejercicio10Strategy;

public class SeduccionIntelectual implements SeduccionStrategy{
    @Override
    public void saludar() {
        System.out.println("Buen dia, un agrado conocerle");
    }

    @Override
    public void conversar() {
        System.out.println("");
    }

    @Override
    public void pagar() {
        System.out.println("Hello, how are you?");
    }

    @Override
    public void despedir() {
        System.out.println("Hello, how are you?");
    }
}
