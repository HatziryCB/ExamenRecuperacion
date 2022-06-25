import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static protected int opcion, accion, contador, municipio, codigo,lector;
    static protected String departamento, cabecera, region;
    static ArrayList<RegistroLista> lista = new ArrayList<RegistroLista>();
    static Metodos metodos = new Metodos();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("    BIENVENIDO AL PROGRAMA DE REGISTRO DE DEPARTAMENTOS DE GUATEMALA    ");
        System.out.println("               Examen de Recuperacion de Programacion I");
        System.out.println("\nLos departamentos seran registrados por medio de Listas y Arreglos");
        System.out.println("\n1) Metodos por listas en Java");
        System.out.println("2) Metodos por arreglos en Java");
        System.out.print("\nPor favor seleccione el metodo que desea utilizar: ");
        opcion = sc.nextInt();
        if (opcion==1){
            System.out.println("\n    METODOS DE REGISTRO POR LISTAS    ");
            metodos.registro();
            do {
                System.out.println("\n                  MENU");
                System.out.println("1) Mostrar todos los elementos de la lista");
                System.out.println("2) Verificar elemento registrado en la lista");
                System.out.println("3) Busqueda de elemento por medio de numero en la lista");
                System.out.println("4) Salir del programa");
                System.out.print("\nIngresa la opcion que desea realizar: ");
                accion = sc.nextInt();
                sc.nextLine();
                switch (accion){
                    case 1:
                        System.out.println("\nMostrando los elementos de la lista a continuación:");
                        System.out.println(lista);
                        break;
                    case 2:
                        System.out.print("\nIngrese el nombre del departamento que desea consultar: ");
                        String elemento = sc.nextLine();
                        metodos.busquedaLista(elemento);
                        break;
                    case 3:
                        System.out.print("\nIngrese la posicion en el que fue registrado el departamento: ");
                        int numero = sc.nextInt();
                        metodos.busquedaNumero(numero);
                        break;
                }
            }while (accion != 4);
        } else if (opcion==2) {
            System.out.println("\n    METODOS DE REGISTRO POR ARREGLOS  ");
            metodos.registro();
            do {
                System.out.println("\n                     MENU");
                System.out.println("1) Mostrar todos los registros en el arreglo");
                System.out.println("2) Buscar e identificar la posicion del elemento en el arreglo");
                System.out.println("3) Buscar departamento por medio de iniciales");
                System.out.println("4) Mostrar los departamentos en posiciones pares con mas de 4 Municipios");
                System.out.println("5) Mostrar cabecera del departamento a eleccion");
                System.out.println("6) Mostrar departamentos registrados en las posiciones impares");
                System.out.println("7) Salir del programa");
                System.out.print("\nIngresa la opcion que deseas realizar: ");
                accion = sc.nextInt();
                switch (accion){
                    case 1:
                        System.out.println("\nMostrando todos los elementos almacenados en el arreglo:");
                        metodos.mostrarArreglo();
                        break;
                    case 2:
                        metodos.busqueda();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                }
            }while (accion!=7);
        }
    }
}
