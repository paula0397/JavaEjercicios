package Ejercicio9Observable;

public class Program {
    public static void main(String[] args) {
        Observer juan = new Seguidor("Juan ");
        Observer Paula = new Seguidor("Paula ");

        Usuario britneySpears = new Usuario(" Britney Spears ");

        britneySpears.agregarSeguidor(juan);
        britneySpears.agregarSeguidor(Paula);

        britneySpears.agregarFoto("dfghj");
    }
}
