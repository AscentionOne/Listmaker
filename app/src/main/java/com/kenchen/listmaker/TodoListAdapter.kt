package com.kenchen.listmaker

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter :RecyclerView.Adapter<TodoListViewHolder>() {
    private var todoList = arrayListOf<String>("Android Development", "House Work", "Errands")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}
