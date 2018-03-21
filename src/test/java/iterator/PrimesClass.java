package iterator;

import org.junit.Test;
import ru.test.iterator.Primes;

public class PrimesClass {
    @Test
    public void test () {
        Primes p = new Primes(new  int[] {3, 4, 5, 6, 7, 4, 0, 11, 7, 19, 15, 11,2, 21});
        while (p.hasNext()){
            System.out.print(p.next()+" ");
        }

    }
}
