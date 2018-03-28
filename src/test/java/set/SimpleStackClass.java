package set;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.set.SimpleSet;
import java.util.Iterator;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;

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

    @Test
    public void whenHasNexIntegerThenNextReturnIt() {
        SimpleSet<Integer> set = new SimpleSet<>();
        set.add(42);
        set.add(93);
        set.add(320);
        Iterator<Integer> iterator = set.iterator();

//        assertThat(iterator.hasNext(), is(true));
//        assertThat(iterator.next(), is(42));
//        assertThat(iterator.hasNext(), is(true));
//        assertThat(iterator.next(), is(93));
//        assertThat(iterator.hasNext(), is(true));
//        assertThat(iterator.next(), is(320));
//        assertThat(iterator.hasNext(), is(false));
    }
}
