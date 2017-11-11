package com.greenfox.musicchart.service;

import com.greenfox.musicchart.model.Song;
import com.greenfox.musicchart.model.User;
import com.greenfox.musicchart.repositories.SongRepo;
import com.greenfox.musicchart.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepo songRepo;

    @Autowired
    UserRepo userRepo;

    public void addSong(Song s) {
        songRepo.save(s);
    }

    public Iterable<Song> getAllSongs() {
        return songRepo.findAll();
    }

    public void deleteSong(Long id) {
        songRepo.delete(id);
    }

    public void updateSongTitle(Long id, String title) {
        Song song = songRepo.findOne(id);
        song.setTitle(title);
        songRepo.save(song);
    }

    public void likeSong(Long userId, Long songId) {
        Song likedSong = songRepo.findOne(songId);
        if (!likedSong.getUsers().contains(userRepo.findOne(userId))) {
            likedSong.addLike(userRepo.findOne(userId));
        }
        songRepo.save(likedSong);
    }

    public Song getSong(Long id) {
        return songRepo.findOne(id);
    }

    public Iterable<Song> getTopLikedSongsByFive(Long pageId) {
        return songRepo.listTopLikedSongsByFive(pageId * 5);
    }

    public Iterable<Song> getSongsByUser(String userName) {
        User user = new User();
        for (User u: userRepo.findAll()) {
            if (u.getName().equals(userName)) {
                user = u;
            }
        }
        return songRepo.listSongsByUsers(user.getId());
    }
}