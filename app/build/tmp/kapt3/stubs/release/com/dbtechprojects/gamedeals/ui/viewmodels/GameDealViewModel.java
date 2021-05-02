package com.dbtechprojects.gamedeals.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/viewmodels/GameDealViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/gamedeals/repository/DefaultRepository;", "(Lcom/dbtechprojects/gamedeals/repository/DefaultRepository;)V", "savedGames", "Landroidx/lifecycle/LiveData;", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "getSavedGames", "()Landroidx/lifecycle/LiveData;", "saveGameDeal", "", "game", "app_release"})
public final class GameDealViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.Game>> savedGames = null;
    private final com.dbtechprojects.gamedeals.repository.DefaultRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getSavedGames() {
        return null;
    }
    
    public final void saveGameDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public GameDealViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.repository.DefaultRepository repository) {
        super();
    }
}