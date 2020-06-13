package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.hamro.newsapp.R
import com.hamro.newsapp.ui.NewsMainActivity
import com.hamro.newsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsMainActivity).viewModel
    }
}