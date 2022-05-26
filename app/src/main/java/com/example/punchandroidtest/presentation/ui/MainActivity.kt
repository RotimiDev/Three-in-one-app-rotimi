package com.example.punchandroidtest.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.punchandroidtest.R
import com.example.punchandroidtest.data.roomDb.NoteDatabase
import com.example.punchandroidtest.databinding.ActivityMainBinding
import com.example.punchandroidtest.repository.NoteRepository
import com.example.punchandroidtest.viewmodel.NoteViewModel
import com.example.punchandroidtest.viewmodel.NoteViewModelProviderFactory
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel
    lateinit var viewModelFactory: NoteViewModelProviderFactory
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val noteRepository = NoteRepository(
            NoteDatabase(this)
        )
        viewModelFactory = NoteViewModelProviderFactory(application, noteRepository)
        noteViewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[NoteViewModel::class.java]

        val navFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_mainActivity) as NavHostFragment
        val navController = navFragment.navController
        binding.bottomNav.setupWithNavController(navController)

        setUpViewModel()
    }

    private fun setUpViewModel() {
        val noteRepository = NoteRepository(
            NoteDatabase(this)
        )

        val viewModelProviderFactory =
            NoteViewModelProviderFactory(
                application, noteRepository
            )

        noteViewModel = ViewModelProvider(
            this,
            viewModelProviderFactory
        )[NoteViewModel::class.java]
    }
}