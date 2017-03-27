package com.adamkorzeniak.collection;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    private T[] data;
    private int size;
    private int capacity;

    public Bag() {
        this(10);
    }

    public Bag(int initialSize) {
        data = (T[]) new Object[initialSize];
        capacity = initialSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        if (!this.contains(element)) {
            data[size++] = element;
        }
        if (size == capacity) {
            capacity *= 2;
            copyData(capacity);
        }
    }

    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                element = data[i];
                data[i] = data[size - 1];
                data[size - 1] = null;
                size--;
                if (size < capacity / 4) {
                    capacity /= 2;
                    copyData(capacity);
                }
                return element;
            }
        }
        return null;
    }

    public T get(T element) {
        for (T el : data) {
            if (el == null) {
                return null;
            }
            if (el.equals(element)) {
                return el;
            }
        }
        return null;
    }

    public boolean contains(T element) {
        return get(element) != null;
    }

    private void copyData(int capacity) {
        T[] newData = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public Iterator<T> iterator() {
        //TODO
        return null;
    }
}
