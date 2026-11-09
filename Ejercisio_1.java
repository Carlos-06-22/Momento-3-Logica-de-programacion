//Módulo Básico de Consulta y Registro de Referencias Chevignon

import java.util.Scanner;

public class Ejercisio_1 {

    public static boolean Buscar(String[] Referencias, String ReferenciaBuscada) {

        for (String Referencia : Referencias) {

            if (Referencia != null && Referencia.equalsIgnoreCase(ReferenciaBuscada)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] Referencias = {"Chaqueta de Cuero", "Camisa de Algodón", "Pantalón de Mezclilla", null, null};
        int Respuesta = 0;
        String ReferenciaBuscada;
        String NuevaReferencia;
        boolean Ingresada;

        try (Scanner Leer = new Scanner(System.in)) {
            do {
                System.out.println();
                System.out.println("==============CONTROL DE REFERENCIAS CHEVIGNON======================");
                System.out.println("|=============1) Listar Referencias Disponibles====================|");
                System.out.println("|=============2) Buscar Referencia================================|");
                System.out.println("|=============3) Ingresar Referencia==============================|");
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
                        System.out.println("===Listado de Referencias Disponibles===");
                        for (String Referencia : Referencias) {
                            if (Referencia != null) {
                                System.out.println(Referencia);
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Ingrese el nombre de la referencia a buscar:");
                        ReferenciaBuscada = Leer.nextLine().trim();
                        System.out.println("===Resultado de la Búsqueda===");
                        if (Buscar(Referencias, ReferenciaBuscada)) {
                            System.out.println("La referencia " + ReferenciaBuscada + " se encuentra en el lote.");
                        } else {
                            System.out.println("La referencia " + ReferenciaBuscada + " no se encuentra en el lote.");
                        }
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre de la referencia a ingresar:");
                        NuevaReferencia = Leer.nextLine().trim();

                        if (NuevaReferencia.isEmpty()) {
                            System.out.println("La referencia no puede estar vacía.");
                            break;
                        }

                        Ingresada = false;
                        for (int i = 0; i < Referencias.length; i++) {
                            if (Referencias[i] == null) {
                                Referencias[i] = NuevaReferencia;
                                Ingresada = true;
                                System.out.println("La referencia " + NuevaReferencia + " ha sido ingresada al lote.");
                                break;
                            }
                        }
                        if (!Ingresada) {
                            System.out.println("No hay espacio disponible para ingresar la referencia " + NuevaReferencia + ".");
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
        }
    }
}