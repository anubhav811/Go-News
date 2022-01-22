package com.anubhav.newsapi_mvvmretrofit.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
    
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
    }
}