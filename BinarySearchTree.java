import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {

    private BSTNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Insertar un valor
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private BSTNode<T> insertRecursive(BSTNode<T> node, T value) {
        if (node == null) {
            return new BSTNode<>(value);
        }
        if (value.compareTo(node.value) < 0) {
            node.left = insertRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    // Buscar un valor
    public boolean search(T value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(BSTNode<T> node, T value) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.value) == 0) {
            return true;
        }
        return value.compareTo(node.value) < 0
                ? searchRecursive(node.left, value)
                : searchRecursive(node.right, value);
    }

    // Eliminar un nodo
    public void delete(T value) {
        root = deleteRecursive(root, value);
    }

    private BSTNode<T> deleteRecursive(BSTNode<T> node, T value) {
        if (node == null) {
            return null;
        }

        if (value.compareTo(node.value) < 0) {
            node.left = deleteRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = deleteRecursive(node.right, value);
        } else {
            // Nodo encontrado: tres casos
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            node.value = findMin(node.right);
            node.right = deleteRecursive(node.right, node.value);
        }
        return node;
    }

    // Encontrar el mínimo
    public T findMin() {
        return findMin(root);
    }

    private T findMin(BSTNode<T> node) {
        return node.left == null ? node.value : findMin(node.left);
    }

    // Encontrar el máximo
    public T findMax() {
        return findMax(root);
    }

    private T findMax(BSTNode<T> node) {
        return node.right == null ? node.value : findMax(node.right);
    }

    // Obtener el recorrido InOrder como cadena
    public String getInOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        inOrderRecursive(root, sb);
        return sb.toString().trim();
    }

    private void inOrderRecursive(BSTNode<T> node, StringBuilder sb) {
        if (node != null) {
            inOrderRecursive(node.left, sb);
            sb.append(node.value).append(" ");
            inOrderRecursive(node.right, sb);
        }
    }

    // Obtener el recorrido PreOrder como cadena
    public String getPreOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        preOrderRecursive(root, sb);
        return sb.toString().trim();
    }

    private void preOrderRecursive(BSTNode<T> node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.value).append(" ");
            preOrderRecursive(node.left, sb);
            preOrderRecursive(node.right, sb);
        }
    }

    // Obtener el recorrido PostOrder como cadena
    public String getPostOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        postOrderRecursive(root, sb);
        return sb.toString().trim();
    }

    private void postOrderRecursive(BSTNode<T> node, StringBuilder sb) {
        if (node != null) {
            postOrderRecursive(node.left, sb);
            postOrderRecursive(node.right, sb);
            sb.append(node.value).append(" ");
        }
    }

    // Obtener el recorrido LevelOrder como cadena
    public String getLevelOrderTraversal() {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<BSTNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BSTNode<T> node = queue.poll();
            sb.append(node.value).append(" ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return sb.toString().trim();
    }

    // Obtener altura
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(BSTNode<T> node) {
        if (node == null) {
            return -1;
        }
        return Math.max(heightRecursive(node.left), heightRecursive(node.right)) + 1;
    }

    // Verificar si está balanceado
    public boolean isBalanced() {
        return isBalancedRecursive(root);
    }

    private boolean isBalancedRecursive(BSTNode<T> node) {
        if (node == null) {
            return true;
        }
        int leftHeight = heightRecursive(node.left);
        int rightHeight = heightRecursive(node.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalancedRecursive(node.left) && isBalancedRecursive(node.right);
    }

    // Borrar todos los nodos
    public void clear() {
        root = null;
    }

    // Contar nodos
    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }
}

// Clase nodo para el árbol binario de búsqueda
class BSTNode<T extends Comparable<T>> {
    T value;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T value) {
        this.value = value;
        left = right = null;
    }
}
