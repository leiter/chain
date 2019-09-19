package com.example.library

import com.example.repository.RepositoryImpl

class LibraryImpl : Library {
    private val repository = RepositoryImpl()
    override fun getFromLibrary(): String {
        return repository.getFromRepository()
    }
}
