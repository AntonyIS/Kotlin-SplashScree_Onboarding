package com.example.tibaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

//        define animation
        val top_bottom_animation = AnimationUtils.loadAnimation(this,R.anim.top_bottom_animation)
        val bottom_top_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_top_animation)
        val bounce_animation = AnimationUtils.loadAnimation(this,R.anim.bounce_animation)

//        grab id from from end XML
        img_top_bottom.startAnimation(top_bottom_animation)
        tv_bounce.startAnimation(bounce_animation)
        img_bottom_top.startAnimation(bottom_top_animation)

//        handle splashscreen
        Handler().postDelayed({
            val go_to_winstone = Intent(this,MainActivity::class.java)
            startActivity(go_to_winstone)
            finish()
        },5000)





    }
}
