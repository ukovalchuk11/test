package map;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.map.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class UserTest {
    @Test
    public void whenNameChildrenCalendar(){
        Map<User, Object> map = new HashMap<>();
        User user1 = new User("Petr", 30,new GregorianCalendar(2018,Calendar.APRIL,4));
        User user2 = new User("Petr", 30,new GregorianCalendar(2018,Calendar.APRIL,4));
        int hash1 = user1.hashCode();
        int hash2 = user2.hashCode();
        Assert.assertThat(hash1 == hash2, Is.is(true));
        map.put(user1,null);
        map.put(user2,null);
        System.out.println(map);
    }
}
