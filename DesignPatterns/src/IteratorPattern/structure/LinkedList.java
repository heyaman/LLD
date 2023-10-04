package IteratorPattern.structure;



import java.util.Arrays;
import java.util.List;

public class LinkedList  {
    private LinkedListNode head;

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }

    public void insert(LinkedListNode node) {
        LinkedListNode previous = head;
        while (previous.getNext() != null)
            previous = previous.getNext();
        previous.setNext(node);
    }

}