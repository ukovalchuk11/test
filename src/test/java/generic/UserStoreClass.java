package generic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.generic.User;
import ru.test.generic.UserStore;

public class UserStoreClass {
    private UserStore userStore = new UserStore(100);

    @Test
    public void findById(){
        User user = new User("Igor");
        userStore.add(user);
        Assert.assertThat(userStore.findById("Igor").getId(), Is.is("Igor"));


    }

    @Test
    public void delete(){
        User user = new User("Ina");
        userStore.add(user);
        userStore.delete("Ina");
        Assert.assertNull(userStore.findById("Ina"));
    }

    @Test
    public void replace(){
        User user = new User("Ira");
        userStore.add(user);
        Assert.assertTrue(userStore.replace("Ira",new User("Inna")));
    }
}
