package com.example.multimodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.LibraryImpl

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val library = LibraryImpl()
        println(library.getFromLibrary())
    }
}
