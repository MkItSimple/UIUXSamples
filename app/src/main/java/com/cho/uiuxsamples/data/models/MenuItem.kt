package com.cho.uiuxsamples.data.models

class MenuItem{
    var icon: Int = 0
    var title: String? = null
    var isSelected: Boolean = false
    var numNotification: Int = 0

    constructor(){}

    constructor(
        drawable: Int,
        title: String?,
        isSelected: Boolean
    ) {
        icon = drawable
        this.title = title
        this.isSelected = isSelected
    }


    constructor(
        icon: Int,
        title: String?,
        isSelected: Boolean,
        numNotification: Int
    ) {
        this.icon = icon
        this.title = title
        this.isSelected = isSelected
        this.numNotification = numNotification
    }
}
