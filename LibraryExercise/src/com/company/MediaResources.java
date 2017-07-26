package com.company;

import java.util.Date;

public class MediaResources extends Item implements Takeable
{


        String object;
        public MediaResources(int itemID, Boolean available, int borrowTenure, Date dateTaken , Date datedue, String object)
        {
            super(itemID, available, borrowTenure ,dateTaken , datedue);
            this.object = object;
        }

        public String getObject() {
        return object;
        }
        public void setObject(String object) {
        this.object = object;
        }
}