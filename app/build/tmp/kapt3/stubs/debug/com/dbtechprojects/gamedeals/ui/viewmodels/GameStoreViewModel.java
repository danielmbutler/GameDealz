package com.dbtechprojects.gamedeals.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bJ\u0006\u0010\f\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0014\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/viewmodels/GameStoreViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/gamedeals/repository/MainRepository;", "(Lcom/dbtechprojects/gamedeals/repository/MainRepository;)V", "mgamelist", "", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "mquery", "", "getLastThirtyStoreDeals", "Landroidx/lifecycle/LiveData;", "getQuery", "getstoredeallist", "getstoredeals", "Lcom/dbtechprojects/gamedeals/data/Resource;", "setQuery", "", "query", "setgameslist", "list", "app_debug"})
public final class GameStoreViewModel extends androidx.lifecycle.ViewModel {
    private java.lang.String mquery = "";
    private java.util.List<com.dbtechprojects.gamedeals.models.GameStore> mgamelist;
    private final com.dbtechprojects.gamedeals.repository.MainRepository repository = null;
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setgameslist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.gamedeals.models.GameStore> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dbtechprojects.gamedeals.models.GameStore> getstoredeallist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>>> getstoredeals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> getLastThirtyStoreDeals() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public GameStoreViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.repository.MainRepository repository) {
        super();
    }
}