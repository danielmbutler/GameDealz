package com.dbtechprojects.gamedeals.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u00b3\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u000623\b\u0004\u0010\u0007\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\b2$\b\u0004\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\b2\u0014\b\u0006\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2 = {"networkBoundResource", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dbtechprojects/gamedeals/data/Resource;", "ResultType", "RequestType", "query", "Lkotlin/Function0;", "fetch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lkotlin/coroutines/Continuation;", "", "saveFetchResult", "", "shouldFetch", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "app_release"})
public final class NetworkBoundResourceKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <ResultType extends java.lang.Object, RequestType extends java.lang.Object>kotlinx.coroutines.flow.Flow<com.dbtechprojects.gamedeals.data.Resource<ResultType>> networkBoundResource(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.flow.Flow<? extends ResultType>> query, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super ResultType, ? super kotlin.coroutines.Continuation<? super RequestType>, ? extends java.lang.Object> fetch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super RequestType, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveFetchResult, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ResultType, java.lang.Boolean> shouldFetch) {
        return null;
    }
}