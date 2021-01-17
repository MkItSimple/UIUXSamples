package com.cho.uiuxsamples

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cho.uiuxsamples.data.model.FruitItem
import com.cho.uiuxsamples.fragments.FruitListFragment

class FruitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        val fruitListFragment: Fragment = FruitListFragment.newInstance()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, fruitListFragment)
            .commit()

    }

    fun changeDetailFragment(
        itemView: View,
        item: FruitItem
    ) {
        

        val intent = Intent(this, SharedActivity::class.java)

        val fruitImage = itemView.findViewById<ImageView>(R.id.fruit_image)
        val fruitName = itemView.findViewById<TextView>(R.id.fruit_name)

        val pairs = listOf<Pair<View, String>>(
            Pair.create<View, String>(fruitImage, "imageTransition"),
            Pair.create<View, String>(fruitName, "nameTransition")
        )

        val options = ActivityOptions.makeSceneTransitionAnimation(this,
            pairs[0],
            pairs[1]
        )

        intent.putExtra("fImage", item.image)
        intent.putExtra("fName", item.title)

        startActivity(intent, options.toBundle())

    }


}