package com.example.testandroidapp.view.bindingadapter


import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.testandroidapp.R

@BindingAdapter("android:customBackground")
fun TextView.setCustomBackground(isOk: Boolean) {
    background = if (isOk) {
        ContextCompat.getDrawable(context, R.color.light_blue_400)
    } else {
        ContextCompat.getDrawable(context, R.color.gray_400)
    }
}


