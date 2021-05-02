package com.dbtechprojects.gamedeals.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007J\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/viewmodels/SavedDealViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/gamedeals/repository/MainRepository;", "(Lcom/dbtechprojects/gamedeals/repository/MainRepository;)V", "mgamelist", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "savedGames", "Landroidx/lifecycle/LiveData;", "getSavedGames", "()Landroidx/lifecycle/LiveData;", "getGameList", "onCleared", "", "removeSavedDeal", "game", "setGamesList", "list", "app_debug"})
public final class SavedDealViewModel extends androidx.lifecycle.ViewModel {
    private java.util.List<com.dbtechprojects.gamedeals.models.Game> mgamelist;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.Game>> savedGames = null;
    private final com.dbtechprojects.gamedeals.repository.MainRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getSavedGames() {
        return null;
    }
    
    public final void setGamesList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.gamedeals.models.Game> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dbtechprojects.gamedeals.models.Game> getGameList() {
        return null;
    }
    
    public final void removeSavedDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SavedDealViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.repository.MainRepository repository) {
        super();
    }
}