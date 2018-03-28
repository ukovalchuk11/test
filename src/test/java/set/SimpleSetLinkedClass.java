package set;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.set.SimpleSetLinked;

import java.util.Iterator;

public class SimpleSetLinkedClass {
    @Test
    public void add (){
        SimpleSetLinked<Integer> setLinked = new SimpleSetLinked<>();
        setLinked.add(10);
        setLinked.add(8);
        setLinked.add(10);
        Iterator<Integer> iterator = setLinked.iterator();
        Assert.assertThat(iterator.hasNext(), Is.is(true));
        Assert.assertThat(iterator.next(),Is.is(10));
        Assert.assertThat(iterator.hasNext(), Is.is(true));
        Assert.assertThat(iterator.next(),Is.is(8));
        Assert.assertThat(iterator.hasNext(), Is.is(false));
    }
}
