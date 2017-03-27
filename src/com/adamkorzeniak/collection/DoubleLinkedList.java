package com.adamkorzeniak.collection;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int size;

    public DoubleLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = newNode;
            last = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(T element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    public T removeFirst() {
        T item = head.item;
        head = head.next;
        head.previous = null;
        size--;
        return item;
    }

    public T removeLast() {
        T item = last.item;
        last = last.previous;
        last.next = null;
        size--;
        return item;
    }

    public T peekFirst() {
        return head.item;
    }

    public T peekLast() {
        return last.item;
    }

    @Override
    public Iterator<T> iterator() {
        //TODO
        return null;
    }

    private class Node {
        T item;
        Node previous;
        Node next;

        public Node(T element) {
            item = element;
        }
    }
}
