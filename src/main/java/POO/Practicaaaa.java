package POO;

import org.w3c.dom.ls.LSOutput;

public class Practicaaaa {
    public static void main(String[] args) {


        Alumno alu1 = new Alumno(); //Acá estoy usando el constructor vacío
        Alumno alu2 = new Alumno(1234, "Marcos", "García"); //Acá estoy usando el constructor con todos los datos

        //Acá estoy mostrando por pantalla los datos del Alumno 2
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
        System.out.println("El nombre del alumno 2 es: " +alu2.getNombre());
        System.out.println("El ID del alumno 2 es: " + alu2.getId());
        System.out.println("-------------------------");


        //Acá voy a asignar datos a mi constructor vacío: el alumno 1
        alu1.setId(2568);
        alu1.setNombre("Francisca");
        alu1.setApellido("Farías");


        //Y acá los muestro en pantalla
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());
        System.out.println("El nombre del alumno 1 es: " +alu1.getNombre());
        System.out.println("El ID del alumno 1 es: " + alu1.getId());
        System.out.println("-------------------------");

        //Supongamos que queremos modificar el ID del alumno 2
        alu2.setId(1235);
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
        System.out.println("El nombre del alumno 2 es: " +alu2.getNombre());
        System.out.println("El ID del alumno 2 es: " + alu2.getId());

    }
}
