package org.aksolutions.logiclens

import android.graphics.Bitmap
import org.aksolutions.logiclens.data.chat

data class ChatState (
    val chatList: MutableList<chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)