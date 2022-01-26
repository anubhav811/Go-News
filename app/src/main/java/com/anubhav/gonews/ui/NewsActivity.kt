package com.anubhav.gonews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.anubhav.gonews.NewsRepository.NewsRepository
import com.anubhav.gonews.R
import com.anubhav.gonews.db.ArticleDatabase
import kotlinx.android.synthetic.main.activity_news.*
import androidx.navigation.NavController


class NewsActivity : AppCompatActivity() {
    private  lateinit var  navController : NavController
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)

        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        navController = newsNavHostFragment.getFragment<NavHostFragment>().navController
        setupSmoothBottomMenu()
    }

    private fun setupSmoothBottomMenu(){
        val popupMenu = PopupMenu(this,null)
        popupMenu.inflate(R.menu.bottom_navigation_menu)
        val menu = popupMenu.menu
        bottomNavigationView.setupWithNavController(menu, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}