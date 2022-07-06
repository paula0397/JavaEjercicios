package Ejercicio4.piedaPapelOTijera;

public class Juego {

    public Integer cualGana(String jugadaJugador1, String jugadaJugador2){
         if (jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")) {
            return 1;
        } else if (jugadaJugador1.equals("papel") && jugadaJugador2.equals("tijera")) {
             return 2;
         } else if (jugadaJugador1.equals("piedra") && jugadaJugador2.equals("papel")) {
             return 2;
         } else if (jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel")) {
             return 1;
         }
        return 0;
    }
}
