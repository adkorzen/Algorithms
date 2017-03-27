package com.adamkorzeniak.collection;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int size;

    public Queue() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T element) {
        Node newNode = new Node(element);
        last.next = newNode;
        last = newNode;
        size++;
    }

    public T dequeue() {
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
