package com.company;

import java.util.Date;

/**
 * Created by Administrator on 21/07/2017.
 */
public class Map extends Item implements Takeable
{
    String cartographer;
    String mapArea;

    public Map (int itemID, Boolean available, int borrowTenure , Date dateTaken , Date datedue, String cartographer, String mapArea)
    {
        super(itemID, available, borrowTenure ,dateTaken , datedue);
        this.cartographer = cartographer;
        this.mapArea = mapArea;
    }

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
