package ClaseTres;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {
    public static void main(String [] args) {
        //TIPOS DE DATOS
        int edad = 26; //Enteros
        String nombre = "Paula"; //De texto
        float promedio = 7.5f; //Decimales
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: "+ edad);
        System.out.println("Su promedio es: " + promedio);

        //COLECCIONES - ARRAYS
        String[] ArrayDeAmigos= new String [4]; //Siempre se empieza desde el 0
        ArrayDeAmigos[0]= "Agus";
        ArrayDeAmigos[1]= "Solci";
        ArrayDeAmigos[2]= "Ro";
        ArrayDeAmigos[3]= "Jasón";
        System.out.println("Mi amigue número 4 es: " + ArrayDeAmigos[3]);
        System.out.println("Mi amigue número 1 es: " + ArrayDeAmigos[0]);

        int[] ArrayDeEdades= new int [4];
        ArrayDeEdades[0] = 26;
        ArrayDeEdades[1]= 24;
        ArrayDeEdades[2]= 23;
        ArrayDeEdades[3]= 27;

        System.out.println("Mi amiga " + ArrayDeAmigos[0]+ " tiene "+ ArrayDeEdades[0] + " años"); //Acá combinamos los dos arrays


        //COLECCIONES - LISTAS
        //Siempre se usa la list de java.util
        List<String> listaDeCompras = new ArrayList<>();
        //List<tipo de lista> nombreDeLista = new ArrayList<>();

        listaDeCompras.add("Zanahorias");
        listaDeCompras.add("Papas");
        listaDeCompras.add("Cebollas");
        listaDeCompras.add("Pimiento");

        System.out.println("Cosas que tengo para comprar: " + listaDeCompras); //Acá se imprime en pantalla todas las posiciones
        //Para acceder a una posición en particular se hace de la siguiente manera:

        System.out.println("Necesito comprar urgente: " + listaDeCompras.get(3));
        System.out.println("Comprar en el super: " + listaDeCompras.get(0));

        //Para eliminar un elemento de la lista se hace de la siguiente manera:

        listaDeCompras.remove(1);
        System.out.println("Mi nueva lista de compras es: " +listaDeCompras);
        //AAAAAAAAAAAAAAH ME ESTA SALIENDO TODOOOOOOOOOOO Y ESTOY ENTENDIENDO. VAMO CARAJO <3


    }
}
