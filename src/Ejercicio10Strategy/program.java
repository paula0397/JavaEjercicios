package Ejercicio10Strategy;

public class program {

    public static void main(String[] args) {

        // juan asiste a un bliche

        PersonaEnLaDisco juan = new PersonaEnLaDisco("Juan");

        //primero ve a alguien intelectual

        SeduccionStrategy intelectual = new SeduccionIntelectual();
        juan.setMiEstrategia(intelectual);
        juan.saludar();     //la persona se asusta y se va


        //luego, se cruza con otra persona que parece canchera

        SeduccionStrategy canchero = new SeduccionCanchero();
        juan.setMiEstrategia(canchero);
        juan.saludar(); // tambien se va


        //finalmente charla con un extranjero

        SeduccionStrategy extranjero = new SeduccionExtrajera();
        juan.setMiEstrategia(extranjero);
        juan.saludar();
        juan.conversar();
        juan.pagar();
        juan.despedir();
    }
}
