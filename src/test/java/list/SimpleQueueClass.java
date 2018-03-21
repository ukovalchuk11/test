package list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.list.SimpleQueue;


public class SimpleQueueClass {
    @Test
    public void queue() {
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>();
        simpleQueue.push(7);
        simpleQueue.push(1);
        simpleQueue.push(9);
        Assert.assertThat(simpleQueue.poll(), Is.is(7));
        Assert.assertThat(simpleQueue.poll(), Is.is(1));
        Assert.assertThat(simpleQueue.poll(), Is.is(9));
    }
}
