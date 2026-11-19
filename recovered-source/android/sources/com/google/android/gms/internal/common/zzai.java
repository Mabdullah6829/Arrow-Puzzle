package com.google.android.gms.internal.common;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai {
    /* JADX INFO: renamed from: a */
    public static void m9102a(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 9), "at index ", i3));
            }
        }
    }
}
