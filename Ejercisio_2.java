//Control Básico de Marcas Disponibles en Venta Directa (GCO)

import java.util.Scanner;

public class Ejercisio_2 {

    public static boolean Buscar (String[] Marcas, String BuscarMarca) {
        
        for (String Marca : Marcas) {
            
            if (BuscarMarca.equals(Marca)) {
                
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String[] Marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        int Respuesta;
        String BuscarMarca;
        String NuevaMarca;
        boolean Encontrado;

    }
}

