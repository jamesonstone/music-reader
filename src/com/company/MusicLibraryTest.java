package com.company;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by jamesonstone on 10/10/15.
 */
public class MusicLibraryTest {

    private Song songItem;
    private MusicLibrary UTMusicLib;
    private ArrayList<Song> songList;

    @org.junit.Before
    public void setUp() throws Exception {
        songList = new ArrayList<Song>();
        UTMusicLib = new MusicLibrary();

        songItem = new Song();
        songItem.setName("name");
        songItem.setArtist("artist");
        songItem.setAlbum("album");
        songItem.setDuration(100);
        songItem.setGenre("genre");

        songList.add(songItem);
    }

    @org.junit.Test
    public void testReadMusicLibrary() throws Exception {
    }

    @org.junit.Test
    public void testGetSong() throws Exception {
        UTMusicLib.readMusicLibrary("music.csv");
        Song testSong = UTMusicLib.getSong("name");
        assertEquals(songItem.getArtist(), testSong.getArtist());
        Song testNullSong = UTMusicLib.getSong("iron and wine");
        assertNull(testNullSong);
    }

    @org.junit.Test
    public void testNumberOfSongs() throws Exception {
        UTMusicLib.readMusicLibrary("music.csv");
        assertEquals(UTMusicLib.numberOfSongs(), 3);
    }
}
