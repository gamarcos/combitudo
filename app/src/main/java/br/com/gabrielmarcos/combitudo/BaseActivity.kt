package br.com.gabrielmarcos.combitudo

import android.app.Activity
import android.widget.Toast

class BaseActivity: Activity() {
    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}