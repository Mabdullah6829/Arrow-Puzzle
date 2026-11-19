package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13803a;

    /* JADX INFO: renamed from: b */
    public final zzegn f13804b;

    /* JADX INFO: renamed from: c */
    public final zzeir f13805c;

    public zzefo(zzimy zzimyVar, zzegn zzegnVar, zzeir zzeirVar) {
        this.f13803a = zzimyVar;
        this.f13804b = zzegnVar;
        this.f13805c = zzeirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzefn zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13803a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzhcp zzhcpVar2 = zzcfy.f9947b;
        zzinh.m8554a(zzhcpVar2);
        Context contextM5709a = ((zzcnz) this.f13804b.f13886a).m5709a();
        zzinh.m8554a(zzhcpVar);
        return new zzefn(scheduledExecutorService, zzhcpVar, zzhcpVar2, new zzegm(contextM5709a, zzhcpVar), zzimy.m8548b(this.f13805c));
    }
}
