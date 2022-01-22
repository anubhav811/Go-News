package com.anubhav.newsapi_mvvmretrofit.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.anubhav.newsapi_mvvmretrofit.R
import com.anubhav.newsapi_mvvmretrofit.ui.NewsActivity
import com.anubhav.newsapi_mvvmretrofit.ui.NewsViewModel

class SavedNewsFragment : Fragment(R.layout.fragment_saved_news){
    lateinit var viewModel:NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}