package com.adamkorzeniak.collections;

public class Queue<T> {
    private final T[] data;
    private int size;

    public Queue() {
        this(10);
    }

    public Queue(int initialSize) {
        data = (T[])new Object[initialSize];
        size = initialSize;
    }

    public boolean contains(T element) {
        return get(element) != null;
    }

    public boolean isEmpty() {
        return data.length == 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        if (!this.contains(element)) {
            data[size++] = element;
        }
    }

    public T get(T element) {
        for (T el: data) {
            if (el.equals(element)) {
                return el;
            }
        }
        return null;
    }

    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                element = data[i];
                data[i] = data[size-1];
                data[size-1] = null;
                size--;
                return element;
            }
        }
        return null;
    }
}
