package TP1_HERENCIA.EJER9;

import java.util.*;

public class vista {
    public void mostrarMenu(){
        int opcion=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("- - Menu - -");
            System.out.println("1- Agregar Figura ");
            System.out.println("2- Eliminar Figura");
            System.out.println("3- Limpiar Pizarra");
            System.out.println("4- Calcular Superficie");
            System.out.println("5- Calcular Perimetro");
            System.out.println("6- Cambiar Color (Fondo) de una Figura");
            System.out.println("7- Cambiar Color (Borde) de una Figura");
            System.out.println("8- Cambiar Color de la pizarra");
            System.out.println("0- Salir");
            opcion=scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 0:
                    
                    break;
                default:
                    System.out.println("Opcion Invalida!");
                    break;
            }

        } while (opcion!=0);
        scanner.close();
    }
}
