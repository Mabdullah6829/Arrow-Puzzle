package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsf extends Exception {

    /* JADX INFO: renamed from: s */
    public final int f20735s;

    /* JADX INFO: renamed from: t */
    public final boolean f20736t;

    /* JADX INFO: renamed from: u */
    public final zzv f20737u;

    public zzsf(int i2, zzv zzvVar, boolean z) {
        super(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 25), "AudioTrack write failed: ", i2));
        this.f20736t = z;
        this.f20735s = i2;
        this.f20737u = zzvVar;
    }
}
