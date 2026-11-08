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

    }

    
}