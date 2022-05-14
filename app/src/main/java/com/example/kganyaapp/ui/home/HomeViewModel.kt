package com.example.kganyaapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kganyaapp.data.model.UserTransactions

class HomeViewModel : ViewModel() {

    private val _arrayPaid = MutableLiveData<ArrayList<UserTransactions>>(arrayListOf())
        .apply {
        value?.add(UserTransactions("paid january"))
        value?.add(UserTransactions("paid feb"))
        value?.add(UserTransactions("paid march "))
    }

    val arrayPaid: LiveData<ArrayList<UserTransactions>> = _arrayPaid

}