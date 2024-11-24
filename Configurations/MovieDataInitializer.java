package com.acmeplex.movieticketreservation.Configurations;

import com.acmeplex.movieticketreservation.Model.Movie;
import com.acmeplex.movieticketreservation.Repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MovieDataInitializer {
    @Bean
    public CommandLineRunner loadMovies(MovieRepository movieRepository) {
        return args -> {
            // Check if movies are already present
            if (movieRepository.count() > 0) {
                System.out.println("Movies already exist. Skipping data initialization.");
                return;
            }

            List<Movie> movies = Arrays.asList(
                    new Movie("The Marvels", "Action", 4, "125 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("Killers of the Flower Moon", "Drama", 5, "206 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("The Hunger Games: The Ballad of Songbirds and Snakes", "Sci-Fi", 4, "157 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("Wish", "Animation", 4, "112 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("The Holdovers", "Drama", 5, "133 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("Napoleon", "Historical", 4, "158 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("Five Nights at Freddy's", "Horror", 3, "110 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("The Marvelous Elephant", "Adventure", 5, "128 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("Trolls Band Together", "Animation", 3, "90 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg"),
                    new Movie("The Equalizer 3", "Action", 4, "109 min", "https://mediafiles.cineplex.com/Central/Film/Posters/25170_320_470.jpg")
            );
            movieRepository.saveAll(movies);
            System.out.println("Movies have been initialized in the database!");
        };
    }
}
