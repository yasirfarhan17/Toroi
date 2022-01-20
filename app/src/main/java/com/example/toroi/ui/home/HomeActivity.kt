package com.example.toroi.ui.home

import android.os.Bundle
import com.example.network_domain.network.model.DataItem
import com.example.toroi.R
import com.example.toroi.databinding.ActivityHomeBinding
import com.example.toroi.injection.component.AppComponent
import com.example.toroi.ui.base.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {

    override fun layoutId(): Int = R.layout.activity_home
    private var item: DataItem? = null

    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
        initUi()
        addListeners()
        addObservers()
    }

    private fun getData() {
        if (intent.getParcelableExtra<DataItem>("ITEM") != null) {
            item = intent.getParcelableExtra<DataItem>("ITEM")
        }
    }

    override fun injectActivity(appComponent: AppComponent) {
        appComponent.homeComponent()
            .create()
            .inject(this)
    }

    private fun initUi() {
        with(binding) {
            //set data from item to view
        }
    }

    private fun addListeners() {
    }

    override fun addObservers() {
        observeAccountBalance()
    }

    private fun observeAccountBalance() {
    }
}