package ClaseTres;

public class EstructuraSwitch {
    public static void main(String [] args) {
        String diaDeLaSemana = "martes";

        switch (diaDeLaSemana) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miércoles":
                System.out.println("Hoy es miércoles");
                break;
            case "jueves":
                System.out.println("Hoy es jueves");
                break;
            case "viernes":
                System.out.println("Hoy es viernes");
                break;
            case "sábado":
                System.out.println("Hoy es sábado");
                break;
            case "domingo":
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("Ese no es un día válido");
                break;
        }
    }
    }
