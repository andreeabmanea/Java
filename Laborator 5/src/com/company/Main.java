package com.company;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Catalog myCatalog = new Catalog("Andreea's Catalog");

        Image picture = new Image("Diagram", Paths.get("C:\\Users\\andre\\Desktop\\Class Diagram.png"));

        Song song = new Song("Snowman", Paths.get("C:\\Users\\andre\\Downloads\\Sia - Snowman (Lyrics).mp3"));

        myCatalog.add(picture);
	    myCatalog.add(song);
	    myCatalog.list();
        myCatalog.save(myCatalog);

    }
}
