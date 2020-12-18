package com.cho.uiuxsamples.data

import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.data.models.MailCategoryItem
import com.cho.uiuxsamples.data.models.MailItem
import com.cho.uiuxsamples.data.models.MailSimpleItem


class DataSource{

    companion object{
        const val TITLE_1 = "Anna Smith"
        const val TITLE_2 = "Adobe Creative Cloud Updates"
        const val TITLE_3 = "Jhon Doe"
        const val TITLE_4 = "Kelsey Green"
        const val TITLE_5 = "Space News Latest Update"
        const val TITLE_6 = "Anna Smith"
        const val TITLE_7 = "Android Blog Daily Post"
        const val TITLE_8 = "Google Team"

        // Dummy User Images
        val IMG_1: Int = R.drawable.pnggoogle
        val IMG_2: Int = R.drawable.adobe
        val IMG_3: Int = R.drawable.user4
        val IMG_4: Int = R.drawable.user
        val IMG_5: Int = R.drawable.user2
        val IMG_6: Int = R.drawable.girl0
        val IMG_7: Int = R.drawable.androidstudio

        // Dummy Mail Content
        const val Content_1 =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

        // Dummy Description
        const val DESC_1 = "Lorem ipsum dolor sit amet"
        const val DESC_2 = "Lorem ipsum dolor sit amet"
        const val DESC_3 = "Lorem ipsum dolor sit amet"
        const val DESC_4 = "Lorem ipsum dolor sit amet"
        const val DESC_5 = "Lorem ipsum dolor sit amet"
        const val DESC_6 = "Lorem ipsum dolor sit amet"
        const val DESC_7 = "Lorem ipsum dolor sit amet"

        fun createDataSet(): ArrayList<MailItem>{
            val data = ArrayList<MailItem>()

            data.add(
                MailItem(
                    MailCategoryItem(
                        R.drawable.ic_outline_info_24,
                        "Updates",
                        "Google, GOG.COM, Uplabs And 19 more...\nCheck Important Recent update",
                        "",
                        "YELLOW",
                        12
                    )
                )
            )

            data.add(
                MailItem(
                    MailCategoryItem(
                        R.drawable.ic_outline_local_offer_24,
                        "PROMOTION",
                        DESC_1,
                        "GREEN",
                        "GREEN",
                        122
                    )
                )
            )

            data.add(
                MailItem(
                    MailCategoryItem(
                        R.drawable.ic_outline_forum_24,
                        TITLE_1,
                        DESC_1,
                        "PURPLE",
                        "PURPLE",
                        5
                    )
                )
            )

            data.add(
                MailItem(
                    MailSimpleItem(
                        1,
                        TITLE_1,
                        DESC_1,
                        IMG_1,
                        Content_1,
                        true
                    )
                )
            )

            data.add(
                MailItem(
                    MailSimpleItem(
                        2,
                        TITLE_2,
                        DESC_1,
                        R.drawable.usernoimg01,
                        Content_1
                    )
                )
            )

            data.add(
                MailItem(
                    MailSimpleItem(
                        3,
                        TITLE_3,
                        DESC_1,
                        R.drawable.usernoimg0,
                        Content_1,
                        true,
                        true
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        4,
                        TITLE_4,
                        DESC_1,
                        IMG_4,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        5,
                        TITLE_5,
                        DESC_1,
                        IMG_5,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        6,
                        TITLE_6,
                        DESC_1,
                        IMG_6,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        7,
                        TITLE_7,
                        DESC_1,
                        IMG_7,
                        Content_1,
                        true
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        8,
                        TITLE_6,
                        DESC_1,
                        IMG_6,
                        Content_1,
                        true
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        9,
                        TITLE_7,
                        DESC_1,
                        R.drawable.usernoimg01,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        10,
                        TITLE_6,
                        DESC_1,
                        IMG_6,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        11,
                        TITLE_7,
                        DESC_1,
                        IMG_1,
                        Content_1
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        12,
                        TITLE_6,
                        DESC_1,
                        R.drawable.usernoimg0,
                        Content_1,
                        true
                    )
                )
            )
            data.add(
                MailItem(
                    MailSimpleItem(
                        13,
                        TITLE_7,
                        DESC_1,
                        IMG_5,
                        Content_1
                    )
                )
            )



            return data
        }
    }
}