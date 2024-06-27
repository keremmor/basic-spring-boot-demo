package com.springdemo.movierecommedation;

import com.springdemo.movierecommedation.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieConstants {

    public static final String HAPPY = "happy";
    public static final String SAD = "sad";
    public static final String ENERGETIC = "energetic";
    public static final String FEEL_LUCKY = "feel lucky";


    public static final List<Movie> HAPPY_MOVIES = Arrays.asList(
            new Movie("The Pursuit of Happyness", "Drama"),
            new Movie("Forrest Gump", "Drama")
    );

    public static final List<Movie> SAD_MOVIES = Arrays.asList(
            new Movie("The Shawshank Redemption", "Drama"),
            new Movie("Schindler's List", "Biography/Drama")
    );

    public static final List<Movie> ENERGETIC_MOVIES = Arrays.asList(
            new Movie("Mad Max: Fury Road", "Action"),
            new Movie("The Dark Knight", "Action")
    );

    public static final List<Movie> EDITOR_PICKS_MOVIES = Arrays.asList(
            new Movie("Inside Out", "Animation"),
            new Movie("Inception", "Sci-Fi")
    );}
