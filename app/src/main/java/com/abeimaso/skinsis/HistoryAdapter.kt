package com.abeimaso.skinsis

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter (val context: Context, val items : ArrayList<String>)
    : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val llHistoryMainItem = view.findViewById<LinearLayout>(R.id.llHistoryItemMain)
        val tvItem = view.findViewById<TextView>(R.id.tvItem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.item_history_row, parent, false
        ))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val disease = items.get(position)
        holder.tvItem.text = disease
        if (position % 2 == 0) {
            holder.llHistoryMainItem.setBackgroundColor(Color.parseColor("#EBEBEB"))
        } else {
            holder.llHistoryMainItem.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
}