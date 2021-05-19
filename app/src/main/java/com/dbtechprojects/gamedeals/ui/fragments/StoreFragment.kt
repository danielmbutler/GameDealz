package com.dbtechprojects.gamedeals.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.databinding.FragmentStoreBinding
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.models.Mapper
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity
import com.dbtechprojects.gamedeals.ui.viewmodels.GameStoreViewModel
import com.dbtechprojects.gamedeals.ui.adapters.StoreGamesListAdapter
import com.dbtechprojects.gamedeals.util.Constants
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StoreFragment : BaseFragment(), StoreGamesListAdapter.Interaction {


    private val viewModel: GameStoreViewModel by viewModels()
    private lateinit var binding: FragmentStoreBinding
    lateinit var storeAdapter: StoreGamesListAdapter // public due to testing


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        storeAdapter = StoreGamesListAdapter(this)
        binding = FragmentStoreBinding.inflate(inflater, container, false)
        val view = binding.root


        viewModel.getLastThirtyStoreDeals().observe(viewLifecycleOwner, Observer { cache ->
            if(cache.isNotEmpty()){
                binding.StoreFragmentProgressBar.visibility = View.GONE
                binding.StorefragmentPlaceholderImage.visibility = View.GONE
                binding.StoreFragmentPlaceholderTV.visibility = View.GONE
                binding.StoreFramgnetRecyclerView.invalidate()
                val list = cache.reversed()
                storeAdapter.submitList(list)
                binding.StoreFramgnetRecyclerView.apply {
                    layoutManager = LinearLayoutManager(activity)
                    adapter = storeAdapter
                }
            }
        })


        val chipGroup: ChipGroup = binding.StoreFragmentchipGroup


        chipGroup.setOnCheckedChangeListener { chipGroup, i ->
            try {
                val chip: Chip = chipGroup.findViewById(i)
                if (chip != null) {
                    val StoreId = Constants.returnStore(chip.text.toString())
                    if (StoreId != null) {
                        viewModel.setQuery(StoreId)
                        getStoreDeals()
                    }
                }

            } catch (e: NullPointerException){
                println("chip is null")
            }

        }

        return view
    }

    private fun getStoreDeals() {


        viewModel.getstoredeals().observe(viewLifecycleOwner, Observer { result ->
            when (result) {
                is Resource.Loading -> {
                    binding.StoreFragmentProgressBar.visibility = View.VISIBLE
                }
                is Resource.Success -> {
                    binding.StoreFragmentProgressBar.visibility = View.GONE
                        binding.StoreFragmentPlaceholderTV.visibility = View.GONE
                        binding.StorefragmentPlaceholderImage.visibility = View.GONE
                        binding.StoreFramgnetRecyclerView.invalidate()
                        storeAdapter.submitList(result.data!!)
                        binding.StoreFramgnetRecyclerView.apply {
                            layoutManager = LinearLayoutManager(activity)
                            adapter = storeAdapter
                        }
                        viewModel.setgameslist(result.data)
                }
                is Resource.Error -> {
                    Log.d("StoreActivity", result.error?.message.toString())
                    binding.StoreFragmentProgressBar.visibility = View.GONE
                    showerror(
                        "No results found please try again",
                        requireView(),
                        requireContext(),
                        layoutInflater
                    )

                }
                else -> {
                    println(result)
                    binding.StoreFragmentProgressBar.visibility = View.GONE
                    }
                }
            }
        )
    }




    override fun onResume() {
        super.onResume()
        if (viewModel.getQuery() != "" && viewModel.getstoredeallist().isNotEmpty()){
            binding.StoreFragmentProgressBar.visibility = View.GONE
            binding.StorefragmentPlaceholderImage.visibility = View.GONE
            binding.StoreFragmentPlaceholderTV.visibility = View.GONE
            binding.StoreFramgnetRecyclerView.invalidate()
            storeAdapter.submitList(viewModel.getstoredeallist())
            binding.StoreFramgnetRecyclerView.apply {
                layoutManager = LinearLayoutManager(activity)
                adapter = storeAdapter
            }

        }
    }

    // on RV Item Click
    override fun onItemSelected(position: Int, game: GameStore) {
        val converted = Mapper().GameStoreToGame(game)
        val intent = Intent(requireContext(), GameDealActivity::class.java)
        intent.putExtra("gamedeal", converted)
        startActivity(intent)
    }

}


