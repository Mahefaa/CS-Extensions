package com.lagradost

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class FstvProvider : MainAPI() {
    override var lang = "fr"

    // dynamically get from fstream.one if taken down
    override var mainUrl = "https://fstv.lol"
    override var name = "fstv"
    override val hasMainPage = true
    override val hasChromecastSupport = true
    override val supportedTypes = setOf(
        TvType.Live,
    )
}