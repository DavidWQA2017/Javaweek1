package test;


import com.company.Library;
import com.company.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 21/07/2017.
 */
public class LibraryTest {


    @Test
    public void testtest() {
        String test = "hello ";
        Assert.assertEquals("hello", test);
        System.out.println("hello");
    }

    @Test
    public void checkPersonName() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        //String test = newone.getFirstName();
        Assert.assertNull(newone.getFirstName());
    }

    @Test
    public void checkPersonid() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getFirstName());
    }

    @Test
    public void checkLastName() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getLastName());
    }

    @Test
    public void checkAddressLine1() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getAddressLine1());
    }

    @Test
    public void checkPostcode() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getPostcode());
    }

    @Test
    public void checkPhoneNumber() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getTelephoneNumb());
    }

    @Test
    public void checkPhoneItemID() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNull(newone.getTakenItemID());
    }


}