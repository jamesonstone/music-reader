package com.company;

import java.util.ArrayList;

/**
 * Created by jamesonstone on 10/4/15.
 */
public class Song {
    String name;
    String artist;
    String album;
    int duration;
    String genre;
    static int numberOfSongs;


    public Song() {
        //static number of songs
        numberOfSongs++;
    }

    /**
     * Print method to print Song to console
     */
    public void printSong(Song songObj) {
        System.out.println(songObj);
    }

    /**
     * Get number of songs
     */
    public int getNumberOfSongs() {
        return this.numberOfSongs;
    }

    /**
     * Set method for song name
     */
    public void setName(String songName) {
        this.name = songName;
    }

    /**
     * Get method for song name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set artist for song
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Get artist for song
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * Set album
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * get album
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * Sets duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Gets duration
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * Sets Genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Get Genre
     */
    public String getGenre() {
        return this.genre;
    }

}
