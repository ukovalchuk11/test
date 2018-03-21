package iterator;

import org.junit.Test;
import ru.test.iterator.EvenNumbers;

public class EvenNumbersClass {
    @Test
    public void test () {
        EvenNumbers ev = new EvenNumbers(new  int[] {4, 2, 1, 1,0,10, 2, 8});
        while (ev.hasNext()){
            System.out.print(ev.next()+" ");
        }
    }
}
