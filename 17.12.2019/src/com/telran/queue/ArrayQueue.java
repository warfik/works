package com.telran.queue;

public class ArrayQueue<E> implements Queue<E> {

    private int size;
    private int first;
    private Object[] source;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        source = new Object[capacity];
    }

    @Override
    public void add(E e) {
        if (size == capacity)
            throw new FullQueueException();

        int index = (first + size) % capacity;
        source[index] = e;
        size++;
    }

    @Override
    public E release() {
        E value = (E) source[first];
        if (size==capacity)
            throw new NoElementsException();
        source[first] = null;
        size--;
        return
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int getCapacity(){
    return capacity;
    }
}
