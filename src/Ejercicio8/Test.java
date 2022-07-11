package Ejercicio8;

public class Test {
    public static void main(String[] args) {


            ConstructoraFactory construir = ConstructoraFactory.getInstance();
            Comprable chalet = construir.crearVivienda("chaletPareado");
            Comprable homeSweetHome = construir.crearVivienda("homeSweetHome");
            Comprable hormigon = construir.crearVivienda("hormigon");
            Constructora constructora = new Constructora();
            constructora.addProducto(chalet);
            constructora.addProducto(homeSweetHome);
            constructora.addProducto(hormigon);
            constructora.generarReporte();
        }
    }

