package com.example.customarrayadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(context: Context, private val languageList: ArrayList<Pair<String, Int>>) :
    ArrayAdapter<Pair<String, Int>>(context, 0, languageList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        convertView =
            LayoutInflater.from(context).inflate(R.layout.language_list_view_item, parent, false)
        val lngIV: ImageView = convertView.findViewById(R.id.idIVLanguage)
        val lngTV: TextView = convertView.findViewById(R.id.idTVLanguage)

        lngIV.setImageResource(languageList.get(position).second)
        lngTV.setText(languageList.get(position).first)

        return convertView
    }
}