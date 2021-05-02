package com.dbtechprojects.gamedeals.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/fragments/GameFragment;", "Lcom/dbtechprojects/gamedeals/ui/fragments/BaseFragment;", "()V", "binding", "Lcom/dbtechprojects/gamedeals/databinding/FragmentGameBinding;", "gameAdapter", "Lcom/dbtechprojects/gamedeals/ui/adapters/GameListAdapter;", "getGameAdapter", "()Lcom/dbtechprojects/gamedeals/ui/adapters/GameListAdapter;", "setGameAdapter", "(Lcom/dbtechprojects/gamedeals/ui/adapters/GameListAdapter;)V", "viewModel", "Lcom/dbtechprojects/gamedeals/ui/viewmodels/MainViewModel;", "getViewModel", "()Lcom/dbtechprojects/gamedeals/ui/viewmodels/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "GetGames", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class GameFragment extends com.dbtechprojects.gamedeals.ui.fragments.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.dbtechprojects.gamedeals.databinding.FragmentGameBinding binding;
    public com.dbtechprojects.gamedeals.ui.adapters.GameListAdapter gameAdapter;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.ui.adapters.GameListAdapter getGameAdapter() {
        return null;
    }
    
    public final void setGameAdapter(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.ui.adapters.GameListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void GetGames() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public GameFragment() {
        super();
    }
}