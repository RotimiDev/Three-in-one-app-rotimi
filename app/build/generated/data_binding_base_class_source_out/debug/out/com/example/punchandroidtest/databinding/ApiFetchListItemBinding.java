// Generated by view binder compiler. Do not edit!
package com.example.punchandroidtest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.punchandroidtest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ApiFetchListItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView realEstateCardView;

  @NonNull
  public final AppCompatImageView realEstateIv;

  @NonNull
  public final AppCompatTextView tvId;

  @NonNull
  public final AppCompatTextView tvPrice;

  @NonNull
  public final AppCompatTextView tvType;

  private ApiFetchListItemBinding(@NonNull CardView rootView, @NonNull CardView realEstateCardView,
      @NonNull AppCompatImageView realEstateIv, @NonNull AppCompatTextView tvId,
      @NonNull AppCompatTextView tvPrice, @NonNull AppCompatTextView tvType) {
    this.rootView = rootView;
    this.realEstateCardView = realEstateCardView;
    this.realEstateIv = realEstateIv;
    this.tvId = tvId;
    this.tvPrice = tvPrice;
    this.tvType = tvType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ApiFetchListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ApiFetchListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.api_fetch_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ApiFetchListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView realEstateCardView = (CardView) rootView;

      id = R.id.real_estate_iv;
      AppCompatImageView realEstateIv = ViewBindings.findChildViewById(rootView, id);
      if (realEstateIv == null) {
        break missingId;
      }

      id = R.id.tv_id;
      AppCompatTextView tvId = ViewBindings.findChildViewById(rootView, id);
      if (tvId == null) {
        break missingId;
      }

      id = R.id.tv_price;
      AppCompatTextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_type;
      AppCompatTextView tvType = ViewBindings.findChildViewById(rootView, id);
      if (tvType == null) {
        break missingId;
      }

      return new ApiFetchListItemBinding((CardView) rootView, realEstateCardView, realEstateIv,
          tvId, tvPrice, tvType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}