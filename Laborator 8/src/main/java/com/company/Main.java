package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        //how we can add movies into the database
       /* Movie movie = new Movie("Avengers: Endgame",  Date.valueOf("2019-04-29"), 3, 8.4);
        DaoMovie newMovie = new DaoMovie();
        newMovie.addMovie(movie);
        Movie movie2 = new Movie("Me Before You", Date.valueOf("2016-05-23"), 2, 7.4);
        newMovie.addMovie(movie2);

        //we can find a movie by its id in the database
        Movie m = newMovie.getMovie(1);
        System.out.println(m);

        //we add a new genre in the database
        Genre genre = new Genre("Romance");
        DaoGenre newGenre = new DaoGenre();
        newGenre.addGenre(genre);
        */

        //how we add an actor in the database
      /*  Actor actor = new Actor("Tom Hiddleston", "Loki", "UK");
        DaoActor newActor = new DaoActor();
        newActor.addActor(actor);
*/
        DaoMovie movieInfo = new DaoMovie();
        List<String> cast = movieInfo.getCast("Avengers: Endgame");
        System.out.println(cast);

        List<String> screenplay = movieInfo.getScreeplay("Me Before You");
        System.out.println(screenplay);
    }
}
