package com.company;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        boolean isDone = false;
        String filename;
        // create the new music library
        MusicLibrary musicLib = new MusicLibrary();
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! Please enter the music Library Filename");
        //TODO: need to change this to validate input and .txt
        filename = in.next() + ".csv";

        //read the file in
        musicLib.readMusicLibrary(filename);

        while (isDone == false) {
            System.out.println("Enter song to get its information or 'q' to quit.");
            String songName = in.next();
            songName.trim();
            //check if the user wants to quit
            if (songName.equals("q")) {
                break;
            }

            Song songItem = musicLib.getSong(songName);
            if (songItem == null) {
                System.out.println("I'm sorry. We don't have that artist's information");
            } else {
                System.out.println(songItem.getName());
                System.out.println(songItem.getArtist());
                System.out.println(songItem.getAlbum());
                System.out.println(songItem.getDuration());
                System.out.println(songItem.getGenre());
            }

        }
    }
}
