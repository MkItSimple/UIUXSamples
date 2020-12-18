package com.cho.uiuxsamples.data.models

import com.cho.uiuxsamples.util.Constants

class NavItem {

    var menuItem: MenuItem? = null
    var labelItem: LabelItem? = null
    var type: Int

    constructor(menuItem: MenuItem?) {
        this.menuItem = menuItem
        type = Constants.NAV_MENU_TYPE
    }

    constructor(labelItem: LabelItem?) {
        this.labelItem = labelItem
        type = Constants.NAV_TEXT_TYPE
    }
}