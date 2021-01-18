package com.cho.uiuxsamples.portfolio.sidemenu

class MenuItem {
    var icon: Int
    var code: Int
    var isSelected = false

    constructor(icon: Int, code: Int) {
        this.icon = icon
        this.code = code
    }

    constructor(icon: Int, code: Int, isSelected: Boolean) {
        this.icon = icon
        this.code = code
        this.isSelected = isSelected
    }

}