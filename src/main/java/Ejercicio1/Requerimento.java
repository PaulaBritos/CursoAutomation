package Ejercicio1;

import java.util.Scanner;

public class Requerimento {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 5) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            int primerNumero = sc.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int segundoNumero = sc.nextInt();

            System.out.print("Ingresa qué operación quieres realizar (+ - * /): ");
            char operacion = sc.next().charAt(0);


            int resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = Calculadora.sumar(primerNumero, segundoNumero);
                    break;
                case '-':
                    resultado = Calculadora.restar(primerNumero, segundoNumero);
                    break;
                case '*':
                    resultado = Calculadora.multiplicar(primerNumero, segundoNumero);
                    break;
                case '/':
                    resultado = Calculadora.dividir(primerNumero, segundoNumero);
                    break;
                default:
                    System.out.println("Operación no válida");
            }
            System.out.println("El resultado es: " + resultado);

            if (resultado < 0) {
                System.out.println("¡Cuidado! El resultado es negativo");
            } else if (resultado == 0 || resultado < 10000) {
                System.out.println("El valor está dentro de los límites");
            } else {
                System.out.println("Error. Resultado muy grande");
            }
            System.out.println();
            contador++;
        }
    }
}










