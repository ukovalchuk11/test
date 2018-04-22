package map;

import org.junit.Test;
import ru.test.map.UserMap;

import java.util.HashMap;
import java.util.Map;

public class UserMapClass {
    @Test
    public void showMapNotEqualsAndHashCode(){
        UserMap user1 = new UserMap(5,"Petr",20);
        UserMap user2 = new UserMap(5,"Petr",20);
        Map<UserMap,Object> map = new HashMap<>();
        map.put(user1, new Object());
        map.put(user2, new Object());
        System.out.println(map);
    }
}
