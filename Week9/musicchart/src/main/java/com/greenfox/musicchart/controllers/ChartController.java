package com.greenfox.musicchart.controllers;


import com.greenfox.musicchart.model.Song;
import com.greenfox.musicchart.model.User;
import com.greenfox.musicchart.service.SongService;
import com.greenfox.musicchart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChartController {

    @Autowired
    SongService songs;

    @Autowired
    UserService users;

    //Song related endpoints

    @GetMapping("/chart/songs")
    public Iterable<Song> listAllSongs() {
        return songs.getAllSongs();
    }

    @GetMapping("/chart/songs/page")
    public Iterable<Song> listSongsInPages(@RequestParam(value="pageId", defaultValue = "0") long pageId) {
        return songs.getTopLikedSongsByFive(pageId);
    }

    @GetMapping("/chart/songs/{userName}")
    public Iterable<Song> listSongsByLikers(@PathVariable String userName) {
        return songs.getSongsByUser(userName);
    }

    @PostMapping("/chart/song")
    public ResponseEntity addNewSong(@RequestBody Song song) {
        songs.addSong(song);
        return new ResponseEntity("Song added!", HttpStatus.CREATED);
    }

    @DeleteMapping("/chart/songs/{id}")
    public ResponseEntity deleteSong(@PathVariable Long id) {
        songs.deleteSong(id);
        return new ResponseEntity("Song deleted!", HttpStatus.OK);
    }

    @PutMapping("/chart/songs/{id}")
    public ResponseEntity editTitle(@PathVariable Long id, @RequestParam String title) {
        songs.updateSongTitle(id, title);
        return new ResponseEntity("Song title updated!", HttpStatus.OK);
    }

    //User related endpoints

    @GetMapping("/chart/users")
    public Iterable<User> listAllUsers() {
        return users.getAllUsers();
    }

    @PostMapping("/chart/user")
    public ResponseEntity addNewUser(@RequestBody User user) {
        users.addUser(user);
        return new ResponseEntity("New user created!", HttpStatus.CREATED);
    }

    @DeleteMapping("/chart/users/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        users.deleteUser(id);
        return new ResponseEntity("User deleted!", HttpStatus.OK);
    }

    //User likes song

    @PostMapping("/chart/{userId}/like")
    public ResponseEntity like(@PathVariable("userId") Long userId,
                                   @RequestParam("songId") Long songId) {
        songs.likeSong(userId, songId);
        return new ResponseEntity("Song liked!", HttpStatus.OK);
    }
}