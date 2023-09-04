import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current = 1;
    private int previous = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int next = current + previous;
        previous = current;
        current = next;
        return previous;
    }
}