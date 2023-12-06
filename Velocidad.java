import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la velocidad:");
        double vel= scanner.nextDouble();
        System.out.println("Ingrese la distancia recorrida:");
        double dis= scanner.nextDouble();
        double tiempo=dis/vel;
        System.out.println("El tiempo para recorrer "+dis+" km es de "+tiempo+" horas" );
    }
}