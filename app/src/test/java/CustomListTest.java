import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        list.addCity(new City("Halifax", "NS"));
        assertTrue(list.hasCity());
    }

    @Test
    public void countCityTest(){
        list.addCity(new City("Halifax", "NS"));
        assertEquals(1, list.countCity());
    }
    @Test
    public void deleteCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(0, list.getCount());
    }

}
