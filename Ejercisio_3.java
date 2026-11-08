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

            
        }
        
    }
}
