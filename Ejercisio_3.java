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

        

    }
}
