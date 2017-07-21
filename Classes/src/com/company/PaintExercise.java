package com.company;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PaintExercise
{
    public static String bestMoneytoPaintRatio(ArrayList<Paint> availablePaint)
    {
        String paintBrand = "";
        ArrayList<Float> painttoPriceList = new ArrayList<>();

        for (int i = 0; i < availablePaint.size(); i++)
        {
            painttoPriceList.add(0.0f);
        }

        float currentPrice = 0.0f;
        float currentCoverage = 0.0f;
        float currentRatio = 0.0f;
        for (int i = 0; i < painttoPriceList.size(); i++)
        {
            currentPrice = availablePaint.get(i).getPrice();
            currentCoverage = availablePaint.get(i).getCoverage();
            currentRatio = currentCoverage/currentPrice;
            painttoPriceList.set(i, currentRatio);

            //System.out.println(painttoPriceList.get(i));
        }


        float currentMin = painttoPriceList.get(0);
        int bestBrand = 0;
        for (int i = 0; i < painttoPriceList.size(); i++)
        {
            if (painttoPriceList.get(i) < currentMin)
            {
                currentMin = painttoPriceList.get(i);
                //System.out.println(currentMin);
                bestBrand = i;
            }
        }

        //System.out.println(currentMin + "  and brand  " + bestBrand);

        paintBrand = availablePaint.get(bestBrand).getBrand();

        return paintBrand;
    }
    public static String suitablePaintForRoom(int roomArea , ArrayList<Paint> availablePaint)
    {
        String paintBrand = "";
        ArrayList<Integer> totalCansList = new ArrayList<>();
        //int[] totalCans ;
        //totalCans = new int[3];

        for (int i = 0; i < availablePaint.size(); i++)
        {
            totalCansList.add(0);
        }


        for (int i= 0; i < availablePaint.size(); i++ )
        {
            int cRoomArea= roomArea;
            int current = 0;
            do
            {
                cRoomArea -= availablePaint.get(i).createTotalCoverage();
                current = totalCansList.get(i);
                current++;
                totalCansList.set(i, current);
                //System.out.println("total cans" + totalCansList.get(i));
                //totalCans[i] = totalCans[i] + 1;
                //System.out.println(totalCans[i]);
            }
            while (cRoomArea > 0);
        }

        int current = 0;
        for (int i = 0;  i < totalCansList.size(); i++)
        {
            int a = Math.round(availablePaint.get(i).getPrice());
            current = totalCansList.get(i);
            current = current * a;
            totalCansList.set(i, current);
            //System.out.println(totalCansList.get(i));
            //totalCans[i] = totalCans[i] * a;
        }

        //System.out.println(totalCans[0]);
        //System.out.println(totalCans[1]);
        //System.out.println(totalCans[2]);

        int currentMin = totalCansList.get(0);
        int bestBrand = 0;
        for (int i = 0; i < totalCansList.size(); i++)
        {
                //System.out.println("working");
                if (totalCansList.get(i) < currentMin)
                {
                    currentMin = totalCansList.get(i);
                    bestBrand = i;
                }
                else {}
        }

        paintBrand = availablePaint.get(bestBrand).getBrand();
        //System.out.println(paintBrand);


        return paintBrand;
    }
    public static String wastesLeast(int roomArea, ArrayList<Paint> availablePaint)
    {
        String paintBrand = "";
        ArrayList<Integer> totalWastedList = new ArrayList<>();
        ArrayList<Integer> totalCansList = new ArrayList<>();

        for (int i = 0; i < availablePaint.size(); i++ )
        {
            totalWastedList.add(0);

        }

        for (int i = 0; i < availablePaint.size(); i++ )
        {
            totalCansList.add(0);
        }



        int totalWasted = 0;
        for (int i= 0; i < availablePaint.size(); i++ )
        {
            int cRoomArea= roomArea;
            int current = 0;
            do
            {
                cRoomArea -= availablePaint.get(i).createTotalCoverage();
                current = totalCansList.get(i);
                current++;
                totalCansList.set(i, current);
                //System.out.println( i + " has Overflow of " + cRoomArea );
                //totalCans[i] = totalCans[i] + 1;
                //System.out.println(totalCans[i]);
            }
            while (cRoomArea > 0);
            totalWastedList.set(i, cRoomArea);
            //System.out.println((totalWastedList.get(i)));
        }

        for (int i=0; i < totalWastedList.size(); i++)
        {
            int current = -totalWastedList.get(i) / availablePaint.get(i).getCoverage();
            totalWastedList.set(i, current);
            //System.out.println(" total litres wasted " + (totalWastedList.get(i)));

        }


        int currentMax = totalWastedList.get(0);
        int bestBrand = 0;
        for (int i = 0; i < totalWastedList.size(); i++)
        {
            //System.out.println("working");
            if (totalCansList.get(i) < currentMax)
            {
                currentMax = totalWastedList.get(i);
                bestBrand = i;
            }
            else {}
        }
        paintBrand = availablePaint.get(bestBrand).getBrand();
        //System.out.println(paintBrand);
        return paintBrand;
    }
    public static void main(String[] args)
    {
        int roomArea = 200;

        ArrayList<Paint> availablePaint = new ArrayList<>();
        Paint newone = new Paint("DuluxourousPaints", 10 , 25.0f ,20 );
        availablePaint.add(newone);
        Paint newtwo = new Paint("AverageJoes", 15 , 17.99f ,11 );
        availablePaint.add(newtwo);
        Paint newthree = new Paint("CheapoMax", 20 , 19.99f ,10 );
        availablePaint.add(newthree);

        System.out.println("for a room of " + roomArea +  "m the best brand is " + suitablePaintForRoom(roomArea , availablePaint));
        System.out.println("the best paint is " + bestMoneytoPaintRatio(availablePaint));
        System.out.println("the brand that wastes the least amount of paint for a " + roomArea + "m sized room is " + wastesLeast(roomArea , availablePaint));


    }
}

class Paint
{
    private String brand;
    private int amount;
    private float price;
    private int coverage;
    private int totalCoverage;

    Paint(String brand, int amount, float price, int coverage)
    {
        this.brand = brand;
        this.amount = amount;
        this.price = price;
        this.coverage = coverage;
    }


    public float getPrice()
    {
       return price;
    }

    public int getCoverage()
    {
       return coverage;
    }

    public String getBrand()
    {
        return brand;
    }

    public int createTotalCoverage ()
    {
        totalCoverage = coverage * amount;
        return totalCoverage;
    }
}
