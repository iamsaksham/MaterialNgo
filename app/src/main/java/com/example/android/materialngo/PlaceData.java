package com.example.android.materialngo;

import java.util.ArrayList;

/**
 * Created by Saksham on 10/6/2015.
 */
public class PlaceData {

    public static String[] placeNameArray = {"Smile Ngo", "Sakshi Ngo", "Aarohan","Deepalaya", "Manzil", "Uday Ngo", "Lakshyam", "Torch", "Sapna", "Rahi Ngo"};

    public static ArrayList<Place> placeList() {
        ArrayList<Place> list = new ArrayList<>();
        for (int i = 0; i < placeNameArray.length; i++) {
            Place place = new Place();
            place.name = placeNameArray[i];
            place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
            if (i == 2 || i == 5) {
                place.isFav = true;
            }
            list.add(place);
        }
        return (list);
    }

}
