package junit.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import service.Duck;
import service.Eagle;
import service.Service;
import service.ServiceRepository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class ServiceTests {
    ServiceRepository<Service> box;
    Duck duck;
    Eagle eagle;

    @Before
    public void init(){
        box = new ServiceRepository<>();
    }

    @Test
    public void serviceRepository_Test_Of_Empty_List(){
        assertTrue("Init array should be size 0 !", box.getStorage().size() == 0);
    }

    @Test
    public void serviceRepository_Test_Of_List_Comparator(){
        duck = new Duck("aaa", 1);
        eagle = new Eagle("bbb", 2);
        box.add(duck);
        box.add(eagle);
        box.sort();
        assertEquals(box.get(0), duck);
    }
    @Test
    public void serviceRepository_Test_Of_List_Correct_Remove(){
        duck = new Duck("AA", 100);
        box.add(duck);
        box.remove(duck);
        assertTrue(box.getStorage().isEmpty());
    }
}
