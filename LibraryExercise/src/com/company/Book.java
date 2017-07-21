package com.company;

import java.util.Date;

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