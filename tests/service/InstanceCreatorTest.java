package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class InstanceCreatorTest {

    ArrayList<Object>list;
    InstanceCreator creator;

    @Before
    public void initTest(){

        creator = new InstanceCreator();
        list = new ArrayList<>();
    }
    @Test
    public void correctParameterInitClassWithListTest(){
        Integer i = 5;
        Integer c = 0;
        list.add(i);
        try {
           c = (Integer) creator.initClass(i.getClass(), list);
        } catch (Exception e) {
        }
        Assert.assertEquals(c,i);
    }

    @Test(expected = IllegalArgumentException.class)
    public void incorrectParameterInitClassWithListTest()throws Exception{
        Integer i = 0;
            i = (Integer) creator.initClass(i.getClass(), list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noSuchConstructorInitClassWithListTest()throws Exception{
        Integer i = 0;
        i = (Integer) creator.initClass(i.getClass(), list);
    }

    @Test
     public void correctEqualsInitClassWithListTest() throws Exception{
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        list.add(0, "Name");
        list.add(1, 1);
        list.add(2,22.2d);
        list.add(3, 33.3d);
        chicken1 = (Chicken) creator.initClass(chicken1.getClass(), list);
        chicken2 = (Chicken) creator.initClass(chicken2.getClass(), list);
        Assert.assertEquals(chicken1, chicken2);
    }

    @Test
    public void incorrectEqualsInitClassWithListTest() throws Exception{
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        list.add(0, "Name");
        list.add(1, 1);
        list.add(2,22.2d);
        list.add(3, 33.3d);
        chicken1 = (Chicken) creator.initClass(chicken1.getClass(), list);
        list.removeAll(list);
        chicken2 = (Chicken) creator.initClass(chicken2.getClass(), list);
        Assert.assertNotEquals(chicken1, chicken2);
    }

}
