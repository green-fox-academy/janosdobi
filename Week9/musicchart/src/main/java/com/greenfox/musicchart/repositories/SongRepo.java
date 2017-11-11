package com.greenfox.musicchart.repositories;

import com.greenfox.musicchart.model.Song;
import com.greenfox.musicchart.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepo extends CrudRepository<Song, Long> {

    @Query(value = "SELECT * FROM song ORDER BY likes DESC LIMIT 5 OFFSET ?1", nativeQuery = true)
    Iterable<Song> listTopLikedSongsByFive(long pageId);

    @Query(value = "SELECT * FROM song LEFT JOIN song_users ON song.id=song_users.song_id WHERE users_id = ?1", nativeQuery = true)
    Iterable<Song> listSongsByUsers(Long userId);
}