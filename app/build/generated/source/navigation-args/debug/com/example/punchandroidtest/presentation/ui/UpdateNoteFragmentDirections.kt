package com.example.punchandroidtest.presentation.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.punchandroidtest.R

public class UpdateNoteFragmentDirections private constructor() {
  public companion object {
    public fun actionUpdateNoteFragment2ToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateNoteFragment2_to_homeFragment)
  }
}
