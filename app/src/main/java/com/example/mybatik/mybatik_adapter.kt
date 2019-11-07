package com.example.mybatik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class mybatik_adapter(val listmybatik: ArrayList<mybatik>) : RecyclerView.Adapter<mybatik_adapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_mybatik, viewGroup, false)
        return ListViewHolder(view)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mybatik = listmybatik[position]
        Glide.with(holder.itemView.context)
            .load(mybatik.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = mybatik.title
        holder.tvDetail.text = mybatik.description
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listmybatik[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listmybatik.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_title)
        var tvDetail: TextView = itemView.findViewById(R.id.item_description)
        var imgPhoto: ImageView = itemView.findViewById(R.id.item_gambar)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: mybatik)
    }


}