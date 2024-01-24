package ClaseTres;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine(); //Para caracteres. Si se quiere poner solo una palabra es sc.next así solo. Si se quiere poner más, es sc.nextLine


        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt(); //Para números enteros

        System.out.print("Ingresa tu año de nacimiento: ");
        int año = sc.nextInt();


        System.out.println("Hola, " + nombre + ". Tenés " + edad + " años. Tu año de nacimiento es " + año);

        //Cierre del Scanner para liberar recursos
        sc.close();

    }
}


