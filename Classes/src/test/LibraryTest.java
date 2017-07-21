package test;


import com.company.Library;
import com.company.PaintExercise;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 20/07/2017.
 */
public class LibraryTest
{
    Library lib = new Library();
    PaintExercise paint = new PaintExercise();

    @Test
    public void testtest()
    {
        String test  = "jh";
        Assert.assertEquals("hello" , test );
        System.out.println("hello");

    }


}
