import java.util.Iterator;

public class ShuffleIterator<T> implements Iterator<T> {
    private final Iterator<T> firstIterator;
    private final Iterator<T> secondIterator;
    private boolean useFirst = true;

    public ShuffleIterator(Iterator<T> firstIterator, Iterator<T> secondIterator) {
        this.firstIterator = firstIterator;
        this.secondIterator = secondIterator;
    }

    @Override
    public boolean hasNext() {
        return firstIterator.hasNext() || secondIterator.hasNext();
    }

    @Override
    public T next() {
        T result;
        if (useFirst && firstIterator.hasNext()) {
            result = firstIterator.next();
        } else if (secondIterator.hasNext()) {
            result = secondIterator.next();
        } else if (firstIterator.hasNext()) {
            result = firstIterator.next();
        } else {
            throw new IllegalStateException("No more elements");
        }
        useFirst = !useFirst;
        return result;
    }
}