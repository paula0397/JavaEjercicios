package Ejercicio8;

public class ConstructoraFactory {


    private static ConstructoraFactory instance;

    public ConstructoraFactory() {
    }

    public static ConstructoraFactory getInstance(){
        if(instance == null){
            instance = new ConstructoraFactory();
        }
        return instance;
    }

    public Comprable crearVivienda(String s){
        switch (s){
            case "ChaletPareado":
                return new Casa("Chalet Pareado", 200.0, 1.500,6);
            case "Hormigon":
                return new Piscina("Hormigon", 40.000, "cuadrada", false, 1.10, null );
            case "HomeSweetHome":
                CompositePremium homeSweetHome = new CompositePremium("Home Sweet Home", 5.0);
                Casa aislada = new Casa("Casa aislada", 420.0, 3.200, null);
                Piscina desbordante = new Piscina("Piscina Desbordante",60000.0,"Cuadrada", true,2.10,30000.0);
                homeSweetHome.agregarPaquete(aislada);
                homeSweetHome.agregarPaquete(desbordante);
                return homeSweetHome;
            default:
                return null;
        }
    }

}
