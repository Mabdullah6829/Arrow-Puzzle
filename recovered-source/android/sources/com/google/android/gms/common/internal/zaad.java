package com.google.android.gms.common.internal;

import android.widget.Button;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes.dex */
public final class zaad extends Button {
    /* JADX INFO: renamed from: a */
    public static final int m3594a(int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i3;
        }
        if (i2 == 1) {
            return i4;
        }
        if (i2 == 2) {
            return i5;
        }
        throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 22), "Unknown color scheme: ", i2));
    }
}
