package iterator;

import org.junit.Test;
import ru.test.iterator.Converter;

import java.util.Arrays;
import java.util.Iterator;

public class ConverterClass {
    @Test
    public void test (){
        Iterator iterator1 = Arrays.asList(4,2,0,4,6,4,9).iterator();
        Iterator iterator2 = Arrays.asList(0,9,8,7,5).iterator();
        Iterator iterator3 = Arrays.asList(1,3,5,6,7,0,9,8,4).iterator();
        Iterator<Iterator> it = Arrays.asList(iterator1, iterator2, iterator3).iterator();
        Converter converter = new Converter();
        Iterator<Integer> iterator = converter.convert(it);
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

    }
}
