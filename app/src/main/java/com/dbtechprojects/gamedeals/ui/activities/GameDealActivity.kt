package com.dbtechprojects.gamedeals.ui.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.Mapper
import com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel
import com.dbtechprojects.gamedeals.util.ImageUtils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GameDealActivity : BaseActivity() {

    private val viewModel: GameDealViewModel by viewModels()
    private lateinit var mSavedGames: List<Game>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_deal)

        viewModel.savedGames.observe(this, Observer { games ->
            mSavedGames = games

        })

        val game = intent.getParcelableExtra<Game>("gamedeal")
        setupActionBar("Game Deal")

        val tv = findViewById<TextView>(R.id.GameDealTextView)
        val ImageView = findViewById<ImageView>(R.id.GameDealimageView)
        val priceTv = findViewById<TextView>(R.id.GameDealPriceTV)
        tv.movementMethod = ScrollingMovementMethod()

        tv.setText(game?.external.toString())

        priceTv.setText("$${game?.cheapest}")

        ImageUtils.loadImage(this, ImageView, game!!.thumb!!)

        val Dealbutton = findViewById<Button>(R.id.GameDealGetDealButton)
        val SaveButton = findViewById<Button>(R.id.GameDealSaveDealButton)

        Dealbutton.setOnClickListener {
            val deal = game.cheapestDealID
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cheapshark.com/redirect?dealID=${deal}"))
            startActivity(browserIntent)
        }

        SaveButton.setOnClickListener {

            val view = findViewById<ViewGroup>(R.id.constraintlayout)
            val customLayout = layoutInflater.inflate(R.layout.custom_toast,view )


            if(mSavedGames.size >= 30 ){
                customLayout.findViewById<TextView>(R.id.toasttext).setText("Error - Unable to save game deal you have reached the maximum amont")
                showToast(this,customLayout)
            } else{
                game.saved = "true"
                viewModel.saveGameDeal(game)
                customLayout.findViewById<TextView>(R.id.toasttext).setText("Deal has been Saved")
                showToast(this,customLayout)
            }




        }
    }


}