package com.cho.uiuxsamples

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.cho.uiuxsamples.adapters.MovieAdapter
import com.cho.uiuxsamples.adapters.SliderPagerAdapter
import com.cho.uiuxsamples.data.models.Movie
import com.cho.uiuxsamples.data.models.Slide
import kotlinx.android.synthetic.main.activity_movie_home.*
import java.util.*
import kotlin.collections.ArrayList

class MovieHomeActivity : AppCompatActivity(), MovieAdapter.Interaction {

    private val lstSlides = ArrayList<Slide>()
    private val lstMovies = ArrayList<Movie>()
    private lateinit var sliderPagerAdapter: SliderPagerAdapter
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var sliderPager: ViewPager

    var timer: Timer? = null
    val DELAY_MS: Long = 3000
    val PERIOD_MS: Long = 4000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_home)

        sliderPager = slider_pager

        lstSlides.add(Slide(R.drawable.spiderman_h, "Spiderman Homecoming"))
        lstSlides.add(Slide(R.drawable.endgame_h, "Avengers Endgame"))
        lstSlides.add(Slide(R.drawable.blackpanter_h, "Black Panther"))
        lstSlides.add(Slide(R.drawable.mulan_h, "Mulan"))


        sliderPagerAdapter = SliderPagerAdapter(this, lstSlides)
        sliderPager.adapter = sliderPagerAdapter

        indicator.setupWithViewPager(sliderPager,true)


        /*After setting the adapter use the timer */

        /*After setting the adapter use the timer */
        val handler = Handler()
        val Update = Runnable {
            if (sliderPager.currentItem < lstSlides.size - 1) {
                sliderPager.setCurrentItem(sliderPager.currentItem + 1, true)
            } else sliderPager.setCurrentItem(0, true)
        }

        timer = Timer() // This will create a new Thread

        timer!!.schedule(object : TimerTask() {
            // task to be scheduled
            override fun run() {
                handler.post(Update)
            }
        }, DELAY_MS, PERIOD_MS)

        lstMovies.add(Movie("Avengers Endgame", R.drawable.endgame_v, R.drawable.endgame_h))
        lstMovies.add(Movie("Mulan", R.drawable.mulan_v, R.drawable.mulan_h))
        lstMovies.add(Movie("Incredible Hulk", R.drawable.hulk_v, R.drawable.hulk_h))
        lstMovies.add(Movie("Moana", R.drawable.moana_v, R.drawable.moana_h))
        lstMovies.add(Movie("Black Panter", R.drawable.blackpanter_v, R.drawable.blackpanter_h))
        lstMovies.add(Movie("Spiderman Homecoming", R.drawable.spiderman_v, R.drawable.spiderman_h))

        movieAdapter = MovieAdapter(lstMovies, this)
        Rv_movies.adapter = movieAdapter
        Rv_movies.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun onMovieClick(movie: Movie, movieImageView: ImageView) {
// here we send movie information to detail activity
        // also we ll create the transition animation between the two activity


        // here we send movie information to detail activity
        // also we ll create the transition animation between the two activity
        val intent = Intent(this, MovieDetailActivity::class.java)
        // send movie information to deatilActivity
        // send movie information to deatilActivity
        intent.putExtra("title", movie.title)
        intent.putExtra("imgURL", movie.thumbnail)
        intent.putExtra("imgCover", movie.coverPhoto)
        // lets crezte the animation
        // lets crezte the animation
        val options = ActivityOptions.makeSceneTransitionAnimation(
            this@MovieHomeActivity,
            movieImageView, "sharedName"
        )

        startActivity(intent, options.toBundle())


        // i l make a simple test to see if the click works


        // i l make a simple test to see if the click works
        Toast.makeText(this, "item clicked : " + movie.title, Toast.LENGTH_LONG).show()
        // it works great
    }

//    class SliderTimer : TimerTask() {
//        override fun run() {
//            this@HomeActivity.runOnUiThread(Runnable {
//                if (sliderPager.getCurrentItem() < lstSlides.size - 1) {
//                    sliderPager.setCurrentItem(sliderpager.getCurrentItem() + 1)
//                } else sliderpager.setCurrentItem(0)
//            })
//        }
//    }
}