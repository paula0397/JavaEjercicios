package Ejercicio9Observable;

import java.util.ArrayList;

public class Usuario implements Observable {

    private String nombre;
    private ArrayList<Observer> seguidores;
    private ArrayList<String> fotos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.seguidores = new ArrayList<>();
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(String s){
        this.fotos.add(s);
        this.inform(this.nombre + "acaba de subir una foto");
    }

    public void quitarFoto(String s){
        this.fotos.remove(s);
        this.inform(this.nombre + "acaba de eliminar una foto");

    }

    public void agregarSeguidor(Observer o){
        this.seguidores.add(o);
        this.inform(this.nombre + "acaba de agregar al seguidor " + o.getNombre());

    }


    @Override
    public void inform(String mensaje) {
        for (Observer seguidor: this.seguidores){
            seguidor.updateState(mensaje);
        }

    }


}
