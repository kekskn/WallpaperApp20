package com.example.wallpaperapp20

import android.app.WallpaperManager
import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import java.io.IOException
import java.io.Serializable


data class Wallpaper(
    var id: Long = 0,
    var title: String? = null,
    var description: String? = null,
    var backgroundImageUrl: String? = null,
    var cardImageUrl: String? = null,
    var videoUrl: String? = null,
    var studio: String? = null,
    var isSetAsWallpaperActionClicked: Boolean = false
) : Serializable {

    override fun toString(): String {
        return "Wallpaper{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", backgroundImageUrl='" + backgroundImageUrl + '\'' +
                ", cardImageUrl='" + cardImageUrl + '\'' +
                '}'
    }

    companion object {
        internal const val serialVersionUID = 727566175075960653L
    }
}