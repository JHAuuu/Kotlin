package com.example.pocketspendy.ui
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.pocketspendy.databinding.FragmentActivityBinding
import com.example.pocketspendy.databinding.FragmentTimelineBinding
import com.example.pocketspendy.databinding.FragmentWalletsBinding

class WalletsFragment : Fragment() {
    private lateinit var binding: FragmentWalletsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWalletsBinding.inflate(inflater, container, false)
        return binding.root
    }
}