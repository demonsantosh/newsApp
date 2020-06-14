package com.hamro.newsapp.response

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)