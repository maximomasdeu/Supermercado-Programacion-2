import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Ingresá tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ahora tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Cuál es tu DNI ");
        int dni = scanner.nextInt();
        scanner.nextLine();

        System.out.print("¿Sos mayorista? (S/N)");
        String mayorista = scanner.next();
        Boolean mayo;
        if (mayorista.equalsIgnoreCase("s")) {
            mayo=true;
        }else{
            mayo=false;
        }

        Cliente cliente = new Cliente(nombre, apellido, dni, mayo);


        Producto prod1 = new Producto("Leche", 2, 50.0);
        Producto prod2 = new Producto("Pan", 5, 20.0);
        Producto prod3 = new Producto("Huevos", 12, 60.0);
        Producto prod4 = new Producto("Arroz", 1, 30.0);
        Producto prod5 = new Producto("Manzanas", 6, 40.0);

        int opcion;
        List<Producto> listaProductos = new ArrayList<>();

        do {
            System.out.println("Seleccione un producto:");
            System.out.println("1. Arroz");
            System.out.println("2. Leche");
            System.out.println("3. Pan");
            System.out.println("4. Huevos");
            System.out.println("5. Manzanas");
            System.out.println("0. Ir a la caja");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usted ha seleccionado Arroz.");
                    if (prod4.getCantidad() != 0) {
                        listaProductos.add(prod4);
                        prod4.setCantidad(prod4.getCantidad() - 1);
                    } else {
                        System.out.println("No queda stock del producto.");
                    }
                    break;
                case 2:
                    System.out.println("Usted ha seleccionado Leche.");
                    if (prod1.getCantidad() != 0) {
                        listaProductos.add(prod1);
                        prod1.setCantidad(prod1.getCantidad() - 1);
                    } else {
                        System.out.println("No queda stock del producto.");
                    }
                    break;
                case 3:
                    System.out.println("Usted ha seleccionado Pan.");
                    if (prod2.getCantidad() != 0) {
                        listaProductos.add(prod2);
                        prod2.setCantidad(prod2.getCantidad() - 1);
                    } else {
                        System.out.println("No queda stock del producto.");
                    }
                    break;
                case 4:
                    System.out.println("Usted ha seleccionado Huevos.");
                    if (prod3.getCantidad() != 0) {
                        listaProductos.add(prod3);
                        prod3.setCantidad(prod3.getCantidad() - 1);
                    } else {
                        System.out.println("No queda stock del producto.");
                    }
                    break;
                case 5:
                    System.out.println("Usted ha seleccionado Manzanas.");
                    if (prod5.getCantidad() != 0) {
                        listaProductos.add(prod5);
                        prod5.setCantidad(prod5.getCantidad() - 1);
                    } else {
                        System.out.println("No queda stock del producto.");
                    }
                    break;
                case 0:
                    System.out.println("Gestionando transacción...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();


        Transaccion transacc = new Transaccion();
        transacc.setListaProd(listaProductos);
                transacc.setPrecioTotal();

        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1;

        transacc.setNroCaja(numeroAleatorio);

        System.out.println(transacc.toString());
        System.out.println(
        );
        System.out.println("Gracias por tu compra "+ cliente.getNombre());


    }
}
