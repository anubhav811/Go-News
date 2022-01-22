package com.anubhav.newsapi_mvvmretrofit.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.anubhav.newsapi_mvvmretrofit.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = REPLACE)
    suspend fun upsert(article: Article) :Long                // upsert = update or insert


    @Query("SELECT * FROM articles")
    fun getAllArticles():LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}