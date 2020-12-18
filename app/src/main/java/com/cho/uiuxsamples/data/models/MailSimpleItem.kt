package com.cho.uiuxsamples.data.models

class MailSimpleItem {
    var id = 0
    var title: String? = null
    var content: String? = null
    var description: String? = null
    var sentMail: String? = null
    var sentUserName: String? = null
    var imgUrl = 0
    var isFav = false
    var isRead = false

    constructor() {}
    constructor(
        id: Int,
        title: String?,
        content: String?,
        description: String?,
        sentMail: String?,
        sentUserName: String?,
        imgUrl: Int
    ) {
        this.id = id
        this.title = title
        this.content = content
        this.description = description
        this.sentMail = sentMail
        this.sentUserName = sentUserName
        this.imgUrl = imgUrl
    }

    constructor(
        id: Int,
        title: String?,
        content: String?,
        description: String?,
        sentMail: String?,
        sentUserName: String?,
        imgUrl: Int,
        isRead: Boolean
    ) {
        this.id = id
        this.title = title
        this.content = content
        this.description = description
        this.sentMail = sentMail
        this.sentUserName = sentUserName
        this.imgUrl = imgUrl
        this.isRead = isRead
    }

    constructor(
        id: Int,
        title: String?,
        description: String?,
        imgUrl: Int,
        Contentz: String?
    ) {
        this.id = id
        this.title = title
        this.description = description
        this.imgUrl = imgUrl
        content = Contentz
    }

    constructor(
        id: Int,
        title: String?,
        description: String?,
        imgUrl: Int,
        Contentz: String?,
        isRead: Boolean
    ) {
        this.id = id
        this.title = title
        this.description = description
        this.imgUrl = imgUrl
        content = Contentz
        this.isRead = isRead
    }

    constructor(
        id: Int,
        title: String?,
        description: String?,
        imgUrl: Int,
        Contentz: String?,
        isRead: Boolean,
        isFav: Boolean
    ) {
        this.id = id
        this.title = title
        this.description = description
        this.imgUrl = imgUrl
        content = Contentz
        this.isRead = isRead
        this.isFav = isFav
    }

}