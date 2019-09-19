package com.example.repository

import com.example.network.NetworkImpl

class RepositoryImpl : Repository {
    private val network = NetworkImpl()
    override fun getFromRepository(): String {
        return network.getFromNetwork()
    }
}
