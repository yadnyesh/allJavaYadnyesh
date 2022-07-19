package io.yadnyesh.yt.b2tech.junit;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {

    @Test
    public void moviesEmptyWhenNoMoviesAdded() {
        //Arrange --> setup data
        // Act --> call the method
        // Assert --> evaluate the condition

        Movies movies = new Movies();
        List<String> list = movies.getMovies();
        assertTrue(list.isEmpty(), "Movies should be empty");

    }
}