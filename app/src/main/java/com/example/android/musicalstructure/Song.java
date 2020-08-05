package com.example.android.musicalstructure;

public class Song {
    private String mSongName;

    private String mArtistName;

    private int mAudioResourceId;


    public Song(String songName, String artistName, int audioResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mAudioResourceId = audioResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
