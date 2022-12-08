package com.github.geezgus.suacasa

import android.content.Context
import android.content.Intent

class Navigation {
    class Activity {
        companion object {
            fun homePage(context: Context) {
                context.startActivity(
                    Intent(context, HomePageActivity::class.java)
                )
            }

            fun login(context: Context) {
                context.startActivity(
                    Intent(context, LoginActivity::class.java)
                )
            }

            fun register(context: Context) {
                context.startActivity(
                    Intent(context, RegisterActivity::class.java)
                )
            }

            fun addItem(context: Context) {
                context.startActivity(
                    Intent(context, AddItemActivity::class.java)
                )
            }
        }
    }
}