//Gestor Básico de Lotes de Colección para American Eagle

import java.util.Scanner;


public class Ejercicio_3 {

    public static boolean Buscar(String[] Productos, String NombreBuscado) {

        for (String Prenda : Productos) {

            if (Prenda != null && Prenda.equalsIgnoreCase(NombreBuscado)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String[] Productos = {"Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null};
        int Respuesta = 0;
        String NombreBuscado;
        String NuevaPrenda;
        boolean Ingresada;

        do {
            System.out.println();
            System.out.println("==============GESTOR DE LOTES AMERICAN EAGLE========================");
            System.out.println("|=============1) Listar Colección de Bodega========================|");
            System.out.println("|=============2) Buscar Referencia en Lote========================|");
            System.out.println("|=============3) Ingresar Prenda al Lote==========================|");
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
                    System.out.println("===Listado de Colección de Bodega===");
                    for (String Prenda : Productos) {
                        if (Prenda != null) {
                            System.out.println(Prenda);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la prenda a buscar:");
                    NombreBuscado = Leer.nextLine().trim();
                    System.out.println("===Resultado de la Búsqueda===");
                    if (Buscar(Productos, NombreBuscado)) {
                        System.out.println("La prenda " + NombreBuscado + " se encuentra en el lote.");
                    } else {
                        System.out.println("La prenda " + NombreBuscado + " no se encuentra en el lote.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la prenda a ingresar:");
                    NuevaPrenda = Leer.nextLine().trim();

                    if (NuevaPrenda.isEmpty()) {
                        System.out.println("La prenda no puede estar vacía.");
                        break;
                    }

                    Ingresada = false;
                    for (int i = 0; i < Productos.length; i++) {
                        if (Productos[i] == null) {
                            Productos[i] = NuevaPrenda;
                            Ingresada = true;
                            System.out.println("La prenda ha sido ingresada correctamente.");
                            break;
                        }
                    }
                    if (!Ingresada) {
                        System.out.println("No hay espacio disponible en la caja para ingresar la prenda.");
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
