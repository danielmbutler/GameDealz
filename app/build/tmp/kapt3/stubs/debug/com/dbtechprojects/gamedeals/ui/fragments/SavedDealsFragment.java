package com.dbtechprojects.gamedeals.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/fragments/SavedDealsFragment;", "Lcom/dbtechprojects/gamedeals/ui/fragments/BaseFragment;", "()V", "binding", "Lcom/dbtechprojects/gamedeals/databinding/FragmentSavedDealsBinding;", "savedDealsAdapter", "Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesListAdapter;", "getSavedDealsAdapter", "()Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesListAdapter;", "setSavedDealsAdapter", "(Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesListAdapter;)V", "viewModel", "Lcom/dbtechprojects/gamedeals/ui/viewmodels/SavedDealViewModel;", "getViewModel", "()Lcom/dbtechprojects/gamedeals/ui/viewmodels/SavedDealViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "deletegame", "", "game", "Lcom/dbtechprojects/gamedeals/models/Game;", "pos", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SavedDealsFragment extends com.dbtechprojects.gamedeals.ui.fragments.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.dbtechprojects.gamedeals.databinding.FragmentSavedDealsBinding binding;
    public com.dbtechprojects.gamedeals.ui.adapters.SavedGamesListAdapter savedDealsAdapter;
    
    private final com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.ui.adapters.SavedGamesListAdapter getSavedDealsAdapter() {
        return null;
    }
    
    public final void setSavedDealsAdapter(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.ui.adapters.SavedGamesListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void deletegame(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, int pos) {
    }
    
    public SavedDealsFragment() {
        super();
    }
}