package com.dbtechprojects.gamedeals.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dbtechprojects/gamedeals/ui/adapters/SavedGamesViewHolder;", "list", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "context", "Landroid/content/Context;", "fragment", "Lcom/dbtechprojects/gamedeals/ui/fragments/SavedDealsFragment;", "(Ljava/util/List;Landroid/content/Context;Lcom/dbtechprojects/gamedeals/ui/fragments/SavedDealsFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"})
public final class SavedGamesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dbtechprojects.gamedeals.ui.adapters.SavedGamesViewHolder> {
    private java.util.List<com.dbtechprojects.gamedeals.models.Game> list;
    private final android.content.Context context = null;
    private final com.dbtechprojects.gamedeals.ui.fragments.SavedDealsFragment fragment = null;
    
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
    java.util.List<com.dbtechprojects.gamedeals.models.Game> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.ui.fragments.SavedDealsFragment fragment) {
        super();
    }
}