package com.example.wallpaperapp20

object WallpaperList {
    val WALLPAPER_CATEGORY = arrayOf(
        "Abstract",
        "Animals",
        "Entertainment",
        "Holidays",
        "Nature",
        "Sports",
        "Vehicles",
        "World"
    )

    private var list: MutableList<Wallpaper>? = null
    private var count: Long = 0

    @JvmStatic
    fun setupWallpapers(): MutableList<Wallpaper>? {
        list = ArrayList()
        val categoryWallpapers = arrayOf(
            arrayOf(
                "Night Lake",
                "Moonshine Ocean",
                "Red Circle",
                "Planet Tree",
                "Ice Cubic Rubik"
            ), arrayOf(
                "Lion",
                "Tiger",
                "Elephant",
                "Panda",
                "Giraffe"
            ), arrayOf(
                "Joker",
                "Concert",
                "Books",
                "Chess",
                "Radio"
            ), arrayOf(
                "Christmas - Santa Claus",
                "Winter",
                "Christmas Lights",
                "New Year - Home",
                "Christmas Cocoa"
            ), arrayOf(
                "Ocean tree",
                "Fall",
                "Lake storm",
                "Mountains",
                "Wave"
            ), arrayOf(
                "Running",
                "Football",
                "Sailing",
                "Jumping",
                "Tennis ball"
            ), arrayOf(
                "Porsche",
                "Fiat 500",
                "Motorcycle BMW",
                "Tractor",
                "Bicycle"
            ), arrayOf(
                "London",
                "New York",
                "Venice",
                "Rome",
                "Lisbon"
            )
        )

        val bgImageUrl = arrayOf(
            "https://www.wallpaperup.com/uploads/wallpapers/2013/12/15/196207/dfe27e0ee314d6e8181a2c5c4166f12f-500.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2013/12/18/198402/bf588ce14b94a7bcd5f4a05f669bc310-700.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2013/12/18/198901/1e30f16dc7fe45af8bfead9b919c7246-500.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2013/12/22/202140/dcd8625dcb71d077d459abb7ae67f109-500.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2014/01/02/213086/e9cf53cc474c5fbdf3629569dd263b6f-700.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2017/04/09/1084436/425e6f61ed6b4e5a1ed54637b6301535-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2017/04/07/1084332/75aa3b61a45360e8b00183722af3f4b3-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2014/11/22/523809/8597d9c351ad86929a3f7026d3d64130-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2014/01/08/219384/37f8ea54b94069e0a7eb93597409460e-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2014/11/10/512447/cf8ba1b4d68bded0226e4e2ae0e9c1f7-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2013/04/02/69649/2afe6ebe079fcbe476676e4aa31d8ada-1000.jpg",
            "https://cdn.pixabay.com/photo/2015/11/22/19/04/crowd-1056764_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/04/16/09/33/literature-3324039_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/09/08/20/29/chess-2730034_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/11/24/10/43/radio-2974649_1280.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2012/12/24/26394/05e564544b33a24dd4dc443def78c45a-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2012/12/17/25449/a3afbd85fccd010c0e7327a1555839a4-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2012/11/27/22795/cb79f09418b115006a456a92284d6ea6-1000.jpg",
            "https://www.wallpaperup.com/uploads/wallpapers/2012/12/01/23442/ef79706a823d7ed2b5e76cf3c90c386b-1000.jpg",
            "https://cdn.pixabay.com/photo/2016/12/15/03/27/cocoa-1908020_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072821_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/02/01/22/02/mountain-landscape-2031539_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/05/25/15/08/jogging-2343558_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/14/05/21/children-1822688_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/08/14/18/27/sailing-boat-1593613_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/04/20/17/39/man-731900_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/05/09/11/09/tennis-1381230_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/22/23/44/porsche-1851246_1280.jpg",
            "https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-500-4322521_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343_1280.jpg",
            "https://cdn.pixabay.com/photo/2023/09/25/16/18/agriculture-8275498_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/10/03/23/19/bike-190483_1280.jpg",
            "https://cdn.pixabay.com/photo/2014/11/13/23/34/palace-530055_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/22/19/17/buildings-1850129_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/07/18/20/25/channel-3547224_1280.jpg",
            "https://cdn.pixabay.com/photo/2019/10/06/08/57/tiber-river-4529605_1280.jpg",
            "https://cdn.pixabay.com/photo/2023/09/22/11/10/lisbon-8268841_1280.jpg"
        )


        var bgIndex = 0 // Initialize background image index
        for (categoryIndex in categoryWallpapers.indices) {
            val categoryImages = categoryWallpapers[categoryIndex]
            val categoryTitle = WALLPAPER_CATEGORY[categoryIndex]
            for (index in categoryImages.indices) {
                val bgImageUrl = bgImageUrl[bgIndex % bgImageUrl.size]
                (list as ArrayList<Wallpaper>).add(
                    buildWallpaperInfo(
                        categoryImages[index],
                        bgImageUrl,
                        categoryTitle
                    )
                )
                bgIndex++ // Move to the next background image
            }
        }
        return list
    }

    private fun buildWallpaperInfo(
        title: String,
        cardImageUrl: String,
        backgroundImageUrl: String
    ): Wallpaper {
        val wallpaper = Wallpaper()
        wallpaper.id = count++
        wallpaper.title = title
        wallpaper.cardImageUrl = cardImageUrl
        wallpaper.backgroundImageUrl = backgroundImageUrl
        return wallpaper
    }
}