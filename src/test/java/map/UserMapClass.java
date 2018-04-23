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

    @Test
    public void showMapHashCode(){
        UserMap user3 = new UserMap(10,"Petr",10);
        UserMap user4 = new UserMap(10,"Petr",10);
        Map<UserMap,Object> map = new HashMap<>();
        map.put(user3, new Object());
        map.put(user4, new Object());
        System.out.println(map);
    }

    @Test
    public void showMapEquals(){
        UserMap user5 = new UserMap(7,"Petr",15);
        UserMap user6 = new UserMap(7,"Petr",15);
        Map<UserMap,Object> map = new HashMap<>();
        map.put(user5, new Object());
        map.put(user6, new Object());
        System.out.println(map);
    }
}
