package old_practice.Cache.eviction;

import old_practice.Cache.algorithms.DoublyLinkedList.DoublyLinkedList;
import old_practice.Cache.algorithms.LinkedListNode.Node;
import old_practice.Cache.exceptions.NullElementException;

import java.util.HashMap;
import java.util.Map;

public class DefaultLRUEvictionService implements Eviction{

    DoublyLinkedList doublyLinkedList;
    Map<String, Node> dllMapper;

    public DefaultLRUEvictionService() {
        this.doublyLinkedList = new DoublyLinkedList();
        this.dllMapper = new HashMap<>();
    }

    @Override
    public void setAccessedKey(String key) throws NullElementException {
        if (dllMapper.containsKey(key)){
            doublyLinkedList.detachNode(dllMapper.get(key));
            doublyLinkedList.addElementAtLast(key);
        }else{                                               
            Node newNode = doublyLinkedList.addElementAtLast(key);
            dllMapper.put(key, newNode);

        }
    }

    @Override
    public String evictData() {
        Node first = doublyLinkedList.getFirstNode();
        if(first == null) {
            return null;
        }
        doublyLinkedList.detachNode(first);
        return first.getElement();
    }
}
