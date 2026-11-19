package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcny implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f10630a;

    public zzcny(zzcnz zzcnzVar) {
        this.f10630a = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = this.f10630a.m5709a().getApplicationInfo();
        zzinh.m8554a(applicationInfo);
        return applicationInfo;
    }
}
