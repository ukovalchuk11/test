package list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.list.SimpleStack;

public class SimpleStackClass {

    @Test
    public void stack() {
        SimpleStack<Integer> simpleStack = new SimpleStack<>();
        simpleStack.push(5);
        simpleStack.push(1);
        simpleStack.push(9);
        Assert.assertThat(simpleStack.poll(), Is.is(9));
        Assert.assertThat(simpleStack.poll(), Is.is(1));
        Assert.assertThat(simpleStack.poll(), Is.is(5));
    }
}
