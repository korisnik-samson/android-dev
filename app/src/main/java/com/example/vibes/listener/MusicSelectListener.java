package com.example.vibes.listener;

import com.example.vibes.model.Music;

import java.util.List;

public interface MusicSelectListener {
    void playQueue(List<Music> musicList, boolean shuffle);

    void addToQueue(List<Music> musicList);

    void refreshMediaLibrary();
}