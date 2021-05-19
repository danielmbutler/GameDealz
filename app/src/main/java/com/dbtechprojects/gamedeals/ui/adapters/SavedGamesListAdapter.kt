package com.dbtechprojects.gamedeals.ui.adapters


import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.util.ImageUtils

class SavedGamesListAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var onDeleteListener: SavedGamesListAdapter.OnDeleteListener? = null

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

        return SavedGamesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.saved_game_item,
                parent,
                false
            ),
            interaction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SavedGamesViewHolder -> {
                holder.bind(differ.currentList.get(position), onDeleteListener)
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<Game>) {
        differ.submitList(list)
    }

    class SavedGamesViewHolder
    constructor(
        itemView: View,
        private val interaction: Interaction?
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(game: Game, onDeleteListener: OnDeleteListener?) = with(itemView) {
            itemView.setOnClickListener {
                interaction?.onItemSelected(adapterPosition, game)
            }
            val TitleText = itemView.findViewById<TextView>(R.id.SavedRow_GameTitle)
            val MessageText = itemView.findViewById<TextView>(R.id.SavedRow_GameText)
            val RowImage = itemView.findViewById<ImageView>(R.id.SavedRowGameThumbnail)

            Log.d("ViewHolder", game.toString())
            Log.d("ViewHolder", game.external!!)

            TitleText?.text = game.external
            MessageText?.text = "$${game.cheapest}"


            val deletebtn = itemView.findViewById<ImageView>(R.id.SavedRow_Game_Delete)

            deletebtn.setOnClickListener {
                if (onDeleteListener != null) {
                    onDeleteListener!!.onDelete(position, game, itemView)
                }
            }

            //glide image
            val context = RowImage.context

            ImageUtils.loadImage(context, RowImage, game.thumb!!)
        }
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: Game)
    }

    fun setOnDeleteListener(onDeleteListener: OnDeleteListener) {
        this.onDeleteListener = onDeleteListener
    }

    interface OnDeleteListener {
        fun onDelete(position: Int, model: Game, view: View)
    }
}

