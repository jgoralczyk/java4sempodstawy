package lab8;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class zad2FIFO<T> {
    private LinkedList<T> elements = new LinkedList<>();

    // dodaje na koniec
    public void enqueue(T element) {
        elements.addLast(element);
    }

    // usuwa zwraca pierwszy
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Kolejka jest pusta!");
        }
        return elements.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Kolejka jest pusta!");
        }
        return elements.getFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        zad2FIFO<String> queue = new zad2FIFO<>();

        queue.enqueue("Pierwszy");
        queue.enqueue("Drugi");
        queue.enqueue("Trzeci");

        System.out.println("Rozmiar kolejki: " + queue.size());

        System.out.println("Pierwszy element: " + queue.peek());

        System.out.println("Usunięto: " + queue.dequeue());
        System.out.println("Usunięto: " + queue.dequeue());

        System.out.println("Rozmiar kolejki po usunięciu: " + queue.size());

        try {
            zad2FIFO<Integer> emptyQueue = new zad2FIFO<>();
            emptyQueue.dequeue();
        } catch (NoSuchElementException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}