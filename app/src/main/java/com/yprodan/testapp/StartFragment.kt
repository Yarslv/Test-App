package com.yprodan.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.yprodan.testapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    companion object{
        private const val NUMBER_OF_TABS = 2
    }

    private lateinit var binding: FragmentStartBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tabsViewPager.adapter =
                TabsAdapter(
                    childFragmentManager,
                    lifecycle,
                    NUMBER_OF_TABS
                )
            TabLayoutMediator(tabLayout, tabsViewPager)
            { tab, position ->
                when (position) {
                    0 -> tab.text = "Login"
                    1 -> tab.text = "Register"
                }
            }.attach()
        }
    }
}
class TabsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, private val counts: Int) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return counts
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LoginFragment()

            else -> RegisterFragment()
        }
    }
}