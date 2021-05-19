package com.dbtechprojects.gamedeals.ui.activities


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.R.*
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel
import com.dbtechprojects.gamedeals.util.ConnectionLiveData
import com.dbtechprojects.gamedeals.util.DoesNetworkHaveInternet
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


@AndroidEntryPoint
class MainActivity : BaseActivity(){



    lateinit var connectionLiveData: ConnectionLiveData


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       GlobalScope.launch(Dispatchers.IO) {

           val initialcheck = DoesNetworkHaveInternet.execute()
           if(initialcheck == false){
               withContext(Dispatchers.Main){
                   val view = findViewById<ViewGroup>(R.id.constraintlayout)
                   val customLayout = layoutInflater.inflate(R.layout.custom_toast,view )
                   customLayout.findViewById<TextView>(R.id.toasttext).text = "No internet detected, please check connection"
                   showToast(this@MainActivity,customLayout)
               }

           }
       }


        connectionLiveData = ConnectionLiveData(this)
        val navView: BottomNavigationView = findViewById(R.id.Bottomnavigation)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                id.Menu_Item_GameFragment,
                id.Menu_Item_StoreFragment,
                id.Menu_Item_SavedDealsFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)

        navView.setupWithNavController(navController)


        var isNetworkAvailable = connectionLiveData.observe(this,{ isNetworkAvailablecheck ->
            if(isNetworkAvailablecheck == false){
                val view = findViewById<ViewGroup>(R.id.constraintlayout)
                val customLayout = layoutInflater.inflate(R.layout.custom_toast,view )
                customLayout.findViewById<TextView>(R.id.toasttext).text = "No internet detected, please check connection"
                showToast(this@MainActivity,customLayout)
            }

        })

    }

    // set up right help icon on toolbar

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            id.action_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}




