package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zza implements OnSuccessListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ OnTokenCanceledListener f23219s;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.f23219s = onTokenCanceledListener;
        Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((zzs) this.f23219s).f23267a.f23216a.m10788d();
    }
}
