package com.dbtechprojects.gamedeals.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.databinding.FragmentGameBinding
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel
import com.dbtechprojects.gamedeals.ui.activities.SettingsActivity
import com.dbtechprojects.gamedeals.ui.adapters.GameListAdapter

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class GameFragment : BaseFragment(), GameListAdapter.Interaction {

    val viewModel: MainViewModel by viewModels()
    private lateinit var binding: FragmentGameBinding
    lateinit var gameAdapter: GameListAdapter // not private due to testing


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentGameBinding.inflate(inflater, container, false)
        val view = binding.root

        gameAdapter = GameListAdapter(this)

        viewModel.getSearchTerm().observe(viewLifecycleOwner, Observer { term ->
            if (term.isNotEmpty()) {
                binding.GameFragmentSearchBar.setText(term)
                viewModel.getgamesfromDB(term).observe(viewLifecycleOwner, Observer { games ->
                    if (games != null) {
                        binding.GameFragmentProgressBar.visibility = View.GONE
                        binding.GameFragmentPlaceholderImage.visibility = View.GONE
                        binding.GameFragmentPlaceholderText.visibility = View.GONE
                        binding.GamesRecyclerView.invalidate()
                        gameAdapter.submitList(games)
                        viewModel.setgameslist(games)
                        binding.GamesRecyclerView.apply {
                            layoutManager = LinearLayoutManager(activity)
                            adapter = gameAdapter
                        }
                    }
                })
            }


        })





        binding.GameFragementSearchButton.setOnClickListener {

            val SearchText = binding.GameFragmentSearchBar.text
            hideSoftKeyBoard(requireActivity().baseContext, view)

            viewModel.setQuery(SearchText.toString())
            if (SearchText.isNotEmpty()){
                GetGames()
            } else{
                showerror("Please enter a game title", requireView(), requireContext(), layoutInflater)
            }


        }

        return view
    }


    private fun GetGames() {

        viewModel.getgames().observe(viewLifecycleOwner, Observer { games ->
            Log.d("games found", games.data.toString())
            when (games) {
                is Resource.Loading -> {
                    binding.GameFragmentProgressBar.visibility = View.VISIBLE
                }
                is Resource.Success -> {

                    binding.GameFragmentProgressBar.visibility = View.GONE

                    binding.GameFragmentProgressBar.visibility = View.GONE
                    binding.GameFragmentPlaceholderImage.visibility = View.GONE
                    binding.GameFragmentPlaceholderText.visibility = View.GONE
                    binding.GamesRecyclerView.invalidate()
                    games.data?.let { gameAdapter.submitList(it) }
                    binding.GamesRecyclerView.apply {
                        layoutManager = LinearLayoutManager(activity)
                        adapter = gameAdapter
                    }
                    viewModel.setgameslist(games.data!!)
                    viewModel.storeSearchTerm(viewModel.getQuery())

                }
                is Resource.Error -> {
                    Log.d("Fragment", "Failure")
                    Log.d("Fragment", "${games.error?.message}")
                    showerror(
                        "No results found please try again",
                        requireView(),
                        requireContext(),
                        layoutInflater
                    )
                    binding.GameFragmentProgressBar.visibility = View.GONE
                }
            }
        })
    }

    override fun onResume() {
        super.onResume()
        Log.d("gamefragment", "onresume called")
        if (viewModel.getQuery() != "" && viewModel.getgameslist().isNotEmpty()) {
            binding.GameFragmentSearchBar.setText(viewModel.getQuery())
            binding.GameFragmentProgressBar.visibility = View.GONE
            binding.GameFragmentPlaceholderImage.visibility = View.GONE
            binding.GameFragmentPlaceholderText.visibility = View.GONE
            binding.GamesRecyclerView.invalidate()
            gameAdapter.submitList(viewModel.getgameslist())
            binding.GamesRecyclerView.apply {
                layoutManager = LinearLayoutManager(activity)
                adapter = gameAdapter
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.top_bar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        when (id) {

            R.id.action_settings -> {

                startActivity(Intent(activity, SettingsActivity::class.java))
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }


    // RV Item Click
    override fun onItemSelected(position: Int, item: Game) {

        val intent = Intent(requireContext(), GameDealActivity::class.java)
        intent.putExtra("gamedeal",item)
        startActivity(intent)

    }

}

