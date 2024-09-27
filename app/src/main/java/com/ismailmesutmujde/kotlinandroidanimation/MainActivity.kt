package com.ismailmesutmujde.kotlinandroidanimation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
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

        buttonFromBottomToTop()
        textFromRightToLeft()
        imageFromLeftToRight()

        bindingMain.buttonStart.setOnClickListener {
            //Toast.makeText(applicationContext, "TEST", Toast.LENGTH_SHORT).show()
            //alphaAnimation()
            //scaleAnimation()
            //rotateAnimation()
            //translationAnimation()
            //delayFeature()
            //accelerationFeature()
            repeatFeature()
        }

    }

    fun alphaAnimation() {
        val alpha = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "alpha",0.0f,1.0f).apply {
            duration = 3000
        }
        alpha.start()
    }

    fun scaleAnimation() {
        val scale = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "scaleY",1.0f,0.5f).apply {
            duration = 1000
        }
        scale.start()
    }

    fun rotateAnimation() {
        val rotate = ObjectAnimator.ofFloat(bindingMain.textViewAppTitle, "rotation",0.0f,360.0f).apply {
            duration = 3000
        }
        rotate.start()
    }
    fun translationAnimation() {
        val translation = ObjectAnimator.ofFloat(bindingMain.textViewAppTitle, "translationY",0.0f,-50.0f).apply {
            duration = 3000
        }
        translation.start()
    }

    fun buttonFromBottomToTop() {
        val translation = ObjectAnimator.ofFloat(bindingMain.buttonStart, "translationY",800.0f, 0.0f).apply {
            duration = 1000
        }
        translation.start()
    }

    fun textFromRightToLeft() {
        val translation = ObjectAnimator.ofFloat(bindingMain.textViewAppTitle, "translationX",800.0f, 0.0f).apply {
            duration = 1000
        }
        translation.start()
    }

    fun imageFromLeftToRight() {
        val translation = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "translationX",-800.0f, 0.0f).apply {
            duration = 1000
        }
        translation.start()
    }

    fun delayFeature() {
        val translation = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "translationY",0.0f, 50.0f).apply {
            duration = 3000
            startDelay = 2000
        }
        translation.start()
    }

    fun accelerationFeature() {
        val translation = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "translationY",0.0f, 300.0f).apply {
            duration = 1000
            //interpolator = OvershootInterpolator()
            interpolator = BounceInterpolator()
        }
        translation.start()
    }

    fun repeatFeature() {
        val translation = ObjectAnimator.ofFloat(bindingMain.imageViewAppLogo, "translationY",0.0f, 100.0f).apply {
            duration = 1000
            repeatCount = ObjectAnimator.INFINITE
            //repeatMode = ObjectAnimator.RESTART
            repeatMode = ObjectAnimator.REVERSE
        }
        translation.start()
    }
}