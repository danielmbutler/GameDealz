package com.dbtechprojects.gamedeals.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/dbtechprojects/gamedeals/ui/activities/MainActivity;", "Lcom/dbtechprojects/gamedeals/ui/activities/BaseActivity;", "()V", "connectionLiveData", "Lcom/dbtechprojects/gamedeals/util/ConnectionLiveData;", "getConnectionLiveData", "()Lcom/dbtechprojects/gamedeals/util/ConnectionLiveData;", "setConnectionLiveData", "(Lcom/dbtechprojects/gamedeals/util/ConnectionLiveData;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.dbtechprojects.gamedeals.ui.activities.BaseActivity {
    public com.dbtechprojects.gamedeals.util.ConnectionLiveData connectionLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.util.ConnectionLiveData getConnectionLiveData() {
        return null;
    }
    
    public final void setConnectionLiveData(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.util.ConnectionLiveData p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}