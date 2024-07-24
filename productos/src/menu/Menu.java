
package menu;

import productos.Productos;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        ArrayList<Productos> productos = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu principal: ");
            System.out.println("1. Crear un producto");
            System.out.println("2. Imprimir el producto");
            
            System.out.println("Seleccione una opción: ");
            
            String opciones = scanner.nextLine();
            
            switch (opciones) {
                case "1":
                    System.out.println("ingrese el nombre del producto que desea crear: ");
                    String producto = scanner.nextLine();
                        
                    System.out.println("ingrese el valor del producto que desea crear: ");
                    int valor = scanner.nextInt();
                            
                    System.out.println("ingrese la cantidad del producto que desea crear: ");
                    int cantidad = scanner.nextInt();
                    
                    scanner.nextLine();
                    Productos producto1 = new Productos (producto, valor, cantidad);
                    productos.add(producto1);
                    break;
                    
                    case "2":
                    for (Productos producto2 : productos) {
                        producto2.imprimir();
                        System.out.println(" ");
                    }
                    break;
            }   
        }  
    } 
}
