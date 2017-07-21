package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 20/07/2017.
 */
public class Library
{
    public static void main(String[] args)
    {

    }
}

class ALibrary
{
    ArrayList<Inventory> allInventories;
    ArrayList<Person> members;

    public void addPerson(Person entry)
    {

    }

    public void removePerson(int id)
    {

    }

    public void updatePerson(int id)
    {

    }

}

class Inventory
{
    ArrayList<Item> allItems;
    ArrayList<Item> AvailableItems;

    public void addItem(Item entry)
    {

    }

    public void removeItem(int id)
    {

    }

    public void updateItem(int id)
    {

    }

    public void displayLibaryContents()
    {

    }
}

abstract class Item
{
    int itemID;
    Boolean available;
    int borrowTenure;

    public int getItemID() {
        return itemID;
    }

    public Boolean getAvailable() {
        return available;
    }

    public int getBorrowTenure() {
        return borrowTenure;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setBorrowTenure(int borrowTenure) {
        this.borrowTenure = borrowTenure;
    }

}

class Book extends Item
{
    String bookTitle;
    String bookAuthor;
    Date publishedDate;
    int numberOfPages;

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}

class Map extends Item
{
    String cartographer;
    String mapArea;

    public String getCartographer() {
        return cartographer;
    }

    public String getMapArea() {
        return mapArea;
    }

    public void setCartographer(String cartographer) {
        this.cartographer = cartographer;
    }

    public void setMapArea(String mapArea) {
        this.mapArea = mapArea;
    }
}

class MediaResources extends Item
{
    String object;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}

class Person
{
    int personalID;
    String firstName;
    String lastName;
    String addressLine1;
    String postcode;
    String telephoneNumb;
    int takenItemID;

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

class Takeable
{

    Date dateTaken;
    Date Datedue;

    public void takeItemOut()
    {

    }

    public void putItemBack()
    {

    }

    public String checkItemsAvailabiality()
    {


        return "";
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public void setDatedue(Date datedue) {
        Datedue = datedue;
    }
}

