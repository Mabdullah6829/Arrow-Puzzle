package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzwn {

    /* JADX INFO: renamed from: a */
    public int f23038a;

    /* JADX INFO: renamed from: b */
    public final int f23039b;

    /* JADX INFO: renamed from: c */
    public zzwn f23040c;

    /* JADX INFO: renamed from: d */
    public final HashMap f23041d = new HashMap(0);

    public zzwn(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        this.f23038a = i2;
        this.f23039b = i3;
        this.f23040c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4), "Node", iIdentityHashCode);
    }
}
