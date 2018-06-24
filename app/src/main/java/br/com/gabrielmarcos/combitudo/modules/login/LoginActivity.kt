package br.com.gabrielmarcos.combitudo.modules.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import br.com.gabrielmarcos.combitudo.MainActivity
import br.com.gabrielmarcos.combitudo.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginEnterDirect.setOnClickListener {
            initApplication()
        }

        loginEnter.setOnClickListener {
            initApplication()
        }
    }

    private fun initApplication() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}