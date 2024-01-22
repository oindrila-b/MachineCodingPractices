package Cache.algorithms.DoublyLinkedList;

import Cache.algorithms.LinkedListNode.Node;
import Cache.exceptions.NullElementException;

public class DoublyLinkedList {
/**
 * The first and the last represent the two pointers, head and tail that are in a doubly linkedlist
 * */
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = new Node(null);
        this.last = new Node(null);
        first.next = last;
        last.previous = first;
    }

    public Node addElementAtLast(String element) throws NullElementException {
        if (element == null || element.isEmpty()) {
            throw new NullElementException();
        }
        Node node = new Node(element);
        Node lastPrevious = last.previous;
        lastPrevious.next = node;
        node.next= last;
        last.previous = node;
        node.previous = lastPrevious;

        return node;
    }

    public void detachNode(Node node) {
        if (node == null) return;
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    public boolean isItemPresent() {
        return first.next != last;
    }

    public Node getFirstNode()  {
        if (!isItemPresent()) {
            return null;
        }
        return first.next;
    }

    public Node getLastNode() {
        if (!isItemPresent()) {
            return null;
        }
        return last.previous;
    }


}
