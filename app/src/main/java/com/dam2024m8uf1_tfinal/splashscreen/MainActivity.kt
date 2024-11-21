package com.dam2024m8uf1_tfinal.splashscreen

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun openDialog(view: View) {
            val builder = AlertDialog.Builder(this)
            val title = getString(R.string.acitvity_main_do)
            val message = getString(R.string.activity_main_welcome_jungle)
            builder.setTitle(title)
            builder.setMessage(message)
                .setPositiveButton(getString(R.string.dialog_ok)) { dialog, id ->
                    Log.i("AD_C14","Acceptar")
                    dialog.dismiss()
                }
                .setNegativeButton(getString(R.string.dialog_ko)) { dialog, id ->
                    Log.i("AD_C14","Cancel.lar")
                    dialog.dismiss()
                }
            val dialeg = builder.create()
            dialeg.show()
        }
    }
}