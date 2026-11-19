package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcft {

    /* JADX INFO: renamed from: a */
    public zzhcp f9935a;

    /* JADX INFO: renamed from: b */
    public zzdzt f9936b;

    /* JADX INFO: renamed from: c */
    public Context f9937c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f9938d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f9939e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public long f9940f = -1;

    /* JADX INFO: renamed from: g */
    public long f9941g = -1;

    /* JADX INFO: renamed from: a */
    public final void m5393a(zzhcp zzhcpVar, zzdzt zzdztVar, Context context) {
        if (this.f9938d.getAndSet(true)) {
            return;
        }
        this.f9935a = zzhcpVar;
        this.f9936b = zzdztVar;
        zzbio zzbioVar = zzbix.f8655mf;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f9940f = ((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue();
        this.f9941g = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8672nf)).longValue();
        this.f9937c = context;
    }
}
