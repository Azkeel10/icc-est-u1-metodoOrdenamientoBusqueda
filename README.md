# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica de Algoritmo de ordenamiento y busqueda
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Jaime Loja
- **Fecha:** 22/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Person: Representa el modelo de datos (una persona con nombre y edad).
View: Es la interfaz que gestiona la interacción con el usuario, solicitando entradas y mostrando salidas.
Controller: Es el intermediario entre la vista y las operaciones lógicas (ordenamiento y búsqueda), coordinando las acciones
basadas en la entrada del usuario.
SortingMethods: Define los distintos algoritmos de ordenamiento que se pueden aplicar a la lista de personas.
SearchMethods: Define los algoritmos de búsqueda binaria y verifica si el arreglo está ordenado correctamente.
Clases:
1. models.Person:
o Representa un objeto de persona con atributos name (nombre) y age (edad).
2. views.View:
o Gestiona la interacción con el usuario (entrada y salida de datos).
o Métodos:
§ showMenu(): Muestra el menú y retorna la opción seleccionada por el usuario.
§ inputPerson(): Solicita los datos de una persona (nombre y edad) y devuelve un objeto Person.
§ selectSortingMethod(): Permite seleccionar el método de ordenamiento y retorna la opción elegida.
§ selectSearchCriterion(): Permite seleccionar el criterio de búsqueda y retorna la opción elegida.
§ displayPersons(Person[]): Muestra una lista de personas.
§ displaySearchResult(Person): Muestra el resultado de una búsqueda (si la persona fue encontrada
o no).
§ inputAge(): Solicita al usuario que ingrese una edad y la devuelve.
§ inputName(): Solicita al usuario que ingrese un nombre y lo devuelve.
3. controllers.Controller:
o Coordina la lógica de la aplicación, conectando la vista, los métodos de ordenamiento y búsqueda.
o Métodos:
§ Controller(View, SortingMethods, SearchMethods): Constructor que inicializa el controlador con
una vista, métodos de ordenamiento y métodos de búsqueda.
§ start(): Inicia el flujo principal de la aplicación mostrando el menú y ejecutando las acciones
seleccionadas.
§ inputPersons(): Solicita al usuario que ingrese varias personas.
§ addPersons(): Añade una persona a la lista de personas existente.
§ sortPersons(): Ordena la lista de personas utilizando el método seleccionado.
§ searchPerson(): Busca una persona utilizando el criterio de búsqueda seleccionado.Primero valida
si esta ordena por el criterio seleccionado, y despues pide en valor a buscar.
4. controllers.SortingMethods:
o Contiene diferentes algoritmos de ordenamiento.
o Métodos:
§ sortByNameWithBubble(Person[]): Ordena las personas por nombre usando el algoritmo de
burbuja.
§ sortByNameWithSelectionDes(Person[]): Ordena las personas por nombre en orden descendente
usando el algoritmo de selección.
§ sortByAgeWithInsertion(Person[]): Ordena las personas por edad usando el algoritmo de
inserción.
§ sortByNameWithInsertion(Person[]): Ordena las personas por nombre usando el algoritmo de
inserción.
5. controllers.SearchMethods:
o Contiene métodos de búsqueda y verificación de orden.
o Métodos:
§ binarySearchByAge(Person[], int): Realiza una búsqueda binaria en el arreglo de personas por
edad.
§ binarySearchByName(Person[], String): Realiza una búsqueda binaria en el arreglo de personas
por nombre.
§ isSortedByAge(Person[]): Verifica si el arreglo de personas está ordenado por edad.
§ isSortedByName(Person[]): Verifica si el arreglo de personas está ordenado por nombre

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
----------Programa iniciado----------
Persona:
    Nombre= Juan
    Edad= 4     
Persona:
    Nombre= Maria
    Edad= 5      
Persona:
    Nombre= Carlos
    Edad= 18      
Persona:
    Nombre= Ana
    Edad= 60   
Persona:
    Nombre= Luis
    Edad= 25    
Persona:
    Nombre= Sofia
    Edad= 12     
Persona:
    Nombre= Pedro
    Edad= 8      
Persona:
    Nombre= Martin
    Edad= 9
Persona:
    Nombre= Luis
    Edad= 40

El tamaño de la lista es de= 9

Ingrese la edad a buscar:
9
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60 | 
bajo = 0   alto = 8   centro = 4   edad en el centro = 12    --> Izquierda

4 | 5 | 8 | 9 |
bajo = 0   alto = 3   centro = 1   edad en el centro = 5    --> Derecha

8 | 9 |
bajo = 2   alto = 3   centro = 2   edad en el centro = 8    --> Derecha

9 | 
bajo = 3   alto = 3   centro = 3   edad en el centro = 9    --> Encontrado


Persona con Edad 9 es Martin

Persona:
    Nombre= Martin
    Edad= 9
```

---