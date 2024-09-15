import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Declarando Variables
        String nombreCliete = "Tony Stark";
        String tipoDeCuenta = "Correinte";
        double saldoDisponible = 1599.99;
        String menu;
        int opcion;
        double retiro, depisito;

        System.out.println("""
                ***************************************  
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f$
                ***************************************
                """.formatted(nombreCliete, tipoDeCuenta, saldoDisponible));

        menu = """
                ***************************************
                ** Escribe el número de la aopción deseada **
                1 - Consulta de saldo
                2 - Retiro
                3 - Depósito
                9 - Salir
                """;

        do {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo disponible es de %.2f$".formatted(saldoDisponible));
                    break;
                case 2:
                    System.out.println("¿Cuál es el monto que desea retirar?");
                    retiro = teclado.nextDouble();
                    if (saldoDisponible < retiro){
                        System.out.println("Su saldo es insufucente para realizar este retiro");
                    }else{
                        saldoDisponible -= retiro;
                    }
                    System.out.println("Tu saldo disponible es de %.2f$".formatted(saldoDisponible));
                    break;
                case 3:
                    System.out.println("¿Cuál es el monto que desea depositar?");
                    depisito = teclado.nextDouble();
                    saldoDisponible += depisito;
                    System.out.println("Tu saldo disponible es de %.2f$".formatted(saldoDisponible));
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Inresaste una opción no disponible, por favor vuelve a intentarlo");
                    break;
            }
        } while (opcion != 9 );

    }
}