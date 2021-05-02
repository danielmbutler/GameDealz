package com.dbtechprojects.gamedeals.ui.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.util.ImageUtils


class GameListAdapter
    : RecyclerView.Adapter<GameViewHolder>() {

    private var gamelist = mutableListOf<Game>()

    fun setGameList(list: List<Game>) {
        gamelist = list as MutableList<Game>
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        return GameViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {

        val itemView = holder.itemView
        itemView.animation = AnimationUtils.loadAnimation(itemView.context, R.anim.slidein_and_fade)
        val TitleText = itemView.findViewById<TextView>(R.id.SavedRow_GameTitle)
        val MessageText = itemView.findViewById<TextView>(R.id.SavedRow_GameText)
        val RowImage = itemView.findViewById<ImageView>(R.id.SavedRowGameThumbnail)

        val game: Game = gamelist[position]
        holder.bind(game)
        Log.d("ViewHolder", game.toString())
        Log.d("ViewHolder", game.external!!)

        TitleText?.text = game.external
        MessageText?.text = "$${game.cheapest}"

        itemView.setOnClickListener {
            Log.d("test", game.toString())
            val intent = Intent(itemView.context, GameDealActivity::class.java)
            intent.putExtra("gamedeal",game)
            itemView.context.startActivity(intent)

        }

        //glide image
        val context = RowImage.context

        ImageUtils.loadImage(context, RowImage, game.thumb!!)
    }

    override fun getItemCount(): Int = gamelist.size

}


class GameViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.game_item, parent, false)) {

    fun bind(game: Game) {}

}