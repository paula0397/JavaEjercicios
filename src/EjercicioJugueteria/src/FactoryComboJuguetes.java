public class FactoryComboJuguetes {

    private static FactoryComboJuguetes instancia;

    private FactoryComboJuguetes(){

    }

    public static FactoryComboJuguetes getInstance(){
        if(instancia == null) {
            instancia = new FactoryComboJuguetes();
        }
        return instancia;

    }

    public Comprable fabricarProductos(String s){
        switch (s){
            case "Life":
                return new JuegoDeMesa("LIFE", 2,6,50.00);
            case "Spiderman":
                return new Juguete("Spiderman",5, 40.00);
            case "Combo navideno":
                JuegoDeMesa life = new JuegoDeMesa("LIFE", 2, 6,50.00);
                Juguete spiderman = new Juguete("Spiderman", 5, 40.00);
                Disfraz ironMan = new Disfraz("Iron man", "M",20.00);
                ComboComposite comboNavidad = new ComboComposite(223344);
                comboNavidad.agregarProducto(life);
                comboNavidad.agregarProducto(spiderman);
                comboNavidad.agregarProducto(spiderman);
                comboNavidad.agregarProducto(ironMan);

                return comboNavidad;
            default:
                return null;

        }
    }


}
