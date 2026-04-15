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
            System.out.println("1 - Buscar alumno");
        }
    }
}
