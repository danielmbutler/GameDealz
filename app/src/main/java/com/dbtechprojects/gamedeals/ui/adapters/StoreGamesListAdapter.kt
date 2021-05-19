package com.dbtechprojects.gamedeals.ui.adapters

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
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.util.ImageUtils

class StoreGamesListAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val DIFF_CALLBACK = object : DiffUtil.ItemCallback<GameStore>() {

        override fun areItemsTheSame(oldItem: GameStore, newItem: GameStore): Boolean {
            return oldItem.gameID == newItem.gameID
        }

        override fun areContentsTheSame(oldItem: GameStore, newItem: GameStore): Boolean {
            return oldItem == newItem // something unique that will not change
        }

    }
    private val differ = AsyncListDiffer(this, DIFF_CALLBACK)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return StoreGamesViewHolder(
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
            is StoreGamesViewHolder -> {
                holder.bind(differ.currentList.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<GameStore>) {
        differ.submitList(list)
    }

    class StoreGamesViewHolder
    constructor(
        itemView: View,
        private val interaction: Interaction?
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(game: GameStore) = with(itemView) {
            itemView.setOnClickListener {
                interaction?.onItemSelected(adapterPosition, game)
            }

            itemView.animation = AnimationUtils.loadAnimation(itemView.context, R.anim.slidein_and_fade)
            val TitleText = itemView.findViewById<TextView>(R.id.SavedRow_GameTitle)
            val MessageText = itemView.findViewById<TextView>(R.id.SavedRow_GameText)
            val RowImage = itemView.findViewById<ImageView>(R.id.SavedRowGameThumbnail)


            TitleText?.text = game.title
            MessageText?.text = "$${game.salePrice}"


            //glide image

            if (game.thumb?.isNotEmpty() == true) {
                ImageUtils.loadImage(itemView.context, RowImage, game.thumb)
            }
        }
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: GameStore)
    }
}

