package com.hamro.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.hamro.newsapp.R
import kotlinx.android.synthetic.main.news_activity_main_layout.*

class NewsMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_activity_main_layout)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}