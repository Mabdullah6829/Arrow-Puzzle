package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaro {

    /* JADX INFO: renamed from: a */
    public final String f6769a;

    /* JADX INFO: renamed from: b */
    public final int f6770b;

    /* JADX INFO: renamed from: c */
    public final int f6771c;

    /* JADX INFO: renamed from: d */
    public int f6772d;

    /* JADX INFO: renamed from: e */
    public String f6773e;

    public zzaro(int i2, int i3, int i4) {
        this.f6769a = i2 != Integer.MIN_VALUE ? AbstractC0271e0.m402j(new StringBuilder(String.valueOf(i2).length() + 1), "/", i2) : "";
        this.f6770b = i3;
        this.f6771c = i4;
        this.f6772d = Integer.MIN_VALUE;
        this.f6773e = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m4339a() {
        int i2 = this.f6772d;
        int i3 = i2 == Integer.MIN_VALUE ? this.f6770b : i2 + this.f6771c;
        this.f6772d = i3;
        int length = String.valueOf(i3).length();
        String str = this.f6769a;
        this.f6773e = AbstractC1456a.m2447n(new StringBuilder(str.length() + length), str, i3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4340b() {
        if (this.f6772d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
