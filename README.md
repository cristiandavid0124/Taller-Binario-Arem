# BinarySearchTree

## Autor : Cristian David Naranjo Orjuela

## Versiones y requisitos
- Git  Control de versiones
- Java 17  Lenguaje de programación


## Resumen del Proyecto
Un árbol binario de búsqueda (BST) es una estructura de datos que organiza los datos de manera jerárquica, lo que permite realizar operaciones eficientes de inserción, eliminación y búsqueda. En un BST, cada nodo contiene un valor y sigue dos propiedades clave:
El valor de cada nodo en el subárbol izquierdo es menor que el valor del propio nodo.
El valor de cada nodo en el subárbol derecho es mayor que el valor del propio nodo.
Estas propiedades aseguran que las operaciones de búsqueda se puedan realizar en un tiempo promedio de O(log n), lo que convierte a los BST en una opción eficiente para almacenar y recuperar datos ordenados. Haz que tu implementación sea compatible con la API de colecciones de Java.




## Instalación y Ejecución local

1. Clonar el repositorio.
 ```
https://github.com/cristiandavid0124/Taller-Binario-Arem.git
  ```

2. correr clase  main 







## Diseño de Clases

El proyecto consta de las siguientes clases principales:

Main: Es la clase principal que se utiliza para probar el funcionamiento del árbol. Aquí se crean instancias del BST, se insertan elementos, y se ejecutan diversas operaciones como búsqueda, eliminación y recorridos.

BinarySearchTree<T extends Comparable<T>>: Es la clase que implementa el árbol binario de búsqueda. Contiene métodos para las operaciones más comunes en un BST, como insertar, buscar, eliminar, encontrar el mínimo y máximo, y obtener los distintos tipos de recorridos.

BSTNode<T extends Comparable<T>>: Esta clase representa un nodo del árbol. Cada nodo almacena un valor genérico T (que debe ser comparable) y referencias a sus hijos izquierdo y derecho.





## Test 
(se hicieron en un main imprimiendo por que en el lab nodejaba instalar maven y la dependencias junit )

1.Insertar valores:
La función insert() está probada al agregar múltiples valores al árbol (50, 30, 70, 20, 40, 60, 80).


2. Buscar valores:
La función search() está probada para encontrar si el valor 30 está presente (debería devolver true) y si el valor 100 está presente (debería devolver false).

3. Eliminar un nodo:
La función delete() está probada al eliminar el nodo con el valor 20, seguido de un recorrido en inorden para verificar el árbol después de la eliminación.

4.Recorridos:

In-order Traversal (getInOrderTraversal()): Imprime los valores en orden ascendente.
Pre-order Traversal (getPreOrderTraversal()): Imprime los valores en preorden.
Post-order Traversal (getPostOrderTraversal()): Imprime los valores en postorden.
Level-order Traversal (getLevelOrderTraversal()): Recorre el árbol nivel por nivel.

 5. Encontrar mínimo y máximo:
La función findMin() encuentra el valor mínimo, y findMax() encuentra el valor máximo en el árbol.

6. Altura del árbol:
La función height() está probada, calculando la altura del árbol.

7. Verificar si el árbol está balanceado:
La función isBalanced() verifica si el árbol está balanceado.

9. Contar nodos:
La función countNodes() está probada para contar el número total de nodos en el árbol.


![image](https://github.com/user-attachments/assets/0f9f1f0b-daff-4505-ad06-7122d8188342)



## Author

* **Cristian David Naranjo Orjuela** 

