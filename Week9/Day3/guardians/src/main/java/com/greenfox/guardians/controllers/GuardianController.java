package com.greenfox.guardians.controllers;

import com.greenfox.guardians.model.*;
import com.greenfox.guardians.service.GuardianService;
import com.greenfox.guardians.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

    @ExceptionHandler(ArithmeticException.class)
    public GuardianError divideByZero() {
        return new GuardianError("Time cannot be zero!");
    }

    @GetMapping("/groot")
    public Object groot(@RequestParam(value = "message", required = false, defaultValue = "") String message) {
        if (!message.equals("")) {
            return new Groot(message);
        } else {
            return new GuardianError("I am Groot!");
        }
    }

    @GetMapping("/yondu")
    public Yondu yondu(@RequestParam("distance") long distance, @RequestParam("time") long time) {
        return new Yondu(distance, time);
    }

    @GetMapping("/rocket")
    public Ship shipsCargo() {
        return new Ship();
    }

    @GetMapping("/rocket/fill")
    public Cargo fill(@RequestParam("caliber") String caliber, @RequestParam("amount") Integer amount) {
        return new Cargo(caliber, amount);
    }

    //Awesome mix Song related endpoints (CRUD)

    @Autowired
    SongService songs;

    @Autowired
    GuardianService guardians;

    @GetMapping("/awesome/songs")
    public Iterable<Song> listAllSongs(@RequestParam(value = "limit", required = false) int limit,
                                       @RequestParam(value = "guardian", required = false) String guardianName) {
        return songs.getAllSongs();
    }


    @PostMapping("/awesome/song")
    public ResponseEntity addNewSong(@RequestBody Song song) {
        songs.addNewSong(song);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/awesome/songs/{id}")
    public ResponseEntity deleteSong(@PathVariable Long id) {
        songs.deleteSong(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/awesome/songs/{id}")
    public ResponseEntity editRating(@PathVariable Long id, @RequestParam Integer rating) {
        songs.updateSongRating(id, rating);
        return new ResponseEntity(HttpStatus.OK);
    }

    //Awesome mix Guardian related endpoints

    @GetMapping("/awesome/guardians")
    public Iterable<Guardian> listAllGuardians() {
        return guardians.getAllGuardians();
    }

    @PostMapping("/awesome/guardian")
    public ResponseEntity addNewGuardian(@RequestBody Guardian guardian) {
        guardians.addNewGuardian(guardian);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/awesome/guardians/{id}")
    public ResponseEntity deleteGuardian(@PathVariable Long id) {
        guardians.deleteGuardian(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}