package com.dbtechprojects.gamedeals.ui.adapters

import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.util.ImageUtils

// https://developer.android.com/reference/androidx/recyclerview/widget/DiffUtil
// TEMPLATE: https://codingwithmitch.com/blog/kotlin-recyclerview-template/

class GameListAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Game>() {

        override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
            return oldItem.gameID == newItem.gameID // something unique that will not change
        }

        override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
            return oldItem == newItem
        }

    }
    private val differ = AsyncListDiffer(this, DIFF_CALLBACK)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return GameViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.game_item,
                parent,
                false
            ),
            interaction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GameViewHolder -> {
                holder.bind(differ.currentList.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<Game>) {
        differ.submitList(list)
    }

    class GameViewHolder
    constructor(
        itemView: View,
        private val interaction: Interaction?
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(game: Game) = with(itemView) {
            itemView.setOnClickListener {
                interaction?.onItemSelected(adapterPosition, game)
            }

            // declare views
            val TitleText = itemView.findViewById<TextView>(R.id.SavedRow_GameTitle)
            val MessageText = itemView.findViewById<TextView>(R.id.SavedRow_GameText)
            val RowImage = itemView.findViewById<ImageView>(R.id.SavedRowGameThumbnail)

            // animation
            itemView.animation = AnimationUtils.loadAnimation(itemView.context, R.anim.slidein_and_fade)

            // bind
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
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: Game)
    }
}

