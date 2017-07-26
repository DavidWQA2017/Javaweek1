package com.company;

import java.util.Date;

public class Book extends Item implements Takeable
{
    String bookTitle;
    String bookAuthor;
    Date publishedDate;
    int numberOfPages;

    public Book( int itemID,boolean available, int borrowTenure ,Date dateTaken ,Date datedue,String bookTitle, String bookAuthor, Date publishedDate, int numberOfPages)
    {
        super(itemID, available, borrowTenure ,dateTaken , datedue);

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishedDate = publishedDate;
        this.numberOfPages = numberOfPages;

    }

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