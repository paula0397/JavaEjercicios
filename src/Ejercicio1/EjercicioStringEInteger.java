package Ejercicio1;

public class EjercicioStringEInteger {
    public static void main(String[] args) {

        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.

        String texto1 = "Paula";
        String texto2 = "Hernandez";

        if(texto1.equals(texto2))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintas");


    //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
    //Informar el resultado obtenido.

    Integer valor1 = 5;
    Integer valor2 = 10;
    int comparar;

    if (valor1.equals(valor2))
            System.out.println("Son iguales");
    else
    { comparar = valor1.compareTo(valor2);
        if(comparar > 0)
            System.out.println("Valor1 es mayor que valor2");
        else
            System.out.println("Valor2 es mayor que valor1");

    }

    }

}