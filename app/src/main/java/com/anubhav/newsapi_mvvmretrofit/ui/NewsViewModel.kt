package com.anubhav.newsapi_mvvmretrofit.ui

import androidx.lifecycle.ViewModel
import com.anubhav.newsapi_mvvmretrofit.NewsRepository.NewsRepository

class NewsViewModel (
    val repository : NewsRepository
    ): ViewModel(){
}