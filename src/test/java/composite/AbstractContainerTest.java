package composite;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class AbstractContainerTest {

    @Test
    public void testGetPrice() throws Exception {
        Book book1 = new Book(10);
        Book book2 = new Book(20);
        Book book3 = new Book(20);
        //50
        Shelf shelf1 = new Shelf(50);
        Shelf shelf2 = new Shelf(50);
        //150
        shelf1.add(book1);
        shelf1.add(book2);
        shelf2.add(book3);
        //150
        Cupboard cupboard = new Cupboard(200);
        cupboard.add(shelf1);
        cupboard.add(shelf2);
        //350
        Room room = new Room(1000);
        room.add(cupboard);
        //1350

        Assert.assertEquals(1350,room.getPrice());

    }
}



