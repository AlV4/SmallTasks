package service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class InstanceCreatorTest {

    ArrayList<Object>list;
    InstanceCreator creator;
    Map<String, Object> map;

    @Before
    public void initTest(){

        creator = new InstanceCreator();
        list = new ArrayList<>();
        map = new HashMap<>();
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
        assertEquals(c,i);
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
        assertEquals(chicken1, chicken2);
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
        assertNotEquals(chicken1, chicken2);
    }

    @Test
    public void setPrivatesNotEqualsTest() throws Exception{
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
        map.put("anotherName", "Some name");
        Hummingbird h2 = new Hummingbird();
        creator.setPrivates(h2, map);
        assertNotEquals(h1, h2);
    }

    @Test
    public void setPrivatesEqualsTest() throws Exception{
        map.put("anotherName", "Some name");
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
        Hummingbird h2 = new Hummingbird();
        creator.setPrivates(h2, map);
        assertEquals(h1, h2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPrivatesIAExNameTest() throws Exception{
        map.put("anotherName", 1);
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPrivatesIAExAmountTest() throws Exception{
        map.put("secretAmount", "Str");
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPrivatesIAExPriceTest() throws Exception{
        map.put("anotherPrice", new JFrame());
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPrivatesIAExWeightTest() throws Exception{
        map.put("additionalWeight", "Str");
        Hummingbird h1 = new Hummingbird();
        creator.setPrivates(h1, map);
    }
}
