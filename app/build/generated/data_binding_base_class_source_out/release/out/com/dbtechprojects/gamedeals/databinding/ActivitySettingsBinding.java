// Generated by view binder compiler. Do not edit!
package com.dbtechprojects.gamedeals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.dbtechprojects.gamedeals.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SettingsCacheTitle;

  @NonNull
  public final TextView SettingsClearCacheTXT;

  @NonNull
  public final CheckBox SettingsClearSGCBX;

  @NonNull
  public final TextView SettingsClearSGTXT;

  @NonNull
  public final Button SettingsConfirmBTN;

  @NonNull
  public final Button SettingsHelpButton;

  @NonNull
  public final CheckBox settingsClearCacheCBX;

  @NonNull
  public final Toolbar toolbar;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView SettingsCacheTitle, @NonNull TextView SettingsClearCacheTXT,
      @NonNull CheckBox SettingsClearSGCBX, @NonNull TextView SettingsClearSGTXT,
      @NonNull Button SettingsConfirmBTN, @NonNull Button SettingsHelpButton,
      @NonNull CheckBox settingsClearCacheCBX, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.SettingsCacheTitle = SettingsCacheTitle;
    this.SettingsClearCacheTXT = SettingsClearCacheTXT;
    this.SettingsClearSGCBX = SettingsClearSGCBX;
    this.SettingsClearSGTXT = SettingsClearSGTXT;
    this.SettingsConfirmBTN = SettingsConfirmBTN;
    this.SettingsHelpButton = SettingsHelpButton;
    this.settingsClearCacheCBX = settingsClearCacheCBX;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SettingsCacheTitle;
      TextView SettingsCacheTitle = rootView.findViewById(id);
      if (SettingsCacheTitle == null) {
        break missingId;
      }

      id = R.id.SettingsClearCacheTXT;
      TextView SettingsClearCacheTXT = rootView.findViewById(id);
      if (SettingsClearCacheTXT == null) {
        break missingId;
      }

      id = R.id.SettingsClearSGCBX;
      CheckBox SettingsClearSGCBX = rootView.findViewById(id);
      if (SettingsClearSGCBX == null) {
        break missingId;
      }

      id = R.id.SettingsClearSGTXT;
      TextView SettingsClearSGTXT = rootView.findViewById(id);
      if (SettingsClearSGTXT == null) {
        break missingId;
      }

      id = R.id.SettingsConfirmBTN;
      Button SettingsConfirmBTN = rootView.findViewById(id);
      if (SettingsConfirmBTN == null) {
        break missingId;
      }

      id = R.id.SettingsHelpButton;
      Button SettingsHelpButton = rootView.findViewById(id);
      if (SettingsHelpButton == null) {
        break missingId;
      }

      id = R.id.settingsClearCacheCBX;
      CheckBox settingsClearCacheCBX = rootView.findViewById(id);
      if (settingsClearCacheCBX == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, SettingsCacheTitle,
          SettingsClearCacheTXT, SettingsClearSGCBX, SettingsClearSGTXT, SettingsConfirmBTN,
          SettingsHelpButton, settingsClearCacheCBX, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
