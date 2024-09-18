package com.musicapp;  

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    
    public Album() {
    }

    
    public Song findSong(String title) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            // System.out.println(title + " successfully added to the list");
            return true;
        } else {
            // System.out.println("Song with name " + title + " already exists in the list");
            return false;
        }
    }

    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        // Updated index validation
        if (index >= 0 && index < this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        } else {
            // System.out.println("This album does not have a song with trackNumber " + trackNumber);
            return false;
        }
    }

    
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        } else {
            // System.out.println(title + " does not exist in this album");
            return false;
        }
    }
}
