package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgym {
    /* JADX INFO: renamed from: a */
    public static void m7263a(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            m7264b(i3, objArr[i3]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7264b(int i2, Object obj) {
        if (obj == null) {
            throw new NullPointerException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
        }
    }
}
