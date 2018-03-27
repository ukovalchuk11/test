package set;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.set.SimpleSet;
import java.util.Iterator;

public class SimpleStackClass {
    @Test
    public void add (){
        SimpleSet<Integer> simpleSet = new SimpleSet<>();
        simpleSet.add(10);
        simpleSet.add(8);
        simpleSet.add(10);
        Iterator<Integer> iterator = simpleSet.iterator();
        Assert.assertThat(iterator.hasNext(), Is.is(true));
        Assert.assertThat(iterator.next(),Is.is(10));
        Assert.assertThat(iterator.hasNext(), Is.is(true));
        Assert.assertThat(iterator.next(),Is.is(8));
        Assert.assertThat(iterator.hasNext(), Is.is(false));

    }
}
