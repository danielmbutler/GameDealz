package com.dbtechprojects.gamedeals.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/dbtechprojects/gamedeals/util/OverridableLazy;", "T", "Lkotlin/Lazy;", "implementation", "(Lkotlin/Lazy;)V", "getImplementation", "()Lkotlin/Lazy;", "setImplementation", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "app_debug"})
public final class OverridableLazy<T extends java.lang.Object> implements kotlin.Lazy<T> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.Lazy<? extends T> implementation;
    
    @java.lang.Override()
    public T getValue() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Lazy<T> getImplementation() {
        return null;
    }
    
    public final void setImplementation(@org.jetbrains.annotations.NotNull()
    kotlin.Lazy<? extends T> p0) {
    }
    
    public OverridableLazy(@org.jetbrains.annotations.NotNull()
    kotlin.Lazy<? extends T> implementation) {
        super();
    }
}