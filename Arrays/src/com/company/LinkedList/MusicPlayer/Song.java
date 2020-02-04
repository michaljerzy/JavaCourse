package com.company.LinkedList.MusicPlayer;

import java.util.LinkedList;

public class Song {
    private String Title;
    private double Duration;

    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public double getDuration() {
        return Duration;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDuration(double duration) {
        Duration = duration;
    }

    @Override
    public String toString() {
        return this.Title + ": " + this.Duration;
    }
}
