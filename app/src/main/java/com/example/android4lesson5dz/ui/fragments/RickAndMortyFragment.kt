package com.example.android4lesson5dz.ui.fragments

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4lesson5dz.R
import com.example.android4lesson5dz.base.BaseFragment
import com.example.android4lesson5dz.databinding.FragmentRickAndMortyBinding
import com.example.android4lesson5dz.ui.adapter.RickAndMortyAdapter
import com.example.android4lesson5dz.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RickAndMortyFragment :
    BaseFragment<FragmentRickAndMortyBinding, RickAndMortyViewModel>(R.layout.fragment_rick_and_morty) {

    override val binding by viewBinding(FragmentRickAndMortyBinding::bind)
    override val viewModel: RickAndMortyViewModel by viewModels()
    private var rickAndMortyAdapter = RickAndMortyAdapter()

    override fun initialize() {
        binding.recycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = rickAndMortyAdapter
        }

        subscribeToGetData()
    }

    private fun subscribeToGetData() {
        viewModel.noteLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {}
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    rickAndMortyAdapter.submitList(it.data)
                }
            }
        }
    }
}