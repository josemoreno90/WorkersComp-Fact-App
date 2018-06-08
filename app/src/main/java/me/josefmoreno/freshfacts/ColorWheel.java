package me.josefmoreno.freshfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // Fields or Member Variables - Properties about the object
    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#7d669e", // purple
            "#51b46d", // green
            "#53bbb4" // aqua
    };

    // Methods - Actions the object can take
    public int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}