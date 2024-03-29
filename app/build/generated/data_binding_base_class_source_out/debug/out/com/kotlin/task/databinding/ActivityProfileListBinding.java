// Generated by view binder compiler. Do not edit!
package com.kotlin.task.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kotlin.task.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout latLong;

  @NonNull
  public final TextView latitudeLong;

  @NonNull
  public final ConstraintLayout line;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final ProgressBar progressDialog;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ImageView weatherAirImg;

  private ActivityProfileListBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout latLong, @NonNull TextView latitudeLong,
      @NonNull ConstraintLayout line, @NonNull ProgressBar progress,
      @NonNull ProgressBar progressDialog, @NonNull RecyclerView recyclerView,
      @NonNull Toolbar toolbar, @NonNull ImageView weatherAirImg) {
    this.rootView = rootView;
    this.latLong = latLong;
    this.latitudeLong = latitudeLong;
    this.line = line;
    this.progress = progress;
    this.progressDialog = progressDialog;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
    this.weatherAirImg = weatherAirImg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lat_long;
      ConstraintLayout latLong = ViewBindings.findChildViewById(rootView, id);
      if (latLong == null) {
        break missingId;
      }

      id = R.id.latitude_long;
      TextView latitudeLong = ViewBindings.findChildViewById(rootView, id);
      if (latitudeLong == null) {
        break missingId;
      }

      id = R.id.line;
      ConstraintLayout line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.progress;
      ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.progressDialog;
      ProgressBar progressDialog = ViewBindings.findChildViewById(rootView, id);
      if (progressDialog == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.weather_air_img;
      ImageView weatherAirImg = ViewBindings.findChildViewById(rootView, id);
      if (weatherAirImg == null) {
        break missingId;
      }

      return new ActivityProfileListBinding((ConstraintLayout) rootView, latLong, latitudeLong,
          line, progress, progressDialog, recyclerView, toolbar, weatherAirImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
