package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzctj implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfsm f11368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv f11370c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzctq f11371d;

    public zzctj(zzctq zzctqVar, zzfsm zzfsmVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.f11368a = zzfsmVar;
        this.f11369b = str;
        this.f11370c = zzvVar;
        Objects.requireNonNull(zzctqVar);
        this.f11371d = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f11370c;
        final zzfsm zzfsmVar = this.f11368a;
        this.f11371d.f11389e.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsmVar.m6643b(str, zzvVar, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(final Throwable th) {
        final String str = this.f11369b;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f11370c;
        final zzfsm zzfsmVar = this.f11368a;
        this.f11371d.f11389e.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8167Jb)).booleanValue();
                Throwable th2 = th;
                zzctj zzctjVar = this.f11363s;
                if (zBooleanValue) {
                    zzctq zzctqVar = zzctjVar.f11371d;
                    zzcah zzcahVarM5288e = zzcaf.m5288e(zzctqVar.f11385a);
                    zzctqVar.f11393i = zzcahVarM5288e;
                    zzcahVarM5288e.mo5291a("AttributionReporting.registerSourceAndPingClickUrl", th2);
                } else {
                    zzctq zzctqVar2 = zzctjVar.f11371d;
                    zzcah zzcahVarM5286c = zzcaf.m5286c(zzctqVar2.f11385a);
                    zzctqVar2.f11392h = zzcahVarM5286c;
                    zzcahVarM5286c.mo5291a("AttributionReportingSampled.registerSourceAndPingClickUrl", th2);
                }
                zzfsmVar.m6643b(str, zzvVar, null, null);
            }
        });
    }
}
