package matematicas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar el ingreso de los números
        System.out.println("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        //Instanciacion objetos
        //nombre de la clase + nombre variable + =new
        Operaciones operaciones = new Operaciones(primerNumero, segundoNumero);

        //Menú de opciones
        System.out.println("Seleccione la operación que desea realizar: \n ");
        System.out.println("1 Suma: ");
        System.out.println("2 Resta:  ");
        System.out.println("3 Multiplicación: ");
        System.out.println("4 División: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: \n " + operaciones.suma());
                break;

            case 2:
                System.out.println("El resultado de la resta es: \n " + operaciones.resta());
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: \n " + operaciones.multiplicacion());
                break;
            case 4:
                System.out.println("El resultado de la división es: \n " + operaciones.division());
                break;
            default:

                System.out.println("La opción que selecciono es invalida");
                break;
        }
        scanner.close();

    }
}
