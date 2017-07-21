package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int blackJack(int a, int b)
    {
        int c = 0;
        if ((a == 0 && b == 0) || (a > 21 && b >21))
        {
            c = 0;
        }
        else if (a > b && a < 21 || b > 21) // if a is more then b or b is more then 21
        {
            c = a;
        }
        else if (a < b && b < 21 || a > 21) // if a is less then b or a is more then 21
        {
            c = b;
        }
        return c;
    }
    public static int uniqueSum(int [] sumNumbers)
    {
        //System.out.println(Arrays.toString(sumNumbers)); //

        int sum = 0;
        //create array list
        ArrayList<Integer> sumableNumbers = new ArrayList<>();
        for (int i= 0; i < sumNumbers.length; i++) {
            //System.out.println("!" + sumNumbers[i]); //
            if (!sumableNumbers.contains(sumNumbers[i]))
            {
                //System.out.println("!"); //
                sumableNumbers.add(sumNumbers[i]);
            }
            System.out.println("after populated : " + Arrays.toString(sumableNumbers.toArray()));


        }

        for (int listItem : sumableNumbers)
        {
            //System.out.println("!" + listItem); //
            System.out.println("in sum loop : " + Arrays.toString(sumableNumbers.toArray()));
            sum += listItem;
            //System.out.println(sum);

        }

        return sum;
    }
    public static boolean tooHot(int temp, String summer)
    {
        boolean bounds;
        if (summer == "Summer")
        {
            if (temp >= 60 && temp <= 100)
            {
                bounds = true;
            }
            else
            {
                bounds = false;
            }
        }
        else
        {
            if (temp >= 60 && temp <= 90)
            {
                bounds = true;
            }
            else
            {
                bounds = false;
            }
        }
        return bounds ;
        // if-then-else ? - ternary operator
    }

    public static void main(String[] args)
    {
        //int a = 15, b = 16;
        //System.out.println(BlackJack(a , b));
        //int[] sumNumbers = {2, 2 ,3};
        //System.out.println(uniqueSum(sumNumbers));
        String summer = "Summer";
        int temp = 25;
        System.out.println(tooHot( temp,  summer));

    }
}
