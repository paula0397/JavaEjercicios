public class Test {
    public static void main(String[] args) {

        FactoryComboJuguetes f = FactoryComboJuguetes.getInstance();
        Comprable sp = f.fabricarProductos("Spiderman");
        Comprable comboN = f.fabricarProductos("Combo navideno");
        Comprable Life = f.fabricarProductos("Life");

        System.out.println("Spiderman con descuento" + sp.aplicarDescuento("cupon15"));
        System.out.println("Combo " + comboN.aplicarDescuento("cupon15"));

        Jugueteria jugueteria = new Jugueteria();
        jugueteria.agregarProducto(sp);
        jugueteria.agregarProducto(comboN);
        jugueteria.agregarProducto(Life);

        jugueteria.generarReporte();

    }
}
