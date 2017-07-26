package com.company;

import java.util.Date;

/**
 * Created by Administrator on 21/07/2017.
 */
public interface Takeable
{

    default public void takeItemOut()
    {

    }

    default public void putItemBack()
    {

    }

    default public boolean checkItemsAvailabiality(int itemID) ///change UML to reflect this
    {


        return false;
    }

    //default public void setDateTaken(Date dateTaken) {

   // }

    default public Date setDatedue(Date dateTaken, int borrowTenure) ///change UML to reflect this
    {

        return null;
    }
}
