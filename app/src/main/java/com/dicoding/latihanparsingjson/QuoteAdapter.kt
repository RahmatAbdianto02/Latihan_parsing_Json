package com.dicoding.latihanparsingjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter untuk menampilkan daftar kutipan di RecyclerView
class QuoteAdapter(private val listReview: ArrayList<String>) : RecyclerView.Adapter<QuoteAdapter.ViewHolder>() {

    // Membuat tampilan baru untuk setiap item dalam RecyclerView
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Menghubungkan layout item_quote dengan ViewHolder
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_quote, viewGroup, false)
        return ViewHolder(view)
    }

    // ViewHolder digunakan untuk menyimpan referensi tampilan agar lebih efisien
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Mengambil TextView dari layout item_quote
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }

    // Mengatur konten untuk tampilan item pada posisi tertentu
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Mengisi TextView dengan kutipan yang sesuai dari list
        viewHolder.tvItem.text = listReview[position]
    }

    // Mengembalikan jumlah item dalam daftar kutipan
    override fun getItemCount(): Int {
        return listReview.size
    }
}
