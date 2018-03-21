package iterator;

import org.junit.Test;
import ru.test.iterator.ItemsOne;

public class ItemsOneClass {
    @Test
    public void test (){
        ItemsOne it = new ItemsOne(new int[] {2,1,4,5});
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
