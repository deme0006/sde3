package iterator;

public interface Iterator<T> {

    // If iterator has more elements
    boolean hasNext();

    // Get the next element
    T next();

    // Reset the iterator
    void reset();
}