package test;


import com.company.*;
import org.junit.Assert;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 21/07/2017.
 */
    public class LibraryTest {


    /////////////////////////////////////////////////////////////////////////////////////////check Person class//////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        Assert.assertNotNull(newone.getFirstName());
    }

    @Test
    public void checkPersonid() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNotNull(newone.getFirstName());
    }

    @Test
    public void checkLastName() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNotNull(newone.getLastName());
    }

    @Test
    public void checkAddressLine1() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNotNull(newone.getAddressLine1());
    }

    @Test
    public void checkPostcode() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNotNull(newone.getPostcode());
    }

    @Test
    public void checkPhoneNumber() {
        Person newone = new Person(0, null, null, null, null, null, 0);
        Assert.assertNotNull(newone.getTelephoneNumb());
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////check Book////////////////////////////////////////////////////////////////////////////

    @Test
    public void checkNumeberOfPages()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getNumberOfPages());
    }

    @Test
    public void checkBookTitle()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getBookTitle());
    }

    @Test
    public void checkBookAuthor()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getBookAuthor());
    }

    @Test
    public void checkBookPublishDate()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getPublishedDate());
    }

    @Test
    public void checkBookID()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getItemID());
    }

    @Test
    public void checkAvailable()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getAvailable());
    }

    @Test
    public void checkBorrowTenure()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getBorrowTenure());
    }

    @Test
    public void checkTakenDate()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getDateTaken());
    }

    @Test
    public void checkDueDate()
    {
        Book newItem = new Book(0 , false , 0, null, null, null , null , null, 0);
        Assert.assertNotNull(newItem.getdatedue());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////check Media////////////////////////////////////////////////////////////////////////////
    @Test
    public void checkMediaObject()
    {
        MediaResources newItem = new MediaResources(0 , false , 0 , null , null , null );
        Assert.assertNotNull(newItem.getObject());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////check Map////////////////////////////////////////////////////////////////////////////
    @Test
    public void checkMapCartographer()
    {
        Map newItem = new Map(0 , false , 0 , null , null , null , null);
        Assert.assertNotNull(newItem.getCartographer());
    }

    @Test
    public void checkMapArea()
    {
        Map newItem = new Map(0 , false , 0 , null , null , null , null);
        Assert.assertNotNull(newItem.getMapArea());
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////check Takeable////////////////////////////////////////////////////////////////////////////
    @Test
    public void takeItemOut()
    {
        Map newItem = new Map(0 , true , 0 , null , null , null , null);
        Assert.assertEquals(newItem.getAvailable() , "false");
    }

    @Test
    public void putItemBack()
    {
        Map newItem = new Map(0 , false , 0 , null , null , null , null);
        Assert.assertEquals(newItem.getAvailable() , "true");
    }

    @Test
    public void setDueDate()
    {
        Map newItem = new Map(0 , false , 0 , null , null , null , null);
        Date date = Calendar.getInstance().getTime();
        date = newItem .setDatedue(date, 7);
        Assert.assertEquals(date,2/8/2017);
    }

}