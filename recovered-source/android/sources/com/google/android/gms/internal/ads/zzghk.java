package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghk implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17277a;

    public zzghk(zzina zzinaVar) {
        this.f17277a = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.f17277a.f20011a).getResources().getDisplayMetrics();
        zzinh.m8554a(displayMetrics);
        return displayMetrics;
    }
}
