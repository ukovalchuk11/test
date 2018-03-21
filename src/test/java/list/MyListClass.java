package list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.list.MyList;

import java.util.Iterator;

public class MyListClass {


    @Test
    public void addAndGet(){
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(1);
        myList.add(8);
        Assert.assertThat(myList.get(0), Is.is(10));
        Assert.assertThat(myList.get(1), Is.is(1));
        Assert.assertThat(myList.get(2), Is.is(8));
    }

    @Test
    public void concurrentModificationException(){
        MyList<Integer> myList = new MyList<>();
        Iterator<Integer> iterator = myList.iterator();
        Assert.assertFalse(iterator.hasNext());
    }
}
