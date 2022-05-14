package com.example.kganyaapp.data.model.newUser.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kganyaapp.R
import com.example.kganyaapp.databinding.MainFragmentBinding

class NewUserFragment : Fragment() {

    companion object {
        fun newInstance() = NewUserFragment()
    }
   // private lateinit var binding: MainFragmentBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       // val button2 = binding.button2
        /*
        button2.setOnClickListener{
            Toast.makeText( this.context,"you clicked me", Toast.LENGTH_SHORT).show()
        }*/

        return inflater.inflate(R.layout.main_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}