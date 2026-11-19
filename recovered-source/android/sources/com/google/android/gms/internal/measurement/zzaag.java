package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaag extends zzzf {

    /* JADX INFO: renamed from: a */
    public final String f21859a;

    public zzaag(String str) {
        this.f21859a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: a */
    public final String mo9308a() {
        return this.f21859a;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: d */
    public void mo9309d(RuntimeException runtimeException, zzxz zzxzVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
