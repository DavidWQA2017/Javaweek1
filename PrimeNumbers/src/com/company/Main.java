package com.company;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        int strtNumber = 1000000;
        int number = 2000000;
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        long startTime = System.currentTimeMillis();
        System.out.println("started process");
        for (int i = strtNumber; i < number + 1; i++)
        {

            numberMap.put(i, i);


        }



        //System.out.println(numberMap);
        numberMap.remove(0);
        numberMap.remove(1);
        numberMap.remove(number);
        System.out.println("started process 2");
        long startTime2s = System.currentTimeMillis();
            for (int i = 4; i < number ; i += 2)
            {
                //System.out.println("doing stuff" + i);
                numberMap.remove(i);
            }
        long endTime2s = System.currentTimeMillis();
        long totalTime2 = (endTime2s - startTime2s);
        System.out.println(totalTime2 + "ms");

        long startTimeRest = System.currentTimeMillis();
       // for (int j = 2; j < number / j; j++) {
            for (int j = 3; j < number; j += 2)
            {
                for (int i = (j* 2); i < number; i += j)
                {
                    //System.out.println("doing stuff" + i);
                    numberMap.remove(i);
                }
            }
        long endTimeRest = System.currentTimeMillis();
        long totalTimeRest = (endTimeRest - startTimeRest);
        System.out.println(totalTimeRest + "ms");
            //System.out.println(numberList);
       // }

        //System.out.println(numberMap);
        int numebr = numberMap.size();
        System.out.println("Total number of primes: " + numebr);
        long endTime   = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        System.out.println(totalTime + "ms");
        System.out.println(totalTime/1000 + " seconds ");
    }
}

