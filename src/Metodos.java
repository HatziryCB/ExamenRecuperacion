import java.awt.*;
import java.util.Scanner;

public class Metodos extends Menu {
    private int contador, municipio, codigo, lector;
    private String departamento, cabecera, region;
    protected String[] arreglo = new String[50];
    protected String[] vectorNombre = new String[50];
    protected int[] numeroMun = new int[50];
    protected String[] capital = new String[50];
    Scanner sc = new Scanner(System.in);
    Main menu = new Main();
    String buscar;
    int indice = 0;

    public void registro() {
        System.out.print("Ingrese la cantidad de registros que desea almacenar: ");
        contador = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            System.out.println("\nRegistro " + (i + 1));
            System.out.print("Codigo del departamento: ");
            codigo = sc.nextInt();
            System.out.print("Nombre del departamento: ");
            sc.nextLine();
            departamento = sc.nextLine();
            System.out.print("Numero de municipios: ");
            municipio = sc.nextInt();
            System.out.print("Cabecera: ");
            sc.nextLine();
            cabecera = sc.nextLine();
            System.out.println("\n1) Region Norte");
            System.out.println("2) Region Sur");
            System.out.println("3) Region Este");
            System.out.println("4) Region Oeste");
            System.out.print("Seleccione la region a la que pertenece: ");
            lector = sc.nextInt();
            switch (lector) {
                case 1:
                    region = "Norte";
                    break;
                case 2:
                    region = "Sur";
                    break;
                case 3:
                    region = "Este";
                    break;
                case 4:
                    region = "Oeste";
                    break;
            }
            RegistroLista registro = new RegistroLista(codigo, departamento, municipio, cabecera, region);
            Main.lista.add(registro);
            vectorNombre[i] = departamento;
            numeroMun[i] = municipio;
            capital[i] = cabecera;
            this.registroArreglo(codigo, departamento, municipio, cabecera, region);
        }
    }

    public void registroArreglo(int codigo, String departamento, int municipio, String cabecera, String region) {
        indice = indice + 1; //indice+=1; <== is the same, se puede escribir de ambas formas
        arreglo[indice] = "Codigo del departamento: " + codigo + "\nNombre de departamento: " + departamento + "\nNumero de municipios: " + municipio + "\nCabecera: " + cabecera + "\nRegion: " + region + "\n";
    }

    public void mostrarArreglo() {
        try {
            for (int i = 1; i < arreglo.length; i++) {
                if (!arreglo[i].isEmpty()) {
                    System.out.println(arreglo[i]);
                }
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public void busquedaLista(String elemento) {
        for (int i = 0; i < Main.lista.size(); i++) {
            RegistroLista registro = Main.lista.get(i);
            if (registro.getDepartamento().equals(elemento)) {
                System.out.println("\nEl departamento de \"" + elemento + "\", SI se encuentra en el registro.");
                return;
            }
        }
        System.out.println("\nEl departamento de \"" + elemento + "\", NO se encuentra en el registro.");
    }

    public void busquedaNumero(int numero) {
        for (int i = 0; i < Main.lista.size(); i++) {
            RegistroLista registro = Main.lista.get(i);
            if (Main.lista.get(i).equals(Main.lista.get(numero - 1))) {
                System.out.println("El departamento registrado en la posicion => " + numero + " es: \"" + registro.getDepartamento() + "\"");
                return;
            }
        }
        System.out.println("Los datos no son compatibles");
    }

    public void busqueda() {
        int iterador = -1;
        System.out.print("\nIngrese el nombre del departamento que desea consultar: ");
        sc.nextLine();
        buscar = sc.nextLine();
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == null ? (buscar) == null : vectorNombre[i].equals(buscar)) {
                iterador = i;
            }
        }
        if (iterador == -1) {
            System.out.println("\nEl departamento de \" " + buscar + " \" no ha sido registrado");
        } else {
            System.out.println("\nEl departamento de \" " + buscar + " \" fue registrado en la posicion: \" " + (iterador + 1) + " \"");
        }
    }

    public void busqueda2() {
        System.out.print("\nIngrese la inicial del departamento de su interes:  ");
        sc.nextLine();
        buscar = sc.nextLine();
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == null ? (buscar) == null : vectorNombre[i].contains(buscar)) {
                System.out.println("\nEl departamento con inicial \"" + buscar + "\" es \" " + vectorNombre[i] + " \"");
                return;
            }
        }
        System.out.println("\nNo se encuentra en el registro ningun departamento con inicial \"" + buscar + "\"");
    }

    public void pares() {
        System.out.println("\nDepartamentos en posicion par con mas de 4 Municipios ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                if (numeroMun[i] > 4) {
                    System.out.println("Departamento: \" " + vectorNombre[i] + " \"");
                }
            }
        }
    }

    public void mostrarCapital() {
        System.out.print("\nIngrese el nombre del departamento del cual desea conocer su capital: ");
        sc.nextLine();
        String buscar = sc.nextLine();
        int iterador =-1;
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == null ? (buscar) == null : vectorNombre[i].equals(buscar)) {
                iterador=i;
                cabecera=capital[i];
            }
        }
        if (iterador==-1){
            System.out.println("Se ha producido un error, intentelo de nuevo");
        }else {
            System.out.println("La capital del departamento de: \""+buscar+"\" es: \""+cabecera+"\"");
        }
    }

}