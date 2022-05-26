package com.example.punchandroidtest.presentation.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.punchandroidtest.R

public class NewNoteFragmentDirections private constructor() {
  public companion object {
    public fun actionNewNoteFragment2ToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newNoteFragment2_to_homeFragment)
  }
}
