package com.musicapp;  

public class Song {
    private String title;
    private double duration;

    // Constructor with validation
    public Song(String title, double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration must be positive.");
        }
        this.title = title;
        this.duration = duration;
    }

    // Default constructor
    public Song() {
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    // Optional: Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration must be positive.");
        }
        this.duration = duration;
    }

    // toString method
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
