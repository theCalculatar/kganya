package com.example.kganyaapp.data.model.newUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kganyaapp.R
import com.example.kganyaapp.data.model.newUser.ui.main.NewUserFragment
import com.example.kganyaapp.databinding.ActivityLoginBinding
import com.example.kganyaapp.databinding.MainFragmentBinding

class NewUserActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_user_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NewUserFragment.newInstance())
                .commitNow()
        }
    }
}