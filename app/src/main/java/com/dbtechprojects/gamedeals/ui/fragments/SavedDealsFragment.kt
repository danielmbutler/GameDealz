package com.dbtechprojects.gamedeals.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.databinding.FragmentSavedDealsBinding
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel
import com.dbtechprojects.gamedeals.ui.adapters.SavedGamesListAdapter
import com.dbtechprojects.gamedeals.util.TAG
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SavedDealsFragment : BaseFragment(), SavedGamesListAdapter.Interaction {


    private val viewModel: SavedDealViewModel by viewModels()
    private lateinit var binding: FragmentSavedDealsBinding
    lateinit var savedDealsListAdapter: SavedGamesListAdapter // not private due to testing



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSavedDealsBinding.inflate(inflater, container, false)
        val view = binding.root

        savedDealsListAdapter = SavedGamesListAdapter(this)
        savedDealsListAdapter.setOnDeleteListener(object : SavedGamesListAdapter.OnDeleteListener{

            override fun onDelete(position: Int, model: Game, view: View) {
                deleteGame(game = model, pos = position)
            }

        })


        viewModel.savedGames.observe(viewLifecycleOwner, Observer { games ->
            Log.d(TAG, "savedgames from ROOM: $games")

            if (games.isNotEmpty()){
                binding.SavedGamesPlaceHolderImage.visibility = View.GONE
                binding.textView.visibility = View.GONE
                viewModel.setGamesList(games)
                savedDealsListAdapter.submitList(games)

            } else {
                binding.SavedGamesPlaceHolderImage.visibility = View.VISIBLE
                binding.textView.visibility = View.VISIBLE
                val emptyList =  mutableListOf<Game>()
                savedDealsListAdapter.submitList(emptyList)
            }


            binding.SavedGamesRecyclerView.apply {
                layoutManager = LinearLayoutManager(activity)
                adapter = savedDealsListAdapter
            }

        })


        return view
    }

    override fun onResume() {
        super.onResume()
        // clear adapter if no games in viewModel
        if (viewModel.getGameList().isEmpty()){
            val emptyList =  mutableListOf<Game>()
            savedDealsListAdapter.submitList(emptyList)
        }

    }



    private fun deleteGame(game:Game, pos: Int){

        val builder = AlertDialog.Builder(requireContext(),R.style.MyDialogTheme)
        builder.setMessage("Are you sure ?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id ->
                game.saved = null
                savedDealsListAdapter.notifyItemRemoved(pos)
                viewModel.removeSavedDeal(game)

            }
            .setNegativeButton("No") { dialog, id ->
                // Dismiss the dialog
                dialog.dismiss()
            }
        val alert = builder.create()
        alert.show()


    }

    // RV Item Click
    override fun onItemSelected(position: Int, game: Game) {

        val intent = Intent(requireContext(), GameDealActivity::class.java)
        intent.putExtra("gamedeal", game)
        startActivity(intent)
    }


}