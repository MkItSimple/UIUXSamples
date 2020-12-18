package com.cho.uiuxsamples.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.adapters.NavAdapter.NavBaseViewHolder
import com.cho.uiuxsamples.data.models.MailItem
import com.cho.uiuxsamples.data.models.NavItem
import com.cho.uiuxsamples.util.Constants
import kotlinx.android.synthetic.main.item_nav_label.view.*
import kotlinx.android.synthetic.main.item_nav_menu.view.*

class NavAdapter : RecyclerView.Adapter<NavBaseViewHolder>() {

    private var items: List<NavItem> = ArrayList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NavBaseViewHolder {
        return when (viewType) {
            Constants.NAV_MENU_TYPE -> MenuViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_nav_menu, parent, false)
            )
            Constants.NAV_TEXT_TYPE -> LabelViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_nav_label, parent, false)
            )
            else -> LabelViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_nav_label, parent, false)
            )
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(navItemList: ArrayList<NavItem>){
        items = navItemList
    }

    override fun onBindViewHolder(holder: NavBaseViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        val type = items[position].type
        Log.d("type", "$type")
        return items[position].type
    }

    abstract class NavBaseViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: NavItem)
    }

    class LabelViewHolder
    constructor(
        itemView: View
    ): NavBaseViewHolder(itemView){

        private val tvTitle = itemView.nav_label

        override fun bind(item: NavItem){
            item.labelItem?.let { labelItem ->
                tvTitle.text = labelItem.label
            }
        }
    }

    @Suppress("DEPRECATION")
    class MenuViewHolder
    constructor(
        itemView: View
    ): NavBaseViewHolder(itemView){

        private val menuTitle = itemView.nav_title
        private val num = itemView.nav_num
        private val icon = itemView.icon
        private val container = itemView.nav_item_container

        override fun bind(item: NavItem){
            item.menuItem?.let { menuItem ->
                menuTitle.text = menuItem.title
                icon.setImageResource( menuItem.icon )
                if (menuItem.numNotification != 0) {
                    num.visibility = View.VISIBLE
                    num.text = menuItem.numNotification.toString()
                }
                if (menuItem.numNotification >99) {
                    num.visibility = View.VISIBLE
                    num.text = "+99"
                }
                else
                    num.visibility = View.GONE

                setSelected(menuItem.isSelected)
            }

        }

        @SuppressLint("UseCompatLoadingForDrawables")
        private fun setSelected(isSelected: Boolean) {
            if (isSelected) {
                container.background = container.context.resources.getDrawable(R.drawable.nav_select_bg);
            } else {
                container.background = ColorDrawable(Color.TRANSPARENT)
            }

        }
    }

}