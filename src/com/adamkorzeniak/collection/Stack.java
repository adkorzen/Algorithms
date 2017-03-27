package com.adamkorzeniak.collection;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Node head;
    private int size;

    public Stack() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T element) {
        Node previousHead = head;
        head = new Node(element);
        head.next = previousHead;
        size++;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException();
        T item = head.item;
        head = head.next;
        size--;
        return item;
    }

    public T peek() {
        return head.item;
    }

    @Override
    public Iterator<T> iterator() {
        //TODO
        return null;
    }

    private class Node {
        T item;
        Node next;

        public Node(T element) {
            item = element;
        }
    }
}
