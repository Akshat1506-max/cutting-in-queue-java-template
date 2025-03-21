package org.example;

public class PriorityQueue<T extends Comparable<T>> {
    private MaxHeap<T> maxHeap;

    public PriorityQueue() {
        maxHeap = new MaxHeap<>();
    }

    public void insert(T value) {
        maxHeap.insert(value);
    }

    public T extractMax() {
        return maxHeap.extractMax();
    }

    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }
}