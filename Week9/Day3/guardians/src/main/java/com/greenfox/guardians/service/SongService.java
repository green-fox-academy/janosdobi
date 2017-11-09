package com.greenfox.guardians.service;

import com.greenfox.guardians.model.Song;
import com.greenfox.guardians.repositories.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepo songRepo;

    public void addNewSong(Song s) {
        songRepo.save(s);
    }

    public Iterable<Song> getAllSongs() {
        return songRepo.findAll();
    }

    public void deleteSong(Long id) {
        songRepo.delete(id);
    }

    public void updateSongRating(Long id, int rating) {
        Song s = songRepo.findOne(id);
        s.setRating(rating);
        songRepo.save(s);
    }

    public Iterable<Song> getFiveTopRatedSongs() {
        return songRepo.listFiveTopRatedSongs();
    }

    public Iterable<Song> getSongsByGuardian(String name) {
        return songRepo.listSongsByGuardian(name);
    }
}