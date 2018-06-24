package br.com.gabrielmarcos.combitudo.utils

import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.Picasso

class PicassoService(val context: Context) {
    fun loadImage(url: String?, view: ImageView) {
        Picasso.with(context).load(url).fit().centerCrop().into(view)
    }
}