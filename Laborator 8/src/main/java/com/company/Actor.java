package com.company;

public class Actor {
    String stageName;
    String country;
    String characterName;

    public Actor() {
    }

    public Actor(String stageName, String characterName, String country) {
        this.stageName = stageName;
        this.country = country;
        this.characterName = characterName;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
