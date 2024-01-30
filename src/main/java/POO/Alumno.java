package POO;

public class Alumno {

        //Estos son los atributos
        int id;
        String nombre;
        String apellido;

    public Alumno() { //Esto es un constructor vacío
    }

    public Alumno(int id, String nombre, String apellido) { //Esto es un constructor con todos los atributos que puse antes
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre() { //Este es el método

            System.out.println("Soy un alumno y sé decir mi nombre");
        }
    }


