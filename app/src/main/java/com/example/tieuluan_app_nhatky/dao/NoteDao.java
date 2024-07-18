package com.example.tieuluan_app_nhatky.dao;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.tieuluan_app_nhatky.NhatKy_Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<NhatKy_Note> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(NhatKy_Note note);

    @Delete
    void deleteNote(NhatKy_Note note);
}
