package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jamesonstone on 10/4/15.
 */
public class MusicLibrary {

    public MusicLibrary() {
    }

    /**
     * Read in the music library from file
     * @param fileName name of file to read from
     * @return a list of song
     */
    public Song readMusicLibrary(String fileName) {
        ArrayList<Song> songList = new ArrayList<Song>();
        String line;
        BufferedReader fileReader = null;

        //read in the file
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Please specify a valid file csv");
        }

        /**
         * csv will go in the following order:
         * name, artist, album, duration, genre
         * parse and load into object in that order
         */
        try {
            while ((line = fileReader.readLine()) != null) {
                String [] songInfo = line.split(",");
                Song songItem = new Song();
                System.out.println("_____");

                System.out.println(songInfo[0].trim());
                songItem.setName(songInfo[0].trim());

                System.out.println(songInfo[1].trim());
                songItem.setArtist(songInfo[1]);

                System.out.println(songInfo[2].trim());
                songItem.setAlbum((songInfo[2].trim()));

                System.out.println(songInfo[3].trim());
                songItem.setDuration(Integer.parseInt(songInfo[3]));

                System.out.println(songInfo[4].trim());
                songItem.setGenre(songInfo[4].trim());

            }
        } catch (IOException e) {
            System.out.println("something went wrong trying to get data out");
        }

        return null;
    }

    /**
     * Gets a song from the song array
     * @param songName the name of the song
     * @return the song object or null
     */
    public Song getSong(Song songName) {
        return null;
    }
}
