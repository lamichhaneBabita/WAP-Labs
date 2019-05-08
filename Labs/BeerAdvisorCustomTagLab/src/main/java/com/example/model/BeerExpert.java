package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List getBrands(String color) {
        List brands = new ArrayList();
        if(color.equals("amber")) {
            brands.add("Kack amber");
            brands.add("Red Hosoe");
        }

        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}