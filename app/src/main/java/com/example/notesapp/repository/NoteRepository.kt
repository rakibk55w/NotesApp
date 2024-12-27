package com.example.notesapp.repository

import androidx.lifecycle.LiveData
import com.example.notesapp.database.NoteDatabase
import com.example.notesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note){
        return db.getNoteDao().insertNote(note)
    }

    suspend fun updateNote(note: Note){
        return db.getNoteDao().updateNote(note)
    }

    suspend fun deleteNote(note: Note){
        return db.getNoteDao().deleteNote(note)
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return db.getNoteDao().getAllNotes()
    }

    fun searchNote(query: String?): LiveData<List<Note>>{
        return db.getNoteDao().searchNote(query)
    }

}