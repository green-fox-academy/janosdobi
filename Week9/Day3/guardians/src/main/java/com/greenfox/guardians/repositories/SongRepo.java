package com.greenfox.guardians.repositories;

import com.greenfox.guardians.model.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SongRepo extends CrudRepository<Song, Long> {

    @Query(value = "SELECT * FROM song ORDER BY rating LIMIT 5 OFFSET ?1", nativeQuery = true)
    Iterable<Song> listFiveTopRatedSongs();

    @Query(value = "SELECT song.id, song.author, song.title, song.genre, song.year, song.rating" +
            "FROM song INNER JOIN guardian WHERE guardian.name = ?1", nativeQuery = true)
    Iterable<Song> listSongsByGuardian(String name);
}