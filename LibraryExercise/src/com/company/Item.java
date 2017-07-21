package com.company;

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
