// Generated by view binder compiler. Do not edit!
package com.example.punchandroidtest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.punchandroidtest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final EditText etNoteBody;

  @NonNull
  public final EditText etNoteTitle;

  private FragmentNewNoteBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView2,
      @NonNull EditText etNoteBody, @NonNull EditText etNoteTitle) {
    this.rootView = rootView;
    this.cardView2 = cardView2;
    this.etNoteBody = etNoteBody;
    this.etNoteTitle = etNoteTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_new_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.etNoteBody;
      EditText etNoteBody = ViewBindings.findChildViewById(rootView, id);
      if (etNoteBody == null) {
        break missingId;
      }

      id = R.id.etNoteTitle;
      EditText etNoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (etNoteTitle == null) {
        break missingId;
      }

      return new FragmentNewNoteBinding((ConstraintLayout) rootView, cardView2, etNoteBody,
          etNoteTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
