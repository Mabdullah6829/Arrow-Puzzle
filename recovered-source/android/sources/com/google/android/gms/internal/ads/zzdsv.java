package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsv {

    /* JADX INFO: renamed from: a */
    public final zzhcp f12846a;

    /* JADX INFO: renamed from: b */
    public final zzdtk f12847b;

    /* JADX INFO: renamed from: c */
    public final zzdtp f12848c;

    /* JADX INFO: renamed from: d */
    public final zzdzo f12849d;

    public zzdsv(zzhcp zzhcpVar, zzdtk zzdtkVar, zzdtp zzdtpVar, zzdzo zzdzoVar) {
        this.f12846a = zzhcpVar;
        this.f12847b = zzdtkVar;
        this.f12848c = zzdtpVar;
        this.f12849d = zzdzoVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6048a(ListenableFuture listenableFuture, zzdzc zzdzcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
            listenableFuture.addListener(new zzhcd(listenableFuture, new zzdss(this, zzdzcVar)), this.f12846a);
        }
    }
}
