package com.company;

import java.nio.file.Path;

public class Song extends Item {

    int releaseYear;

    public Song(String name, Path path) {
        super(name, path);
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
