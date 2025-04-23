import Controllers.*;
import Views.View; 

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Programa funcionando----------\n");
//-------------------------------------------------------------------------------------------------------------
        View consola = new View();
        SortingMethods ordenar = new SortingMethods();
        SearchMethods buscar = new SearchMethods();
//-------------------------------------------------------------------------------------------------------------
        Controller controlador = new Controller(consola, ordenar, buscar);

        controlador.start();
    }
}
