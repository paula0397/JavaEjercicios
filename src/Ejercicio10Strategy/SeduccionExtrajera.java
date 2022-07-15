package Ejercicio10Strategy;

public class SeduccionExtrajera implements SeduccionStrategy{


    @Override
    public void saludar() {
        System.out.println("Hello, how are you?");
    }

    @Override
    public void conversar() {
        System.out.println("The cat in under table");
    }

    @Override
    public void pagar() {
        System.out.println("This is on me, sweetheart");
    }

    @Override
    public void despedir() {
        System.out.println("Hope to see ya again");
    }
}
