//Control Básico de Marcas Disponibles en Venta Directa (GCO)

import java.util.Scanner;

public class Ejercicio_2 {

    public static boolean Buscar(String[] Marcas, String BuscarMarca) {

        for (String Marca : Marcas) {

            if (Marca != null && Marca.equalsIgnoreCase(BuscarMarca)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String[] Marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        int Respuesta = 0;
        String BuscarMarca;
        String NuevaMarca;
        boolean Ingresada;

        do {
            System.out.println();
            System.out.println("==============VENTA DIRECTA KLIIKER - GRUPO URIBE===================");
            System.out.println("|=============1) Listar Marcas Disponibles=========================|");
            System.out.println("|=============2) Buscar Marca en Lote==============================|");
            System.out.println("|=============3) Ingresar Marca al Lote============================|");
            System.out.println("|=============4) Salir============================================|");
            System.out.println("|==================================================================|");
            System.out.print("Ingrese una opción: ");

            try {
                Respuesta = Integer.parseInt(Leer.nextLine().trim());
            } catch (NumberFormatException e) {
                Respuesta = 0; // cae en el default
            }

            switch (Respuesta) {

                case 1:
                    System.out.println("===Listado de Marcas Disponibles===");
                    for (String Marca : Marcas) {
                        if (Marca != null) {
                            System.out.println(Marca);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la marca a buscar:");
                    BuscarMarca = Leer.nextLine().trim();
                    System.out.println("===Resultado de la Búsqueda===");
                    if (Buscar(Marcas, BuscarMarca)) {
                        System.out.println("La marca " + BuscarMarca + " se encuentra en el lote.");
                    } else {
                        System.out.println("La marca " + BuscarMarca + " no se encuentra en el lote.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la nueva marca a ingresar:");
                    NuevaMarca = Leer.nextLine().trim();

                    if (NuevaMarca.isEmpty()) {
                        System.out.println("La marca no puede estar vacía.");
                        break;
                    }

                    Ingresada = false;
                    for (int i = 0; i < Marcas.length; i++) {
                        if (Marcas[i] == null) {
                            Marcas[i] = NuevaMarca;
                            Ingresada = true;
                            System.out.println("La marca ha sido ingresada correctamente.");
                            break;
                        }
                    }
                    if (!Ingresada) {
                        System.out.println("No hay espacio disponible en la caja para ingresar la marca.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

        } while (Respuesta != 4);

        Leer.close();
    }
}