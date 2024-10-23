package com.example.app.core

import android.content.Context
import android.widget.Toast

class Utils {
    companion object {

        fun showMessage(
            context: Context,
            message: String?
        ) = Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}