package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgeq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17097a;

    /* JADX INFO: renamed from: b */
    public final zzina f17098b;

    public zzgeq(zzina zzinaVar, zzina zzinaVar2) {
        this.f17097a = zzinaVar;
        this.f17098b = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ExecutorService executorService = (ExecutorService) this.f17097a.f20011a;
        zzgdq zzgdqVar = (zzgdq) this.f17098b.f20011a;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        AbstractC0271e0.m413u(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzgev(executorService, sb.toString(), zzgdqVar.m6930d0());
    }
}
