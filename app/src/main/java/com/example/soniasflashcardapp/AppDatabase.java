package com.example.soniasflashcardapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.example.soniasflashcardapp.Flashcard.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.example.soniasflashcardapp.FlashcardDao flashcardDao();
}
