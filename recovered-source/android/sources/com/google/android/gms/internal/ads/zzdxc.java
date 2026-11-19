package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxc {

    /* JADX INFO: renamed from: a */
    public final zzgcp f13237a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f13238b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f13239c = new AtomicBoolean(false);

    public zzdxc(zzgcp zzgcpVar) {
        this.f13237a = zzgcpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6078a(zzbfs zzbfsVar) {
        this.f13239c.set(true);
        synchronized (zzbfsVar.f7771a) {
            try {
                if (zzbfsVar.f7772b == null) {
                    zzbfsVar.f7772b = new zzbfq();
                }
                zzbfq zzbfqVar = zzbfsVar.f7772b;
                synchronized (zzbfqVar.f7765u) {
                    zzbfqVar.f7769y.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgcp zzgcpVar = this.f13237a;
        zzgcpVar.getClass();
        AbstractC0069y.m111j(zzgcpVar.f16975a, null, new zzgcj(zzgcpVar, null), 3);
    }
}
