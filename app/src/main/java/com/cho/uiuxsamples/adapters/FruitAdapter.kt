package com.cho.uiuxsamples

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cho.uiuxsamples.data.model.FruitItem
import kotlinx.android.synthetic.main.fruit_item.view.*


class FruitAdapter(
    private val interaction: Interaction? = null
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    private var mData: List<FruitItem> = ArrayList()

    fun submitList(fruitItemList: ArrayList<FruitItem>){
        mData = fruitItemList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        return FruitViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent,false),
            interaction,
            mData
        )
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.bind(mData[position])
    }

    class FruitViewHolder(
        itemView: View,
        private val interaction: Interaction?,
        private val mData: List<FruitItem>
    ): RecyclerView.ViewHolder(itemView) {

        fun bind(item: FruitItem) = with(itemView) {
            setOnClickListener {
                interaction?.onItemSelected(adapterPosition, item, itemView)
            }

            itemView.fruit_name.text = item.title
            itemView.fruit_image.setImageResource(item.image)
        }
    }

    interface Interaction {
        fun onItemSelected(
            position: Int,
            item: FruitItem,
            itemView: View
        )
    }
}