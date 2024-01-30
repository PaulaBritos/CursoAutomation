package Calculadora;

import java.util.Scanner;

public class Parte1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int primero = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int segundoNumero = sc.nextInt();

        System.out.print("Ingresa qué operación quieres realizar (+ - * /): ");
        char operacion = sc.next().charAt(0);



    }

}
