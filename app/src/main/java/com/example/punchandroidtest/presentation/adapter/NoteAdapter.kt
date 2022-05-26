package com.example.punchandroidtest.presentation.adapter

import android.content.ClipData
import android.content.ClipDescription
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.punchandroidtest.data.model.Note
import com.example.punchandroidtest.databinding.NoteLayoutAdapterBinding
import java.util.*

class NoteAdapter(private val onItemClick: (Note) -> Unit) :
    ListAdapter<Note, NoteAdapter.NoteViewHolder>(DiffCallback) {

    class NoteViewHolder(
        val itemBinding: NoteLayoutAdapterBinding,
        private val onItemClick: (Note) -> Unit
    ) :
        RecyclerView.ViewHolder(itemBinding.root) {
        @RequiresApi(Build.VERSION_CODES.N)
        fun bind(note: Note) {
            itemBinding.apply {

                tvNoteTitle.text = note.noteTitle
                tvNoteBody.text = note.noteBody

                val random = Random()
                val color =
                    Color.argb(
                        255, random.nextInt(256),
                        random.nextInt(256), random.nextInt(256)
                    )
                ibColor.setBackgroundColor(color)
                noteLayout.setOnClickListener {
                    onItemClick.invoke(note)
                }

                // Setup drag and drop function
                noteLayout.setOnLongClickListener {
                    val clipData = note.id.toString()
                    val item = ClipData.Item(clipData)
                    val mimeType = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)

                    val data = ClipData(clipData, mimeType, item)

                    val dragShadowBuilder = View.DragShadowBuilder(it)
                    it.startDragAndDrop(data, dragShadowBuilder, it, 0)

                    true
                }
            }
        }
    }

    private val differCallback =
        object : DiffUtil.ItemCallback<Note>() {
            override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
                return oldItem.id == newItem.id &&
                        oldItem.noteBody == newItem.noteBody &&
                        oldItem.noteTitle == newItem.noteTitle
            }

            override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
                return oldItem == newItem
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding = NoteLayoutAdapterBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NoteViewHolder(binding, onItemClick)

    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object DiffCallback : DiffUtil.ItemCallback<Note>() {
        override fun areItemsTheSame(
            oldItem: Note,
            newItem: Note
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Note,
            newItem: Note
        ): Boolean {
            return oldItem == newItem
        }
    }
}