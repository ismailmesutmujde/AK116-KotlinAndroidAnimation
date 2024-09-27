package com.ismailmesutmujde.kotlinandroidanimation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinandroidanimation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonStart.setOnClickListener {
            //Toast.makeText(applicationContext, "TEST", Toast.LENGTH_SHORT).show()
            alphaAnimation()
        }

    }

    fun alphaAnimation() {
        val alpha = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "alpha",0.0f,1.0f).apply {
            duration = 3000
        }
        alpha.start()
    }
}