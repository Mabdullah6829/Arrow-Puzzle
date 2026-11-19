package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqw extends Exception {

    /* JADX INFO: renamed from: s */
    public final int f20665s;

    /* JADX INFO: renamed from: t */
    public final boolean f20666t;

    public zzqw(int i2, boolean z) {
        super(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 26), "AudioOutput write failed: ", i2));
        this.f20666t = z;
        this.f20665s = i2;
    }
}
