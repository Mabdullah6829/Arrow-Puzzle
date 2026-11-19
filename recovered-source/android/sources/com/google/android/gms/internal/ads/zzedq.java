package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedq extends AdListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzedw f13699s;

    public zzedq(zzedw zzedwVar) {
        Objects.requireNonNull(zzedwVar);
        this.f13699s = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        this.f13699s.m6180l4(zzedw.m6178o4(loadAdError));
    }
}
