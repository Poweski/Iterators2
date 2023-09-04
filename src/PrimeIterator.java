import java.util.Iterator;

public class PrimeIterator implements Iterator<Integer> {
    private int current = 2;
    private final int limit;

    public PrimeIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        while (current < limit) {
            if (isPrime(current))
                return true;
            current++;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new IllegalStateException("No more elements");

        int result = current;
        current++;
        return result;
    }

    private boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i == 0)
                return false;

        return true;
    }
}