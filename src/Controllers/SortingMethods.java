package Controllers;

import Models.Person;

public class SortingMethods {
//-------------------------------------------------------------------------------------------------------------
    public void sortByNameWithBubble(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {

            for (int j = 0; j < persons.length - i - 1; j++) {

                if (persons[j].getNombre().compareTo(persons[j + 1].getNombre()) > 0) {
                    
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        System.out.println("\n---------Arreglo ordenado por burbuja-Nombre---------\n");
    }
//-------------------------------------------------------------------------------------------------------------
    public void sortByNameWithSelection(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {

            int Index = i;

            for (int j = i + 1; j < persons.length; j++) {

                if (persons[j].getNombre().compareTo(persons[Index].getNombre()) < 0) {
                    Index = j;
                }
            }
            Person temp = persons[Index];
            persons[Index] = persons[i];
            persons[i] = temp;
        }
        System.out.println("\n---------Arreglo ordenado por seleccion-Nombre---------\n");
    }
//-------------------------------------------------------------------------------------------------------------
    public void sortByAgeWithInsertion(Person[] persons) {
        for (int i = 1; i < persons.length; i++) {

            Person key = persons[i];
            int j = i - 1;

            while (j >= 0 && persons[j].getEdad() > key.getEdad()) {

                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = key;
        }
        System.out.println("\n---------Arreglo ordenado por incercion-Edad---------\n");
    }
//-------------------------------------------------------------------------------------------------------------
    public void sortByNameWithInsertion(Person[] persons) {
        for (int i = 1; i < persons.length; i++) {

            Person key = persons[i];
            int j = i - 1;

            while (j >= 0 && persons[j].getNombre().compareTo(key.getNombre()) > 0) {

                persons[j + 1] = persons[j];
                j--;
            }

            persons[j + 1] = key;
        }
        System.out.println("\n---------Arreglo ordenado por incersion-Nombre---------\n");
    }
//-------------------------------------------------------------------------------------------------------------
}


