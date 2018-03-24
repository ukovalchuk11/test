package list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.list.Node;

public class NodeClass {
    @Test
    public void method(){
        Node<Integer> node = new Node<>();

        Node first = new Node<>(1);
        Node two = new Node<>(2);
        Node third = new Node<>(3);
        Node four = new Node<>(4);

        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;

        Assert.assertThat(node.hasCycle(first),Is.is(true));

    }
}
