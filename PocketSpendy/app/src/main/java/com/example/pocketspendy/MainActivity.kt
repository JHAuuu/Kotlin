package com.example.pocketspendy


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pocketspendy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val nav by lazy { supportFragmentManager.findFragmentById(R.id.host)!!.findNavController() }

    private lateinit var abc: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        abc = AppBarConfiguration(
            setOf(
                R.id.timelineFragment,
                R.id.walletsFragment,
                R.id.budgetsFragment,
                R.id.activityFragment,
                R.id.moreFragment
            ),
            binding.root
        )

        setupActionBarWithNavController(nav)
        binding.bv.setupWithNavController(nav)





    }

    override fun onSupportNavigateUp(): Boolean {
        return nav.navigateUp(abc)
    }

}