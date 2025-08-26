package old_practice.Cache.algorithms.LinkedListNode;

public class Node {
    public String element;
    public Node previous;
    public Node next;

    public Node(String element) {
        this.element = element;
        previous = null;
        next = null;
    }

    public String getElement() {
        return element;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }
}
