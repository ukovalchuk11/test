package list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.list.ListDynamic;
import java.util.Iterator;


public class ListDynamicClass {

    @Test
    public void addAndGet (){
        ListDynamic<Integer> listDynamic = new ListDynamic<>();
        listDynamic.add(5);
        listDynamic.add(0);
        listDynamic.add(4);
        Assert.assertThat(listDynamic.get(0), Is.is(5));
        Assert.assertThat(listDynamic.get(1), Is.is(0));
        Assert.assertThat(listDynamic.get(2), Is.is(4));
    }

    @Test
    public void dynamic(){
        ListDynamic<Integer> listDynamic = new ListDynamic<>();
        for(int i = 0; i < 20; i++){
            listDynamic.add(i);
        }
        Assert.assertThat(listDynamic.get(19), Is.is(19));
    }

    @Test
    public void concurrentModificationException(){
        ListDynamic<Integer> listDynamic = new ListDynamic<>();
        Iterator<Integer> iterator = listDynamic.iterator();
        Assert.assertFalse(iterator.hasNext());
    }
}
