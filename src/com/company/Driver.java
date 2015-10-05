package com.company;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        String filename;
        // create the new music library
        MusicLibrary musicLib = new MusicLibrary();
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! Please enter the music Library Filename");
        //TODO: need to change this to validate input and .txt
        filename = in.next() + ".csv";
        System.out.println(filename);

        musicLib.readMusicLibrary(filename);


    }
}
