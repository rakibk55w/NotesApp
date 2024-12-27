package com.example.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.notesapp.model.Note
import com.example.notesapp.repository.NoteRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class NoteViewModel(private val app: Application, private val noteRepository: NoteRepository): AndroidViewModel(app) {

    fun addNote(note: Note): Job {
        return viewModelScope.launch {
            noteRepository.insertNote(note)
        }
    }

    fun updateNote(note: Note): Job {
        return viewModelScope.launch {
            noteRepository.updateNote(note)
        }
    }

    fun deleteNote(note: Note): Job {
        return viewModelScope.launch {
            noteRepository.deleteNote(note)
        }
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return noteRepository.getAllNotes()
    }

    fun searchNote(query: String?): LiveData<List<Note>> {
        return noteRepository.searchNote(query)
    }
}