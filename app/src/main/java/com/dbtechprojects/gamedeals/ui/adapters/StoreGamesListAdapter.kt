package com.dbtechprojects.gamedeals.ui.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.models.Mapper
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.util.ImageUtils

class StoreGamesListAdapter
    : RecyclerView.Adapter<StoreGamesViewHolder>() {

    private var gamelist = mutableListOf<GameStore>()

    fun setGameList(list: List<GameStore>) {
        gamelist = list as MutableList<GameStore>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreGamesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return StoreGamesViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: StoreGamesViewHolder, position: Int) {

        val itemView = holder.itemView
        itemView.animation = AnimationUtils.loadAnimation(itemView.context, R.anim.slidein_and_fade)
        val TitleText = itemView.findViewById<TextView>(R.id.SavedRow_GameTitle)
        val MessageText = itemView.findViewById<TextView>(R.id.SavedRow_GameText)
        val RowImage = itemView.findViewById<ImageView>(R.id.SavedRowGameThumbnail)

        val game: GameStore = gamelist[position]
        holder.bind(game)

        TitleText?.text = game.title
        MessageText?.text = "$${game.salePrice}"


        itemView.setOnClickListener {
            val converted = Mapper().GameStoreToGame(game)
            val intent = Intent(itemView.context, GameDealActivity::class.java)
            intent.putExtra("gamedeal", converted)
            itemView.context.startActivity(intent)

        }

        //glide image

        if (game.thumb?.isNotEmpty() == true) {
            ImageUtils.loadImage(itemView.context, RowImage, game.thumb)
        }


    }


    override fun getItemCount(): Int = gamelist.size


}

class StoreGamesViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.game_item, parent, false)) {

    fun bind(game: GameStore) {}

}