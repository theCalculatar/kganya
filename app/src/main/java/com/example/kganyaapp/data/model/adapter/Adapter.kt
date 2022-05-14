package com.example.kganyaapp.data.model.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kganyaapp.R
import com.example.kganyaapp.data.model.UserTransactions


class Adapter(val users: ArrayList<UserTransactions>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_of_transaction,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder:  Adapter.ViewHolder, position: Int) {

        holder.bindItems(users[position])
    }

    override fun getItemCount(): Int {

        return users.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems (user:UserTransactions){
            val transElement = itemView.findViewById(R.id.transact) as TextView
            transElement.text = user._transaction
        }
    }
}