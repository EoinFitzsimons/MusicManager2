/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import static musicmanager.MusicManagerGUI.repeat;

/**
 *
 * @author eoin0
 */
public class DLList implements LinkedListInterface {

    private Node head, curr, prev;
    private int size;

    public DLList() {
        head = null;
        size = 0;
        curr = head;
        prev = null;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    private void setCurrent(int index) {
        curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();

        }
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element, null, null);
        if (head == null) {
            head = newNode;

        } else {
            setCurrent(size);
            newNode.setPrev(curr);
            curr.setNext(newNode);

        }
        size = size + 1;
    }

    @Override
    public void add(Object element, int index) {
        if (isEmpty()) {
            Node newNode = new Node(element, null, null);
            head = newNode;
            prev = newNode;
        } else {
            if (index == 1) {
                Node newNode = new Node(element, null, null);
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            } else {
                if (index == (size + 1)) {
                    Node newNode = new Node(element, null, null);
                    newNode.setPrev(prev);
                    prev.setNext(newNode);
                    prev = newNode;
                } else {
                    setCurrent(index);
                    Node newNode = new Node(element, null, null);

                    newNode.setNext(curr);
                    Node previous = curr.getPrev();
                    newNode.setPrev(previous);
                    previous.setNext(newNode);
                    curr.setPrev(newNode);
                }
            }
        }
        size++;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public String printList() {
        StringBuilder listString = new StringBuilder();
        for (Node aNode = head; aNode != null; aNode = aNode.getNext()) {
            listString.append(aNode.getElement().toString());
            listString.append("\n");
        }
        return listString.toString();
    }

    @Override
    public void remove(String song) {
        Node current = head;
        while (current != null) {
            if (current.getElement().equals(song)) {
                // If node to be deleted is head node
                if (current == head) {
                    head = current.getNext();
                }
                // Change next if node to be deleted is not the last node
                if (current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                }
                // Change prev if node to be deleted is not the first node
                if (current.getPrev() != null) {
                    current.getPrev().setNext(current.getNext());
                }
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public boolean contains(Object element) {
        Node current = head;
        while (current != null) {
            if (current.getElement().equals(element)) { // if the name matches the element 
                return true;
            }
            current = current.getNext(); // move on
        } // current is null when there is nothing next
        return false;
    }

public void loopList() {
    if (head == null) {
        System.out.println("The playlist is empty.");
        return;
    }
    Node current = head;
    while (repeat && current != null) {
        System.out.println(current.getElement());
        try { // pausing so the songs don't just blitz through
            Thread.sleep(1000); // Pause for 1 second
        } catch (InterruptedException e) {
        }
        if (current.getNext() != null) {
            current = current.getNext();
        } else {
            current = head; //back to the start of the list
            System.out.println("The playlist has looped back to the start.");
        }
    }
}



}
