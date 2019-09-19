package com.example.persistence

class PersistenceImpl : Persistence {
    override fun getFromPersistence(): String {
        return "I am coming from persistence!"
    }
}
