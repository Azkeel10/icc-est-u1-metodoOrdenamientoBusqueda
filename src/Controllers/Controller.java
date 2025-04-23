package Controllers;

import Models.Person;
import Views.View; 
import java.util.ArrayList;

public class Controller {
//-------------------------------------------------------------------------------------------------------------
    private View view;
    private ArrayList<Person> persons;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
//-------------------------------------------------------------------------------------------------------------
    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.persons = new ArrayList<>();
    }
//-------------------------------------------------------------------------------------------------------------
    public void start() {
        boolean salida = false;

        while (!salida) {
            int option = view.showMenu();

            switch (option) {
                case 1:
                addPerson();
                break;

                case 2:
                sortPersons();
                break;

                case 3:
                searchPerson();
                break;

                case 4:
                salida = true;
                break;
                
                default:
                System.out.println("\n-----Opcion invalida-----");
                break;
            }
        }
    }
//-------------------------------------------------------------------------------------------------------------
    public void addPerson() {

        Person people = view.inputPerson();
        persons.add(people);
    }
//-------------------------------------------------------------------------------------------------------------
    public void sortPersons() {

        if (persons.isEmpty()) {
            System.out.println("No hay personas para ordenar");
            return;
        }

        Person[] arreglo = persons.toArray(new Person[0]);

        switch (view.selectSortingMethod()) {
            case 1:
            sortingMethods.sortByNameWithBubble(arreglo);
            break;

            case 2:
            sortingMethods.sortByNameWithSelection(arreglo);
            break;

            case 3:
            sortingMethods.sortByAgeWithInsertion(arreglo);
            break;

            case 4:
            sortingMethods.sortByNameWithInsertion(arreglo);
            break;

            default:
            System.out.println("\n-----Opcion invalida-----");
            break;
        }

        persons.clear();
        for (Person people : arreglo) persons.add(people);
    }
//-------------------------------------------------------------------------------------------------------------
    public void searchPerson() {
        if (persons.isEmpty()) {
            System.out.println("No hay personas en la lista");
            return;
        }

        Person[] arreglo = persons.toArray(new Person[0]);
        int opcion = view.searchCriterion();
        Person encontrado = null;

        if (opcion == 1 && searchMethods.isSortedByAge(arreglo)) {

            int edad = view.inputAge();
            encontrado = searchMethods.binarySearchByAge(arreglo, edad);

        } else if (opcion == 2 && searchMethods.isSortedByName(arreglo)) {

            String name = view.inputName();
            encontrado = searchMethods.binarySearchByName(arreglo, name);

        } else {

            System.out.println("El arreglo no esta ordenado");
        }
        view.displaySearchResult(encontrado);
    }
//-------------------------------------------------------------------------------------------------------------
}

