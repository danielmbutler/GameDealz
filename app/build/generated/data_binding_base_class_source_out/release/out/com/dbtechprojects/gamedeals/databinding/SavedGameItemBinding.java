// Generated by view binder compiler. Do not edit!
package com.dbtechprojects.gamedeals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.dbtechprojects.gamedeals.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SavedGameItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView SavedRowGameDelete;

  @NonNull
  public final TextView SavedRowGameText;

  @NonNull
  public final ImageView SavedRowGameThumbnail;

  @NonNull
  public final TextView SavedRowGameTitle;

  private SavedGameItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView SavedRowGameDelete, @NonNull TextView SavedRowGameText,
      @NonNull ImageView SavedRowGameThumbnail, @NonNull TextView SavedRowGameTitle) {
    this.rootView = rootView;
    this.SavedRowGameDelete = SavedRowGameDelete;
    this.SavedRowGameText = SavedRowGameText;
    this.SavedRowGameThumbnail = SavedRowGameThumbnail;
    this.SavedRowGameTitle = SavedRowGameTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SavedGameItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SavedGameItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.saved_game_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SavedGameItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SavedRow_Game_Delete;
      ImageView SavedRowGameDelete = rootView.findViewById(id);
      if (SavedRowGameDelete == null) {
        break missingId;
      }

      id = R.id.SavedRow_GameText;
      TextView SavedRowGameText = rootView.findViewById(id);
      if (SavedRowGameText == null) {
        break missingId;
      }

      id = R.id.SavedRowGameThumbnail;
      ImageView SavedRowGameThumbnail = rootView.findViewById(id);
      if (SavedRowGameThumbnail == null) {
        break missingId;
      }

      id = R.id.SavedRow_GameTitle;
      TextView SavedRowGameTitle = rootView.findViewById(id);
      if (SavedRowGameTitle == null) {
        break missingId;
      }

      return new SavedGameItemBinding((ConstraintLayout) rootView, SavedRowGameDelete,
          SavedRowGameText, SavedRowGameThumbnail, SavedRowGameTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
