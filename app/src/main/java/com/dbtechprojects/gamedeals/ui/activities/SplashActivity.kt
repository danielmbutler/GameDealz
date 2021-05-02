package com.dbtechprojects.gamedeals.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.dbtechprojects.gamedeals.R

@Suppress("DEPRECATION")
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // TODO Step 6: Add the below code to make the screen as full screen and finish the activity after 2500 milliseconds.
        // START

        // This is used to hide the status bar and make the splash screen as a full screen activity.
        // It is deprecated in the API level 30. I will update you with the alternate solution soon.
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Adding the handler to after the a task after some delay.
        // It is deprecated in the API level 30.
        Handler().postDelayed(
                {
                    // Launch the Main Activity
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish() // Call this when your activity is done and should be closed.
                },
                2500
        ) // Here we pass the delay time in milliSeconds after which the splash activity will disappear.

//        val typeface: Typeface = Typeface.createFromAsset(assets,"Montserrat-Bold.ttf")
//        tv_app_name.typeface = typeface - NOW USING UTILS\MSPTEXTVIEWBOLD

        // END
    }
}