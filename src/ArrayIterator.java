import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int pos = 0;

    public ArrayIterator(T[] anArray) {
        array = anArray;
    }

    public boolean hasNext() {
        return pos < array.length;
    }

    public T next() throws NoSuchElementException {
        if (hasNext())
            return array[pos++];
        else
            throw new NoSuchElementException();
    }

    @Override
    public void remove() throws IllegalStateException {
        if (pos <= 0)
            throw new IllegalStateException("Next method has not been called yet, or the element has already been removed.");

        // usuń bieżący element
        System.arraycopy(array, pos, array, pos - 1, array.length - pos);

        // przesuń indeksy iteratora
        pos--;
        array = Arrays.copyOf(array, array.length - 1);
    }
}
