//Módulo Básico de Consulta y Registro de Referencias Chevignon

import java.util.Scanner;

public class Ejercisio_1 {

    public static boolean Buscar(String[] Referencias, String ReferenciaBuscada) {
        
        for (String Referencia : Referencias) {
            
            if (ReferenciaBuscada.equals(Referencia)) {

                return true;

            }
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String[] Referencias = {"Chaqueta de Cuero", "Camisa de Algodón", "Pantalón de Mezclilla", null, null};
        int Respuesta;
        String ReferenciaBuscada;
        String NuevaReferencia;
        boolean Encontrado;

        System.out.println("==============CONTROL DE REFERENCIAS CHEVIGNON======================");
        System.out.println("|=============1)Listar Referencias Disponobles=====================|");
        System.out.println("|=============2)Buscar Referencia==================================|");
        System.out.println("|=============3)Ingresar Referencia================================|");
        System.out.println("|=============4)Salir==============================================|");
        System.out.println("|=============Ingrese una opción: =================================|");
        System.out.println("|==================================================================|");
        Respuesta = Leer.nextInt();

        switch (Respuesta) {

            case 1:
                System.out.println("===Listado de Referencias Disponibles===");
                for (String Referencia : Referencias) {
                    if (Referencia != null) {
                        System.out.println(Referencia);
                    }
                }
                break;

            case 2:
                System.out.println("Ingrese el nombre de la referencia a buscar:");
                ReferenciaBuscada = Leer.next();
                System.out.println("===Resultado de la Búsqueda===");
                if (Buscar(Referencias, ReferenciaBuscada)) {
                    System.out.println("La referencia " + ReferenciaBuscada + " se encuentra en el lote.");
                } else {
                    System.out.println("La referencia " + ReferenciaBuscada + " no se encuentra en el lote.");
                }
                break;

            case 3:
                System.out.println("Ingrese el nombre de la referencia a ingresar:");
                NuevaReferencia = Leer.next();
                Encontrado = false;
                for (int i = 0; i < Referencias.length; i++) {
                    if (Referencias[i] == null) {
                        Referencias[i] = NuevaReferencia;
                        Encontrado = true;
                        System.out.println("La referencia " + NuevaReferencia + " ha sido ingresada al lote.");
                        break;
                    }
                }
                if (!Encontrado) {
                    System.out.println("No hay espacio disponible para ingresar la referencia " + NuevaReferencia + ".");
                }
                break;
            
            case 4:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;

        }while (Respuesta != 4);
        
        Leer.close();

    }
}