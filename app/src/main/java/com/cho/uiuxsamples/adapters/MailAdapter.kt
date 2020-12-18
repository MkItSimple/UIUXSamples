package com.cho.uiuxsamples.adapters

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.data.models.MailItem
import com.cho.uiuxsamples.util.Constants.MAIL_CATEGORY_TYPE
import com.cho.uiuxsamples.util.Constants.MAIL_ITEM_TYPE
import kotlinx.android.synthetic.main.item_category.view.*
import kotlinx.android.synthetic.main.item_mail.view.*

class MailAdapter : RecyclerView.Adapter<MailAdapter.MailBaseViewHolder>() {

    private var items: List<MailItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailBaseViewHolder {
        return when (viewType) {
            MAIL_CATEGORY_TYPE -> CatViewHolder(
                LayoutInflater.from(parent.context)
                .inflate(R.layout.item_category, parent,false)
            )
            MAIL_ITEM_TYPE -> MailViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_mail, parent, false)
            )
            else -> MailViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_mail, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: MailBaseViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mailItemList: ArrayList<MailItem>){
        items = mailItemList
    }

    abstract class MailBaseViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: MailItem)
    }


    override fun getItemViewType(position: Int): Int {
        val type = items[position].type
        Log.d("type", "$type")
        return items[position].type
    }

    class CatViewHolder
    constructor(
        itemView: View
    ): MailBaseViewHolder(itemView){

        private val tvTitle = itemView.item_cat_title
        private val tvDesc = itemView.item_cat_description
        private val tvNum = itemView.item_cat_counter
        private val imgCat = itemView.item_cat_img

        override fun bind(item: MailItem){
            item.categoryItem?.let { mItem ->
                tvTitle.text = mItem.title
                tvDesc.text = mItem.desc
                tvNum.text = mItem.numNotif.toString()
                Glide.with(itemView.context)
                    .load(mItem.icon)
                    .into(imgCat)

                when (mItem.color) {
                    "GREEN" -> {
                        imgCat.setColorFilter(
                            imgCat.context.resources.getColor(R.color.green)
                        )
                        DrawableCompat.setTint(
                            tvNum.background,
                            imgCat.context.resources.getColor(R.color.green)
                        )
                    }
                    "BLACK" -> {
                        imgCat.setColorFilter(
                            imgCat.context.resources.getColor(R.color.black)
                        )
                        DrawableCompat.setTint(
                            tvNum.background,
                            imgCat.context.resources.getColor(R.color.black)
                        )
                    }
                    "YELLOW" -> {
                        imgCat.setColorFilter(
                            imgCat.context.resources.getColor(R.color.yellow)
                        )
                        DrawableCompat.setTint(
                            tvNum.background,
                            imgCat.context.resources.getColor(R.color.yellow)
                        )
                    }
                    "BLUE" -> {
                        imgCat.setColorFilter(imgCat.context.resources.getColor(R.color.blue))
                        DrawableCompat.setTint(
                            tvNum.background,
                            imgCat.context.resources.getColor(R.color.blue)
                        )
                    }
                    "PURPLE" -> {
                        imgCat.setColorFilter(
                            imgCat.context.resources.getColor(R.color.purple)
                        )
                        DrawableCompat.setTint(
                            tvNum.background,
                            imgCat.context.resources.getColor(R.color.purple)
                        )
                    }
                    else -> tvNum.setBackgroundColor(
                        imgCat.context.resources.getColor(R.color.red)
                    )
                }
            }
        }

    }

    class MailViewHolder
    constructor(
        itemView: View
    ): MailBaseViewHolder(itemView){

        private val tvTitle = itemView.item_mail_title
        private val tvContent = itemView.item_mail_content
        private val tvDesc = itemView.item_mail_description
        private val tvDate = itemView.item_mail_date
        private val imgUser = itemView.item_mail_img
        private val imgFav = itemView.item_mail_fav

        override fun bind(item: MailItem){
            item.simpleItem?.let { mItem ->
                setSelected(mItem.isRead)
                setFav(mItem.isFav)
                tvTitle.text = mItem.title
                tvContent.text = mItem.content
                tvDesc.text = mItem.description

                Glide.with(itemView.context)
                    .load(mItem.imgUrl)
                    .circleCrop()
                    .into(imgUser)
            }

        }

        private fun setSelected(isRead: Boolean) {
            if (isRead) {
                tvTitle.setTypeface(Typeface.DEFAULT);
                tvDesc.setTypeface(Typeface.DEFAULT);
                tvDate.setTypeface(Typeface.DEFAULT);

            }

            else {
                tvTitle.setTypeface(Typeface.DEFAULT_BOLD);
                tvDesc.setTypeface(Typeface.DEFAULT_BOLD);
                tvDate.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        private fun setFav(fav: Boolean) {
            if (fav) {
                imgFav.setImageResource(R.drawable.ic_baseline_star_24);
                imgFav.setColorFilter(imgFav.context.resources.getColor(R.color.yellow));
            }
            else
            {
                imgFav.setImageResource(R.drawable.ic_baseline_star_border_24);
                imgFav.setColorFilter(imgFav.context.resources.getColor(R.color.light_text_sec_color));
            }
        }
    }
}