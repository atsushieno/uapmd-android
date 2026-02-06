package dev.atsushieno.uapmd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        // Used to load the 'uapmd' library on application startup.
        init {
            System.loadLibrary("uapmd-app")
        }
    }
}