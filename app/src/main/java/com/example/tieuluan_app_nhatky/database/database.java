package com.example.tieuluan_app_nhatky.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.tieuluan_app_nhatky.NhatKy_Note;
import com.example.tieuluan_app_nhatky.dao.NoteDao;


@Database(entities = NhatKy_Note.class , version = 1, exportSchema = false)
public abstract class database extends RoomDatabase {

    private static database notesDatabase;

    public static synchronized database getNotesDatabase(Context context) {
        if (notesDatabase == null) {
            notesDatabase = Room.databaseBuilder(
                    context,
                    database.class,
                    "notes_db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();
}
