package com.example.toroi.ui.home

import android.os.Bundle
import com.example.toroi.R
import com.example.toroi.databinding.ActivityHomeBinding
import com.example.toroi.injection.component.AppComponent
import com.example.toroi.ui.base.BaseActivity
import com.glocal.centerpatient.ui.home.model.HomeCards

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {

    override fun layoutId(): Int = R.layout.activity_home
    private var homeList = ArrayList<HomeCards>()

    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUi()
        addListeners()
        addObservers()
    }

    override fun injectActivity(appComponent: AppComponent) {
        appComponent.homeComponent()
            .create()
            .inject(this)
    }

    private fun initUi() {
    }

    private fun addListeners() {
    }

    override fun addObservers() {
        observeAccountBalance()
    }

    private fun observeAccountBalance() {
    }
}