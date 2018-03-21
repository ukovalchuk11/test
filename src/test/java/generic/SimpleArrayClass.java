package generic;

import org.junit.Test;
import ru.test.generic.SimpleArray;


public class SimpleArrayClass {
    @Test
    public void testToAdd(){
        SimpleArray simpleArray = new SimpleArray(3);
        simpleArray.add(1);
        simpleArray.add(2);
        simpleArray.add("one");
        System.out.println(simpleArray.get(0));
        System.out.println(simpleArray.get(1));
        System.out.println(simpleArray.get(2));
    }

    @Test
    public void testToUpdate(){
        SimpleArray simpleArray = new SimpleArray(2);
        simpleArray.add("one");
        simpleArray.add(0);
        System.out.println(simpleArray.get(0));
        System.out.println(simpleArray.get(1));
        System.out.println("------------------------");
        simpleArray.update(0,1);
        simpleArray.update(1,"the");
        System.out.println(simpleArray.get(0));
        System.out.println(simpleArray.get(1));

    }

    @Test
    public void testToDelete(){
        SimpleArray simpleArray = new SimpleArray(5);
        simpleArray.add(1);
//        simpleArray.add(3);
//        simpleArray.add(5);
//        simpleArray.add(7);
//        simpleArray.add(9);
        System.out.print(simpleArray.get(0)+ " ");
//        System.out.print(simpleArray.get(1)+ " ");
//        System.out.print(simpleArray.get(2)+ " ");
//        System.out.print(simpleArray.get(3)+ " ");
//        System.out.print(simpleArray.get(4)+ " ");
        System.out.println(" ");
//        simpleArray.delete(1);
        simpleArray.delete(1);
        System.out.print(simpleArray.get(0)+ " ");
//        System.out.print(simpleArray.get(1)+ " ");
//        System.out.print(simpleArray.get(2)+ " ");
//        System.out.print(simpleArray.get(3)+ " ");
//        System.out.print(simpleArray.get(4)+ " ");
    }
}
