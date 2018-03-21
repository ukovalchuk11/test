package generic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.test.generic.Role;
import ru.test.generic.RoleStore;

public class RoleStoreClass {
    private RoleStore roleStore = new RoleStore(100);

    @Test
    public void findById(){
        Role role = new Role("role");
        roleStore.add(role);
        Assert.assertThat(roleStore.findById("role").getId(), Is.is("role"));


    }

    @Test
    public void delete(){
       Role role = new Role("son");
       roleStore.add(role);
       roleStore.delete("son");
       Assert.assertNull(roleStore.findById("son"));
    }

    @Test
    public  void  replace(){
        Role role = new Role("idea");
        roleStore.add(role);
        Assert.assertTrue(roleStore.replace("idea",new Role("idea2")));

    }
}
