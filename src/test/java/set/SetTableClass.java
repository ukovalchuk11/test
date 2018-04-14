package set;

import org.junit.Assert;
import org.junit.Test;
import ru.test.set.SetTable;


public class SetTableClass {

    @Test
    public void showSet() {
        SetTable<Integer> setTable = new SetTable<>();
        Assert.assertTrue(setTable.add(0));
        Assert.assertTrue(setTable.add(5));
        Assert.assertTrue(setTable.remove(0));
        Assert.assertTrue(setTable.add(-1));
        Assert.assertTrue(setTable.add(-6));
        Assert.assertTrue(setTable.remove(-6));
        Assert.assertFalse(setTable.add(null));

    }
}
