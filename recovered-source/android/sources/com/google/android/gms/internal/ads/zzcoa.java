package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoa implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcns f10632a;

    public zzcoa(zzcns zzcnsVar) {
        this.f10632a = zzcnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        WeakReference weakReference = this.f10632a.f10622d;
        zzinh.m8554a(weakReference);
        return weakReference;
    }
}
