package com.example.network

import com.example.persistence.PersistenceImpl

class NetworkImpl : Network {
    private val persistence = PersistenceImpl()
    override fun getFromNetwork(): String {
        return persistence.getFromPersistence()
    }
}
