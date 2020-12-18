package com.cho.uiuxsamples.data.models

import com.cho.uiuxsamples.util.Constants

class MailItem {
    var categoryItem: MailCategoryItem? = null
    var simpleItem: MailSimpleItem? = null
    var type: Int

    constructor(categoryItem: MailCategoryItem?) {
        this.categoryItem = categoryItem
        type = Constants.MAIL_CATEGORY_TYPE
    }

    constructor(simpleItem: MailSimpleItem?) {
        this.simpleItem = simpleItem
        type = Constants.MAIL_ITEM_TYPE
    }

}