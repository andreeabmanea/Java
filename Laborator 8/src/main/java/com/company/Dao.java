package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {


    public int addMovie(Movie movie) throws SQLException {
        Connection conn = Database.getConnection();
        String query = "INSERT INTO movies (id, title, release_date, duration, score)"+" VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1, movie.getId());
        ps.setString(2, movie.getTitle());
        ps.setDate(3, movie.getRelease_date());
        ps.setInt(4, movie.getDuration());
        ps.setDouble(5, movie.getScore());
        ps.executeUpdate("use bd;");
        return ps.executeUpdate();
    }
}
