package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    /*
    public static void personClassExercise()
    {
        ArrayList<Person> people = new ArrayList<>(3);
        //original way
        Person me = new Person("Bill", 22, "Consultant");
        people.add(me);
        Person one = new Person("Bob", 25, "clerk");
        people.add(one);
        Person two = new Person("Geoff", 90, "Assistant");
        people.add(one);

        //neater way
        people.add(new Person("Jack", 22, "Consultant"));
        people.add(new Person("Bob", 25, "clerk"));
        people.add(new Person("Bob", 25, "clerk"));

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Name " + people.get(i).getName());
            System.out.println("Age " + people.get(i).getAge());
            System.out.println("Job " + people.get(i).getJob());
        }
    }
    */

    public static void vehicleClassExercise()
    {
        Garage myGarage = new Garage();
        myGarage.addVehicle(new Car(4 , "56CI", 6000, 4));
        myGarage.addVehicle(new Bike(2, "7AYII" ,4000 , true ));

        System.out.println(Arrays.toString(myGarage.getVehicles().toArray()));

        //System.out.println(myGarage.allVehicles.get(0).toString());

        System.out.println(myGarage.priceGarage());
        myGarage.removeVehicle(0);
        System.out.println(myGarage.priceGarage());
        myGarage.emptyGarage();
        System.out.println(myGarage.priceGarage());
    }

    public static void main(String[] args) {
        //personClassExercise();
        //vehicleClassExercise();
    }
}

/*class Person
{
    private String name;
    private int  age;
    private String job;

    public Person (String name, int age, String job)
    {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge()
    {

        return age;
    }

    public String getJob()
    {
        return job;
    }

    public String getName() {
        return name;
    }
}
*/


class Garage
{
    ArrayList<Vehicle> allVehicles;
    public Garage()
    {
        allVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle entry)
    {
        allVehicles.add(entry);
    }

    public ArrayList<Vehicle> getVehicles()
    {
        return allVehicles;
    }

    public void removeVehicle(int id)
    {
        allVehicles.remove(id);
    }

    public void emptyGarage()
    {
        allVehicles.clear();
    }

    public double priceGarage()
    {
        double totalPrice = 0;
        for (Vehicle cVehicle : allVehicles)
        {
            totalPrice += cVehicle.getVehiclePrice();
        }

        return totalPrice;
    }


}

class Vehicle
{

    private int wheelNum;
    private String engineType;
    private int vehiclePrice;

    public Vehicle(int wheelNum, String engineType, int vehiclePrice )
    {
        this.wheelNum = wheelNum;
        this.engineType = engineType;
        this.vehiclePrice = vehiclePrice;

    }

    public String toString(){
        return wheelNum + " " + engineType + " " + vehiclePrice;
    }

    public int getwheelNumb()
    {
        return  wheelNum;
    }

    public String getEngineType()
    {
        return engineType;
    }

    public int getVehiclePrice()
    {
        return vehiclePrice;
    }

}

class Bike extends Vehicle
{
 private boolean driversHelmet;

    public Bike(int wheelNum, String engineType , int vehiclePrice , boolean driversHelmet)
    {
            super(2, engineType, vehiclePrice);
            this.driversHelmet = driversHelmet;
    }

    public boolean getdriversHelmet()
    {
        return driversHelmet;
    }



}

class Car extends Vehicle
{
    private int gears;
    public Car(int wheelNum, String engineType, int vehiclePrice, int gears)
    {
        super(4, engineType, vehiclePrice);
        this.gears = gears;

    }

    public int getGears() {
        return gears;
    }
}

class Heavy extends Vehicle
{
    private int cargoWeight;
    private String cargo;
    public Heavy(int wheelNum, String engineType, int vehiclePrice, int cargoWeight , String cargo)
    {
        super(4, engineType, vehiclePrice);
        this.cargoWeight = cargoWeight;
        this.cargo = cargo;
    }

}