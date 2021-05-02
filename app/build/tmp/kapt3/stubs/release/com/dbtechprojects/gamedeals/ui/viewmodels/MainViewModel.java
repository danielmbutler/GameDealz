package com.dbtechprojects.gamedeals.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\tJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e0\fJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f2\u0006\u0010\u0010\u001a\u00020\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tJ\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/gamedeals/repository/DefaultRepository;", "(Lcom/dbtechprojects/gamedeals/repository/DefaultRepository;)V", "mgamelist", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "mquery", "", "getQuery", "getSearchTerm", "Landroidx/lifecycle/LiveData;", "getgames", "Lcom/dbtechprojects/gamedeals/data/Resource;", "getgamesfromDB", "title", "getgameslist", "onCleared", "", "setQuery", "query", "setgameslist", "list", "storeSearchTerm", "term", "app_release"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private java.lang.String mquery = "";
    private java.util.List<com.dbtechprojects.gamedeals.models.Game> mgamelist;
    private final com.dbtechprojects.gamedeals.repository.DefaultRepository repository = null;
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setgameslist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.gamedeals.models.Game> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dbtechprojects.gamedeals.models.Game> getgameslist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getgamesfromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.Game>>> getgames() {
        return null;
    }
    
    public final void storeSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSearchTerm() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.repository.DefaultRepository repository) {
        super();
    }
}