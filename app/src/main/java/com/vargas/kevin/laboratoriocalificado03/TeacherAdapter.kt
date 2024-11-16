package com.vargas.kevin.laboratoriocalificado03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TeacherAdapter(private val context: Context, private val teacherList: List<Teacher>) :
    RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder?>() {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_teacher, parent, false)
        return TeacherViewHolder(view)
    }

    fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val teacher = teacherList[position]

        holder.teacherNameTextView.text = teacher.name + " " + teacher.lastName
        holder.teacherPhoneTextView.text = teacher.phone
        holder.teacherEmailTextView.text = teacher.email

        Glide.with(context)
            .load(teacher.imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .into(holder.teacherImageView)
    }

    val itemCount: Int
        get() = teacherList.size

    class TeacherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var teacherImageView: ImageView = itemView.findViewById(R.id.teacherImageView)
        var teacherNameTextView: TextView = itemView.findViewById(R.id.teacherNameTextView)
        var teacherPhoneTextView: TextView = itemView.findViewById(R.id.teacherPhoneTextView)
        var teacherEmailTextView: TextView = itemView.findViewById(R.id.teacherEmailTextView)
    }
}