package com.dbtechprojects.gamedeals.util;

import java.lang.System;

/**
 * Author: http://www.qaautomated.com/2016/01/how-to-test-toast-message-using-espresso.html
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\u000b"}, d2 = {"Lcom/dbtechprojects/gamedeals/util/CustomToastMatcher;", "Lorg/hamcrest/TypeSafeMatcher;", "Landroidx/test/espresso/Root;", "()V", "describeTo", "", "description", "Lorg/hamcrest/Description;", "matchesSafely", "", "item", "app_debug"})
public final class CustomToastMatcher extends org.hamcrest.TypeSafeMatcher<androidx.test.espresso.Root> {
    
    @java.lang.Override()
    public void describeTo(@org.jetbrains.annotations.Nullable()
    org.hamcrest.Description description) {
    }
    
    @java.lang.Override()
    protected boolean matchesSafely(@org.jetbrains.annotations.Nullable()
    androidx.test.espresso.Root item) {
        return false;
    }
    
    public CustomToastMatcher() {
        super();
    }
}