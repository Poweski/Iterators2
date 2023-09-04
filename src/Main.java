import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //zad1
        //kthElementIteratorTest(3);
        //zad2
        //fibonacciIteratorTest(10);
        //zad3
        //shuffleIteratorTest();
        //zad4
        primeIteratorTest(20);
        //zad5
        //arrayIteratorTest1();
        //arrayIteratorTest2();
    }
    public static void kthElementIteratorTest(int k) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Iterator<Integer> baseIterator = numbers.iterator();
        KthElementIterator<Integer> kthIterator = new KthElementIterator<>(baseIterator, k);

        while (kthIterator.hasNext())
            System.out.println("\nKthElement Iterator:\n" + kthIterator.next());
    }
    public static void fibonacciIteratorTest(int n) {
        System.out.println("\nFibonacci Iterator:");
        Iterator<Integer> fibonacciIterator = new FibonacciIterator();

        for (int i=0; i<n; i++)
            System.out.println(fibonacciIterator.next());
    }
    public static void shuffleIteratorTest() {
        System.out.println("\nShuffle Iterator:");
        Iterator<Integer> firstIterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
        Iterator<Integer> secondIterator = Arrays.asList(11, 12, 13).iterator();
        Iterator<Integer> shuffleIterator = new ShuffleIterator<>(firstIterator, secondIterator);
        ArrayList<Integer> shuffledList = new ArrayList<>();

        while (shuffleIterator.hasNext())
            shuffledList.add(shuffleIterator.next());

        System.out.println(shuffledList);
    }
    public static void primeIteratorTest(int limit) {
        System.out.println("\nPrime Iterator:");
        Iterator<Integer> primeIterator = new PrimeIterator(limit);

        while (primeIterator.hasNext())
            System.out.println(primeIterator.next());
    }
    public static void arrayIteratorTest1() {
        System.out.println("\nArray Iterator (test 1):");
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Iterator<Integer> iterator = new ArrayIterator<>(array);

        try {
            if(iterator.hasNext())
                iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }

    public static void arrayIteratorTest2() {
        System.out.println("\nArray Iterator (test 2):");
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Iterator<Integer> iterator = new ArrayIterator<>(array);

        for (int i=0; i<2; i++) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        try {
            if(iterator.hasNext())
                iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        for (int i=0; i<2; i++) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}