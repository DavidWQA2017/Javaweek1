package com.company;

import java.util.Date;

abstract class Item
{
    int itemID;
    Boolean available;
    int borrowTenure;
    Date dateTaken; ///change UML to reflect this
    Date datedue; ///change UML to reflect this

    Item(int itemID, Boolean available, int borrowTenure , Date dateTaken , Date datedue)
    {
        this.itemID = itemID;
        this.available = available;
        this.borrowTenure = borrowTenure;
        this.dateTaken = dateTaken;
        this.datedue = datedue;

    }

    public int getItemID() {
        return itemID;
    }

    public Boolean getAvailable() {
        return available;
    }

    public int getBorrowTenure() {
        return borrowTenure;
    }

    public Date getdatedue() {
        return datedue;
    }

    public Date getDateTaken() {
        return dateTaken;
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

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }
    public void setDatedue(Date datedue) {
        this.datedue = datedue;
    }


}
