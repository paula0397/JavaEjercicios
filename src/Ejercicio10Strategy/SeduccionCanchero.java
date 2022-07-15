package Ejercicio10Strategy;

public class SeduccionCanchero implements SeduccionStrategy{
    @Override
    public void saludar() {
        System.out.println("Que haces? como andas");
    }

    @Override
    public void conversar() {
        System.out.println("como vas loco");
    }

    @Override
    public void pagar() {
        System.out.println("buenaaasss");
    }

    @Override
    public void despedir() {
        System.out.println("muy linda vos");
    }
}
