package com.google.android.material.listitem;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public interface SwipeableListItem {
    public static final int STATE_CLOSED = 3;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_OPEN = 4;
    public static final int STATE_SETTLING = 2;
    public static final int STATE_SWIPE_PRIMARY_ACTION = 5;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableSwipeState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SwipeState {
    }

    int getSwipeMaxOvershoot();

    boolean isSwipeEnabled();

    void onSwipe(int i2);

    <T extends View & RevealableListItem> void onSwipeStateChanged(int i2, @NonNull T t, int i3);

    void setSwipeEnabled(boolean z);
}
