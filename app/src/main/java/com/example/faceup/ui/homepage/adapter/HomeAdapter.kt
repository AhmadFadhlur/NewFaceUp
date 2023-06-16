package com.example.faceup.ui.homepage.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.faceup.R
import com.example.faceup.utils.Article


class HomeAdapter(private val listArticle: ArrayList<Article>) : RecyclerView.Adapter<HomeAdapter.ListViewHolder>(){
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tittle : TextView = itemView.findViewById(R.id.tv_TittleJerawat)
        var photoArticle : ImageView = itemView.findViewById(R.id.img_article)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_article, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var context = holder.itemView.context
        val dataArtikel = listArticle[position]

        holder.photoArticle.setImageResource(listArticle[position].photo)
        holder.tittle.text = listArticle[position].tittle


        val dataArticle = Article(dataArtikel.tittle, dataArtikel.description, dataArtikel.photo)
        val bundle = Bundle()
        bundle.putParcelable("data", dataArticle)

        holder.itemView.setOnClickListener(){
            val navController = findNavController(holder.itemView)
            navController.navigate(R.id.action_homePage_to_detailArticleFragment, bundle)
        }
    }

    override fun getItemCount(): Int = listArticle.size
}