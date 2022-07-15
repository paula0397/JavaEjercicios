package Ejercicio10Strategy;

public class PersonaEnLaDisco {

    private SeduccionStrategy miEstrategia;
    private String nombre;


    public PersonaEnLaDisco(String nombre) {
        this.nombre = nombre;
    }

    public void setMiEstrategia(SeduccionStrategy ss){
        this.miEstrategia =ss;
    }

    public void saludar(){
        this.miEstrategia.saludar();
    }

    public void conversar(){
        this.miEstrategia.conversar();
    }
    public void pagar(){
        this.miEstrategia.pagar();
    }
    public void despedir(){
        this.miEstrategia.despedir();
    }

    public void saludar2(String tipoDePersona){
        if(tipoDePersona.equals("intelectual")){
            System.out.println("Buen dia, un agrado conocerle");
        } else if (tipoDePersona.equals("canchero")) {
            System.out.println("Que haces? como andas");
        }else {
            System.out.println("Hello, how are you?");
        }
    }

}
