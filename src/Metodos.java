import java.util.ArrayList;

public class Metodos extends Main {
    protected String[] arreglo = new String[50];
    protected String[] vectorNombre = new String[50];
    protected int[] numeroMun = new int[50];
    String buscar;
    int indice = 0;

    public void registro() {
        System.out.print("Ingrese la cantidad de registros que desea almacenar: ");
        contador = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            System.out.println("\nRegistro " + (i + 1));
            System.out.print("Codigo del departamento: ");
            codigo=sc.nextInt();
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
            lector=sc.nextInt();
            switch (lector){
                case 1:
                    region="Norte";
                    break;
                case 2:
                    region="Sur";
                    break;
                case 3:
                    region="Este";
                    break;
                case 4:
                    region="Oeste";
                    break;
            }
            RegistroLista registro = new RegistroLista(codigo,departamento,municipio,cabecera,region);
            lista.add(registro);
            vectorNombre[i] = departamento;
            numeroMun[i] = municipio;
            this.registroArreglo(codigo,departamento,municipio,cabecera,region);
        }
    }
    public void registroArreglo(int codigo,String departamento, int municipio, String cabecera, String region) {
        indice = indice + 1; //indice+=1; <== is the same, se puede escribir de ambas formas
        arreglo[indice] = "Codigo del departamento: "+codigo+"\nNombre de departamento: " + departamento + "\nNumero de municipios: " + municipio + "\nCabecera: " + cabecera + "\nRegion: "+region+"\n";
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
}
