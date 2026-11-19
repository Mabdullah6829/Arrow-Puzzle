package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabh {

    /* JADX INFO: renamed from: a */
    public final int f21913a;

    /* JADX INFO: renamed from: b */
    public final zzza f21914b;

    public zzabh(zzza zzzaVar, int i2) {
        if (zzzaVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 15), "invalid index: ", i2));
        }
        this.f21913a = i2;
        this.f21914b = zzzaVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9326a(zzyy zzyyVar, Object obj);
}
