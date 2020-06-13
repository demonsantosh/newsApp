package com.hamro.newsapp.repository

import com.hamro.newsapp.api.RetrofitInstance
import com.hamro.newsapp.db.ArticleDatabase

class NewsRepository (
    val db: ArticleDatabase){
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}