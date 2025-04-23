package Views;

import java.util.Scanner;
import Models.Person;

public class View {
    private Scanner scanner = new Scanner(System.in);
//-------------------------------------------------------------------------------------------------------------
    public int showMenu() {
        System.out.println("\n1. Agregar persona");
        System.out.println("2. Ordenar personas");
        System.out.println("3. Buscar persona");
        System.out.println("4. Salir\n");

        return scanner.nextInt();
    }
//-------------------------------------------------------------------------------------------------------------
    public Person inputPerson() {
        scanner.nextLine();
        System.out.print("\nNombre: ");
        String nombre = scanner.nextLine();
        System.out.print("\nEdad: ");
        int edad = scanner.nextInt();

        return new Person(nombre, edad);
    }
//-------------------------------------------------------------------------------------------------------------
    public int selectSortingMethod() {
        System.out.println("\n1. Metodo burbuja por nombre");
        System.out.println("2. Metodo seleccion por nombre");
        System.out.println("3. Metodo incercion por edad");
        System.out.println("4. Metodo incercion por nombre\n");

        return scanner.nextInt();
    }
//-------------------------------------------------------------------------------------------------------------
    public int searchCriterion() {
        System.out.println("\nBuscar por:");
        System.out.println("1. Edad");
        System.out.println("2. Nombre\n");

        return scanner.nextInt();
    }
//-------------------------------------------------------------------------------------------------------------
    public void displaySearchResult(Person encontrado) {
        if (encontrado == null){
            System.out.println("\nPersona no encontrada :()");
        } else{
            System.out.println("\nPersona encontrada " + encontrado + " :)");
        }
    }
//-------------------------------------------------------------------------------------------------------------
    public int inputAge() {
        System.out.print("\nEdad a buscar: ");
        
        return scanner.nextInt();
    }
//-------------------------------------------------------------------------------------------------------------
    public String inputName() {
        scanner.nextLine();
        System.out.print("\nNombre a buscar: ");

        return scanner.nextLine();
        
    }
//-------------------------------------------------------------------------------------------------------------
}

