package com.example.wallpaperapp20

import androidx.leanback.widget.AbstractDetailsDescriptionPresenter

class DetailsDescriptionPresenter : AbstractDetailsDescriptionPresenter() {

    override fun onBindDescription(
        viewHolder: AbstractDetailsDescriptionPresenter.ViewHolder,
        item: Any
    ) {
        val wallpaper = item as Wallpaper

        viewHolder.title.text = wallpaper.title
        viewHolder.subtitle.text = wallpaper.studio
        viewHolder.body.text = wallpaper.description
    }
}