package Ejercicio2;

import java.util.Scanner;

public class StudyScanner {
    public static void main(String[] args) {
    Scanner scanner;

    scanner = new Scanner(System.in);

    int edad;
    String nombre;
    System.out.println("Ingrese su nombre");
    nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        edad=scanner.nextInt();

    }
}
