package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

Movie movie = new Movie(1, "Avengers: Endgame",  Date.valueOf("2019-04-29"), 3, 8.4);
Dao newMovie = new Dao();
newMovie.addMovie(movie);
    }
}
