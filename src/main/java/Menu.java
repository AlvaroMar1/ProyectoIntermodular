import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num != 7){
            System.out.println("1 - Registrar préstamo");
            System.out.println("2 - Registrar devolución");
            System.out.println("3 - Dar de alta un ejemplar/es");
            System.out.println("4 - Buscar un alumno");
            System.out.println("5 - Buscar un libro");
            System.out.println("6 - Ver historial de un ejemplar");
            System.out.println("7 - Salir");
        }

        if(num == 1){
            System.out.println("1 - Buscar alumno por nombre y apellidos");
            System.out.println("2 - Buscar alumno por DNI");

            System.out.println("si encuentra el alumno");
            System.out.println("Que ejemplares va a recibir:");

            System.out.println("si estan disponibles y son del mismo curso que el alumno");
            System.out.println("Préstamo registrado");
        }

        if(num == 2){
            System.out.println("Estado del libro devuelto");
        }
    }
}
