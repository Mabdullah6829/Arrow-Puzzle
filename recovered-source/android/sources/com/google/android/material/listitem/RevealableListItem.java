package com.google.android.material.listitem;

import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public interface RevealableListItem {
    public static final int PRIMARY_ACTION_SWIPE_DIRECT = 2;
    public static final int PRIMARY_ACTION_SWIPE_DISABLED = 0;
    public static final int PRIMARY_ACTION_SWIPE_INDIRECT = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface PrimaryActionSwipeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface RevealGravity {
    }

    @Px
    int getIntrinsicWidth();

    int getPrimaryActionSwipeMode();

    void setPrimaryActionSwipeMode(int i2);

    void setRevealedWidth(@Px int i2);
}
