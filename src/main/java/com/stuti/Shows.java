package com.stuti;

import java.time.LocalDate;
import java.time.LocalTime;

public class Shows {
    private Long showId ;
    private LocalDate date ;
    private LocalTime start_time ;
    private LocalTime end_time ;
    private Movies movies;
    private Theatres theatres;
    private Location location;

    public Shows() {
    }

    public Shows(Long showId, LocalDate date, LocalTime start_time, LocalTime end_time, Movies movies, Theatres theatres) {
        this.showId = showId;
        this.date = date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.movies = movies;
        this.theatres = theatres;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public Theatres getTheatres() {
        return theatres;
    }

    public void setTheatres(Theatres theatres) {
        this.theatres = theatres;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
