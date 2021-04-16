package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoActor {
    Connection conn = Database.getConnection();

    public int addActor(Actor actor) throws SQLException {

        String query = "INSERT INTO actors (actor_name, character_name, country)"+" VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, actor.getStageName());
        ps.setString(2, actor.getCharacterName());
        ps.setString(3, actor.getCountry());
        ps.executeUpdate("use bd;");
        return ps.executeUpdate();
    }
}
