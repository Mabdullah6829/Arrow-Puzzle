package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13557a;

    /* JADX INFO: renamed from: b */
    public final zzcnz f13558b;

    /* JADX INFO: renamed from: c */
    public final zzcoa f13559c;

    /* JADX INFO: renamed from: d */
    public final zzini f13560d;

    /* JADX INFO: renamed from: e */
    public final zzini f13561e;

    /* JADX INFO: renamed from: f */
    public final zzini f13562f;

    /* JADX INFO: renamed from: g */
    public final zzcop f13563g;

    /* JADX INFO: renamed from: h */
    public final zzdkg f13564h;

    /* JADX INFO: renamed from: i */
    public final zzini f13565i;

    public zzecf(zzimy zzimyVar, zzcnz zzcnzVar, zzcoa zzcoaVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzcop zzcopVar, zzdkg zzdkgVar, zzimy zzimyVar5) {
        this.f13557a = zzimyVar;
        this.f13558b = zzcnzVar;
        this.f13559c = zzcoaVar;
        this.f13560d = zzimyVar2;
        this.f13561e = zzimyVar3;
        this.f13562f = zzimyVar4;
        this.f13563g = zzcopVar;
        this.f13564h = zzdkgVar;
        this.f13565i = zzimyVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Executor executor = (Executor) this.f13557a.zzb();
        Context contextM5709a = this.f13558b.m5709a();
        WeakReference weakReference = this.f13559c.f10632a.f10622d;
        zzinh.m8554a(weakReference);
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzece(executor, contextM5709a, weakReference, zzhcpVar, (zzdxk) this.f13560d.zzb(), (ScheduledExecutorService) this.f13561e.zzb(), (zzeae) this.f13562f.zzb(), this.f13563g.m5711a(), new zzdkf(this.f13564h.f12282a.zzb()), (zzfqt) this.f13565i.zzb());
    }
}
