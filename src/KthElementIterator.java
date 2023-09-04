import java.util.Iterator;
import java.util.NoSuchElementException;

public class KthElementIterator<T> implements Iterator<T> {
    private final Iterator<T> baseIterator;
    private final int k;
    private int count;

    public KthElementIterator(Iterator<T> baseIterator, int k) {
        this.baseIterator = baseIterator;
        this.k = k;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count == 0;
    }

    @Override
    public T next() {
        while (baseIterator.hasNext()) {
            T nextElement = baseIterator.next();
            count++;
            if (count == k)
                return nextElement;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new NoSuchElementException();
    }
}