package com.dbtechprojects.gamedeals.ui.activities

import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.dialogs.HelpDialog
import com.dbtechprojects.gamedeals.ui.viewmodels.SettingsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*

@AndroidEntryPoint
class SettingsActivity : BaseActivity() {

    private val viewModel: SettingsViewModel by viewModels()
    private lateinit var mGames: List<Game>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val clearSearchCacheCBX = findViewById<CheckBox>(R.id.settingsClearCacheCBX)
        val clearSavedGamesCBX = findViewById<CheckBox>(R.id.SettingsClearSGCBX)
        val confirmbtn = findViewById<Button>(R.id.SettingsConfirmBTN)
        val helpbtn = findViewById<Button>(R.id.SettingsHelpButton)

        setupActionBar("Settings")

        // setup observer
        viewModel.savedGames.observe(this, Observer { games ->
            mGames = games
        })

        helpbtn.setOnClickListener {
            val dialog =
                HelpDialog()
            dialog.show(supportFragmentManager, "Help")
        }

        confirmbtn.setOnClickListener {

            if (!clearSavedGamesCBX.isChecked && !clearSearchCacheCBX.isChecked) {
                var message = "please check a tickbox"
                val view = findViewById<ViewGroup>(R.id.constraintlayout)
                val customLayout = layoutInflater.inflate(R.layout.custom_toast, view)
                customLayout.findViewById<TextView>(R.id.toasttext).text = message
                showToast(this, customLayout)
            } else {
                // alert builder
                val builder = AlertDialog.Builder(this, R.style.MyDialogTheme)
                builder.setMessage("Are you sure ?")
                    .setCancelable(false)
                    .setPositiveButton("Yes") { dialog, id ->
                        if (clearSearchCacheCBX.isChecked) {
                            viewModel.removeSearchCache()
                            clearSearchCacheCBX.isChecked = false


                        }
                        if (clearSavedGamesCBX.isChecked) {
                            if (mGames.isNotEmpty()) {
                                for (game in mGames) {
                                    game.saved = null
                                    viewModel.removeSavedGameDeal(game)
                                }
                            }


                            clearSavedGamesCBX.isChecked = false


                        }
                        val view = findViewById<ViewGroup>(R.id.constraintlayout)
                        val customLayout = layoutInflater.inflate(R.layout.custom_toast, view)
                        customLayout.findViewById<TextView>(R.id.toasttext).text = "Items Cleared"
                        showToast(this, customLayout)

                    }
                    .setNegativeButton("No") { dialog, id ->
                        // Dismiss the dialog
                        dialog.dismiss()
                    }
                val alert = builder.create()
                alert.show()
            }


        }

    }

}
