package com.example.punchandroidtest.presentation.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.punchandroidtest.R
import com.example.punchandroidtest.`data`.model.Note
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToUpdateNoteFragment2(
    public val note: Note?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_updateNoteFragment2

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Note::class.java)) {
          result.putParcelable("note", this.note as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Note::class.java)) {
          result.putSerializable("note", this.note as Serializable?)
        } else {
          throw UnsupportedOperationException(Note::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToUpdateNoteFragment2(note: Note?): NavDirections =
        ActionHomeFragmentToUpdateNoteFragment2(note)

    public fun actionHomeFragmentToNewNoteFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_newNoteFragment2)
  }
}
