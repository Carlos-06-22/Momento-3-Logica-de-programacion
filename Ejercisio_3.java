//Gestor Básico de Lotes de Colección para American Eagle

import java.util.Scanner;

public class Ejercisio_3 {

    public static boolean Buacar (String[] Productos, String NombreBuscado) {

        for (String Prenda : Productos) {

            if (NombreBuscado.equals(Prenda)) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String[] Productos =  {"Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null};
        int Respuesta;
        String NombreBuscado;
        String NuevaPrenda;
        boolean Encontrado;
        do {

            System.out.println("==============GESTOR DE LOTES AMERICAN EAGLE========================");
            System.out.println("|=============1)Listar Coleccion de Bodega=========================|");
            System.out.println("|=============2)Buscar Referencia en Lote==========================|");
            System.out.println("|=============3)Ingresar Prenda al Lote============================|");
            System.out.println("|=============4)Salir==============================================|");
            System.out.println("|=============Ingrese una opción: =================================|");
            System.out.println("|==================================================================|");
            Respuesta = Leer.nextInt();

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
                    NombreBuscado = Leer.next();
                    System.out.println("===Resultado de la Búsqueda===");
                    if (Buacar(Productos, NombreBuscado)) {
                        System.out.println("La prenda " + NombreBuscado + " se encuentra en el lote.");
                    } else {
                        System.out.println("La prenda " + NombreBuscado + " no se encuentra en el lote.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la prenda a ingresar:");
                    NuevaPrenda = Leer.next();
                    Encontrado = false;
                    for (int i = 0; i < Productos.length; i++) {
                        if (Productos[i] == null) {
                            Productos[i] = NuevaPrenda;
                            Encontrado = true;
                            System.out.println("La prenda ha sido ingresada correctamente.");
                            break;
                        }
                    }
                    if (!Encontrado) {
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
            
        }while (Respuesta != 4);

        Leer.close();
        
    }
}
