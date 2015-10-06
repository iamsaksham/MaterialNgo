package com.example.android.materialngo;

import android.content.Context;

/**
 * Created by Saksham on 10/6/2015.
 */
public class Place {

    public String name;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }

}
