public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Insertar valores
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // InOrder Traversal
        System.out.println("InOrder Traversal:");
        System.out.println(bst.getInOrderTraversal());

        // Buscar valores
        System.out.println("\nSearch 30: " + bst.search(30)); 
        System.out.println("Search 100: " + bst.search(100)); 

        // Eliminar un nodo
        bst.delete(20);
        System.out.println("\nInOrder Traversal after deleting 20:");
        System.out.println(bst.getInOrderTraversal());

        // Probar findMin() y findMax()
        System.out.println("\nFindMin: " + bst.findMin());  // Debería ser 30 después de eliminar 20
        System.out.println("FindMax: " + bst.findMax());  // Debería ser 80

        // Probar altura del árbol
        System.out.println("Height of tree: " + bst.height());  // Debería dar la altura máxima del árbol

        // Probar si el árbol está balanceado
        System.out.println("Is the tree balanced? " + bst.isBalanced());  // Verifica si está balanceado

        // Recorridos adicionales
        System.out.println("\nPreOrder Traversal:");
        System.out.println(bst.getPreOrderTraversal());  // Recorrido en preorden

        System.out.println("\nPostOrder Traversal:");
        System.out.println(bst.getPostOrderTraversal());  // Recorrido en p

        // Recorrido por niveles (nivel a nivel)
        System.out.println("\nLevelOrder Traversal:");
        System.out.println(bst.getLevelOrderTraversal());  

        // Contar nodos
        System.out.println("\nNumber of nodes: " + bst.countNodes());  
    }
}
