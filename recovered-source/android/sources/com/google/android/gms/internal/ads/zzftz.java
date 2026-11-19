package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftz implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzful f16531s;

    public zzftz(zzful zzfulVar) {
        Objects.requireNonNull(zzfulVar);
        this.f16531s = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16531s.m6714v();
    }
}
