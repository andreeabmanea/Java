package com.company.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {
    @Id
    @Column(name = "id", unique = true)
    int id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "release_date", nullable = false)
    Date release_date;

    @Column(name = "duration", nullable = true)
    int duration;

    @Column(name = "score", nullable = true)
    double score;

    public Movie(){}

    public Movie(String title, Date release_date, int duration, double score) {
        this.title = title;
        this.release_date = release_date;
        this.duration = duration;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", release_date=" + release_date +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }
}
