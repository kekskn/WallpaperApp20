package com.example.wallpaperapp20

import android.icu.text.DateFormat.ABBR_MONTH_WEEKDAY_DAY
import android.icu.text.DateFormat.ABBR_WEEKDAY
import android.icu.text.DateFormat.YEAR_ABBR_MONTH
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DetailsActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.details_fragment, VideoDetailsFragment())
                .commitNow()
        }
        val timeTextView: TextView = findViewById(R.id.timeTextView)
        val currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
        timeTextView.text = currentTime

        val dateTextView: TextView = findViewById(R.id.dateTextView)
        val currentDate = SimpleDateFormat("E, dd.LLL,yyyy", Locale.getDefault()).format(Date())
        dateTextView.text = currentDate
    }


    companion object {
        const val SHARED_ELEMENT_NAME = "hero"
        const val WALLPAPER = "Wallpaper"
    }
}