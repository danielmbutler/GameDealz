package com.dbtechprojects.gamedeals.ui.dialogs

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.dbtechprojects.gamedeals.R

class HelpDialog (): DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragement_container = container
        val rootview = layoutInflater.inflate(R.layout.activity_help,fragement_container, false)


         val button = rootview.findViewById<Button>(R.id.Help_Button)
         val helptextView = rootview.findViewById<TextView>(R.id.Help_TextView)
         helptextView.setMovementMethod(ScrollingMovementMethod());
         helptextView.setMovementMethod(LinkMovementMethod.getInstance())

        helptextView.setText(Html.fromHtml("<p><strong>Welcome to IGameDealz</strong></p>\n" +
                "<p><br></br></p>\n" +
                "<p>Please email any queries or questions to <a href=\"mailto:dbtechprojects@gmail.com\">dbtechprojects@gmail.com</a></p>\n" +
                "<p><br></br></p>\n" +
                "<p><strong>App Info</strong></p>\n" +
                "<p><br></br></p>\n" +
                "<p> This app will help you find deals for Online games from stores such as Steam, GamersGate and DirecttoDrive. You can search via game name or browse through the predefined list of stores, once you find a deal you can then use the 'get Deal' Button to launch the browser or you can save the deal to review later.</p>\n" +
                "<p><br></br></p>\n" +
                "<p><strong>Search Caching</strong></p>\n" +
                "<p>Searches are cached for 30 minutes to reduce network activity, this can be cleared from the settings menu if required, saved games can also been cleared from this menu. </p>\n" +
                "<p><br></br></p>\n" +
                "<p><strong>Data Storage</strong></p>\n" +
                "<p><br></br></p>\n" +
                "<p>Saved games and search caches/history are stored on the phone and <strong>will be deleted when uninstalling the app</strong>, this app does not request/store any personal information.\n" +
                "<p><br><p>Ver 1.1.0 </p></br></p>\n" +
                "<p><br></br></p>"))


        button.setOnClickListener {
            //close helpDialog
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        return rootview
    }
}