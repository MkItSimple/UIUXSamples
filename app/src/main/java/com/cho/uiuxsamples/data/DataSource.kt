package com.cho.uiuxsamples.data

import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.data.model.FruitItem
import com.cho.uiuxsamples.data.models.*
import com.cho.uiuxsamples.portfolio.cv.CVItem


class DataSource{

    companion object{
        const val TITLE_1 = "Anna Smith"
        const val TITLE_2 = "Adobe Creative Cloud Updates"
        const val TITLE_3 = "Jhon Doe"
        const val TITLE_4 = "Kelsey Green"
        const val TITLE_5 = "Space News Latest Update"
        const val TITLE_6 = "Anna Smith"
        const val TITLE_7 = "Android Blog Daily Post"
        const val TITLE_8 = "Choreyn Anania"

        // Dummy User Images
        val IMG_1: Int = R.drawable.pnggoogle
        val IMG_2: Int = R.drawable.adobe
        val IMG_3: Int = R.drawable.user4
        val IMG_4: Int = R.drawable.user
        val IMG_5: Int = R.drawable.user2
        val IMG_6: Int = R.drawable.girl0
        val IMG_7: Int = R.drawable.androidstudio

        // Fruit Names
//        const val n1 = "Apple"
//        const val n2 = "Banana"
//        const val n3 = "Grapes"
//        const val n4 = "Mango"
//        const val n5 = "Orange"
//        const val n6 = "Papaya"
//        const val n7 = "Watermelon"

        val f1: Int = R.drawable.f1
        val f2: Int = R.drawable.f2
        val f3: Int = R.drawable.f3
        val f4: Int = R.drawable.f4
        val f5: Int = R.drawable.f5
        val f6: Int = R.drawable.f6
        val f7: Int = R.drawable.ff7


        // Dummy Mail Content
        const val Content_1 =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

        // Dummy Description
        const val DESC_1 = "Lorem ipsum dolor sit amet"

        fun createFruitDataSet(): ArrayList<FruitItem>{
            val items = ArrayList<FruitItem>()

            items.add(FruitItem("Apple", DESC_1, f1))
            items.add(FruitItem("Banana", DESC_1, f2))
            items.add(FruitItem("Grapes", DESC_1, f3))
            items.add(FruitItem("Mango", DESC_1, f4))
            items.add(FruitItem("Orange", DESC_1, f5))
            items.add(FruitItem("Papaya", DESC_1, f6))
            items.add(FruitItem("Watermelon", DESC_1, f7))
            return items
        }

        fun createCVDataSet(): ArrayList<CVItem>{
            val cvItems = ArrayList<CVItem>()

            cvItems.add(CVItem("20 April 2013", DESC_1))
            cvItems.add(CVItem("20 May 2013", DESC_1))
            cvItems.add(CVItem("25 July 2013", DESC_1))
            cvItems.add(CVItem("20 April 2013", DESC_1))
            return cvItems
        }

        fun createNavDataSet(): ArrayList<NavItem>{
            val navMenu = ArrayList<NavItem>()

            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_all_inbox_24, "All Inboxes", false, 120)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_person_outline_24, "Social", false, 20)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_outline_local_offer_24, "Promotions", false, 120)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_outline_forum_24, "Forums", true, 5)
                )
            )
            navMenu.add(NavItem(LabelItem("All LABELS")))

            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_star_border_24, "Starred", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_snooze_24, "Snoozed", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_outline_send_24, "Sent", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_snooze_24, "Scheduled", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_outline_drafts_24, "Draft", false, 5)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_all_inbox_24, "All Mails", false, 120)
                )
            )

            navMenu.add(NavItem(LabelItem("GOOGLE APPS")))
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_calendar_today_24, "Calendar", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_person_outline_24, "Contacts", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_outline_settings_24, "Settings", false)
                )
            )
            navMenu.add(
                NavItem(
                    MenuItem(R.drawable.ic_baseline_all_inbox_24, "Contacts", false)
                )
            )

            return navMenu
        }

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
                        TITLE_8,
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
                        TITLE_8,
                        DESC_1,
                        IMG_1,
                        Content_1,
                        true,
                        true
                    )
                )
            )

            data.add(
                MailItem(
                    MailSimpleItem(
                        2,
                        TITLE_8,
                        DESC_1,
                        R.drawable.usernoimg01,
                        Content_1
                    )
                )
            )

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
                    MailSimpleItem(
                        3,
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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
                        TITLE_8,
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