public class BSTNode<T extends Comparable<T>> {
    T value;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T value) {
        this.value = value;
        left = right = null;
    }
}
