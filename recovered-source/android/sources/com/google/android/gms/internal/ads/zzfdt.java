package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15518a;

    /* JADX INFO: renamed from: b */
    public final zzini f15519b;

    /* JADX INFO: renamed from: c */
    public final zzfez f15520c;

    /* JADX INFO: renamed from: d */
    public final zzffa f15521d;

    /* JADX INFO: renamed from: e */
    public final zzffb f15522e;

    public zzfdt(zzcnz zzcnzVar, zzimy zzimyVar, zzfez zzfezVar, zzffa zzffaVar, zzffb zzffbVar) {
        this.f15518a = zzcnzVar;
        this.f15519b = zzimyVar;
        this.f15520c = zzfezVar;
        this.f15521d = zzffaVar;
        this.f15522e = zzffbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfdr zzb() {
        zzcfc zzcfcVar = new zzcfc();
        Context contextM5709a = ((zzcnz) this.f15518a).m5709a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15519b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfdr(zzcfcVar, contextM5709a, scheduledExecutorService, zzhcpVar, this.f15520c.f15564a.f15562b, this.f15521d.f15565a.f15561a.f9680D, this.f15522e.f15566a.f15561a.f9679C);
    }
}
