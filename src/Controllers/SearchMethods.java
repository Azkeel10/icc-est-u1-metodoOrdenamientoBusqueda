package Controllers;

import Models.Person;

public class SearchMethods {
//-------------------------------------------------------------------------------------------------------------
    public Person binarySearchByAge(Person[] people, int edad) {
        int bajo = 0;
        int alto = people.length - 1;

        System.out.println("\n---------Metodo busqueda binaria-Edad ejecutado---------\n");

        while (bajo <= alto) {
            
            int centro = (bajo + alto) / 2;

            if (people[centro].getEdad() == edad){
                System.out.println("\n---------Encontrado---------\n");
                return people[centro];
            }

            if (people[centro].getEdad() < edad){ 
                bajo = centro + 1;

            }else{ 
                alto = centro - 1;
            }
        }
        return null;
    }
//-------------------------------------------------------------------------------------------------------------
    public Person binarySearchByName(Person[] people, String nombre) {
        int bajo = 0;
        int alto = people.length - 1;

        System.out.println("\n---------Metodo busqueda binaria-Nombre ejecutado---------\n");

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;
            int compara = people[centro].getNombre().compareTo(nombre);

            if (compara == 0){
                System.out.println("\n---------Encontrado---------\n");
                return people[centro];
            }

            if (compara < 0){ 
                bajo = centro + 1;

            }else{ 
                alto = centro - 1;
            }
        }
        return null;
    }
//-------------------------------------------------------------------------------------------------------------
    public boolean isSortedByAge(Person[] persons) {
        System.out.println("\n---------Revision de ordenamiento por Edad---------\n");

        for (int i = 0; i < persons.length - 1; i++) {

            if (persons[i].getEdad() > persons[i + 1].getEdad()) {

            return false;

            }
        }
        return true;
    }
//-------------------------------------------------------------------------------------------------------------
    public boolean isSortedByName(Person[] persons) {

        System.out.println("\n---------Revision de ordenamiento por Nombre---------\n");

        for (int i = 0; i < persons.length - 1; i++) {

            if (persons[i].getNombre().compareTo(persons[i + 1].getNombre()) > 0) {

                return false;
            }
        }
        return true;
    }
//-------------------------------------------------------------------------------------------------------------
}

