package com.springdemo.movierecommedation.controller;

import com.springdemo.movierecommedation.MovieConstants;
import com.springdemo.movierecommedation.model.Movie;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @PostMapping("/recommend")
    public List<Movie> recommendMovies(@RequestBody String mood) {
        List<Movie> recommendations = new ArrayList<>();

        switch (mood.toLowerCase()) {
            case "happy":
                return MovieConstants.HAPPY_MOVIES;
            case "sad":
                return MovieConstants.SAD_MOVIES;
            case "energetic":
                return MovieConstants.ENERGETIC_MOVIES;
            default:
                return MovieConstants.EDITOR_PICKS_MOVIES;
        }
    }
}
