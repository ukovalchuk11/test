package iterator;

import org.junit.Test;
import ru.test.iterator.Items;

public class ItemsClass {
    @Test
    public void test (){
        Items it = new Items(new int[][] {{1,2,3},{5,6,7,8}});
        while (it.hasNext()) {
            int result = (Integer) it.next();
            System.out.print(result+" ");
        }
    }

}