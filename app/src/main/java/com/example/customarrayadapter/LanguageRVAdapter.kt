package com.example.customarrayadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageRVAdapter(private val languageList: ArrayList<Pair<String, Int>>) :
    RecyclerView.Adapter<LanguageRVAdapter.LanguageViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LanguageRVAdapter.LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.language_rv_item, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageRVAdapter.LanguageViewHolder, position: Int) {
        holder.languageTV.setText(languageList.get(position).first)
        holder.languageIV.setImageResource(languageList.get(position).second)
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    class LanguageViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val languageIV: ImageView = itemView.findViewById(R.id.idIVLanguage)
        val languageTV: TextView = itemView.findViewById(R.id.idTVLanguage)
    }

}