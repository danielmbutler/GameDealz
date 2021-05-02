// Generated by view binder compiler. Do not edit!
package com.dbtechprojects.gamedeals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.dbtechprojects.gamedeals.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button GameFragementSearchButton;

  @NonNull
  public final ConstraintLayout GameFragmentLayout;

  @NonNull
  public final ImageView GameFragmentPlaceholderImage;

  @NonNull
  public final TextView GameFragmentPlaceholderText;

  @NonNull
  public final ProgressBar GameFragmentProgressBar;

  @NonNull
  public final EditText GameFragmentSearchBar;

  @NonNull
  public final RecyclerView GamesRecyclerView;

  private FragmentGameBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button GameFragementSearchButton, @NonNull ConstraintLayout GameFragmentLayout,
      @NonNull ImageView GameFragmentPlaceholderImage,
      @NonNull TextView GameFragmentPlaceholderText, @NonNull ProgressBar GameFragmentProgressBar,
      @NonNull EditText GameFragmentSearchBar, @NonNull RecyclerView GamesRecyclerView) {
    this.rootView = rootView;
    this.GameFragementSearchButton = GameFragementSearchButton;
    this.GameFragmentLayout = GameFragmentLayout;
    this.GameFragmentPlaceholderImage = GameFragmentPlaceholderImage;
    this.GameFragmentPlaceholderText = GameFragmentPlaceholderText;
    this.GameFragmentProgressBar = GameFragmentProgressBar;
    this.GameFragmentSearchBar = GameFragmentSearchBar;
    this.GamesRecyclerView = GamesRecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_game, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.GameFragementSearchButton;
      Button GameFragementSearchButton = rootView.findViewById(id);
      if (GameFragementSearchButton == null) {
        break missingId;
      }

      ConstraintLayout GameFragmentLayout = (ConstraintLayout) rootView;

      id = R.id.GameFragmentPlaceholderImage;
      ImageView GameFragmentPlaceholderImage = rootView.findViewById(id);
      if (GameFragmentPlaceholderImage == null) {
        break missingId;
      }

      id = R.id.GameFragmentPlaceholderText;
      TextView GameFragmentPlaceholderText = rootView.findViewById(id);
      if (GameFragmentPlaceholderText == null) {
        break missingId;
      }

      id = R.id.GameFragmentProgressBar;
      ProgressBar GameFragmentProgressBar = rootView.findViewById(id);
      if (GameFragmentProgressBar == null) {
        break missingId;
      }

      id = R.id.GameFragmentSearchBar;
      EditText GameFragmentSearchBar = rootView.findViewById(id);
      if (GameFragmentSearchBar == null) {
        break missingId;
      }

      id = R.id.GamesRecyclerView;
      RecyclerView GamesRecyclerView = rootView.findViewById(id);
      if (GamesRecyclerView == null) {
        break missingId;
      }

      return new FragmentGameBinding((ConstraintLayout) rootView, GameFragementSearchButton,
          GameFragmentLayout, GameFragmentPlaceholderImage, GameFragmentPlaceholderText,
          GameFragmentProgressBar, GameFragmentSearchBar, GamesRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
