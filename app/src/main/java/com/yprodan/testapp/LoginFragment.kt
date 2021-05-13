package com.yprodan.testapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.yprodan.testapp.db.DataBase
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yprodan.testapp.databinding.FragmentLoginBinding
import com.yprodan.testapp.model.LoginFragmentViewModel
import com.yprodan.testapp.model.LoginFragmentViewModelFactory

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel: LoginFragmentViewModel by viewModels {
        LoginFragmentViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vmodel = viewModel
        binding.button.setOnClickListener {
            viewModel.check()
        }
    }
}