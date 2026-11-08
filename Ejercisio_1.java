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

    }

    
}