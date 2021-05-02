package com.dbtechprojects.gamedeals.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nJ\u0014\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesViewHolder;", "fragment", "Lcom/dbtechprojects/gamedeals/ui/fragments/SavedDealsFragment;", "(Lcom/dbtechprojects/gamedeals/ui/fragments/SavedDealsFragment;)V", "gamelist", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItemAtPosition", "pos", "setGameList", "list", "", "app_debug"})
public final class SavedGamesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dbtechprojects.gamedeals.ui.adapters.SavedGamesViewHolder> {
    private java.util.List<com.dbtechprojects.gamedeals.models.Game> gamelist;
    private final com.dbtechprojects.gamedeals.ui.fragments.SavedDealsFragment fragment = null;
    
    public final void setGameList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.gamedeals.models.Game> list) {
    }
    
    public final void removeItemAtPosition(int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dbtechprojects.gamedeals.ui.adapters.SavedGamesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.ui.adapters.SavedGamesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SavedGamesListAdapter(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.ui.fragments.SavedDealsFragment fragment) {
        super();
    }
}