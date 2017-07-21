package com.company;

public class Person
{
    int personalID;
    String firstName;
    String lastName;
    String addressLine1;
    String postcode;
    String telephoneNumb;
    int takenItemID;

    public Person(int personalID, String firstName, String lastName, String addressLine1,  String postcode, String telephoneNumb ,int takenItemID )
    {
        this.personalID = personalID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.postcode = postcode;
        this.telephoneNumb = telephoneNumb;
        this.takenItemID = takenItemID;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelephoneNumb() {
        return telephoneNumb;
    }

    public void setTelephoneNumb(String telephoneNumb) {
        this.telephoneNumb = telephoneNumb;
    }

    public int getTakenItemID() {
        return takenItemID;
    }

    public void setTakenItemID(int takenItemID) {
        this.takenItemID = takenItemID;
    }
}