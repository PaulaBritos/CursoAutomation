package ClaseTres;

public class EstructurasRepetitivas {
    public static void main(String [] args) {
        //WHILE
        int contador = 0;
        while (contador < 5) {
            System.out.println("Hola Mundo");
            {
                contador++;
            }

        }
        //DO WHILE
        int numerito = 0;
        do {
            System.out.println("Hola qué tal");
            numerito++;
        }
        while (numerito < 5);

        //FOR
        for (int num = 0; num < 5; num++) {
            System.out.println("Hola Mundo");
        }
    }
}
