package com.cho.uiuxsamples.portfolio.cv

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cho.uiuxsamples.data.models.MailItem


class CVAdapter : RecyclerView.Adapter<CVAdapter.CVViewHolder>() {

    private var mData: List<CVItem> = ArrayList()

    fun submitList(cvItemList: ArrayList<CVItem>){
        mData = cvItemList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CVViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CVViewHolder, position: Int) {
        //
    }

    class CVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}