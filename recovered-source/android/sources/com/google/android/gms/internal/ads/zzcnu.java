package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnt f10624a;

    /* JADX INFO: renamed from: b */
    public final zzini f10625b;

    /* JADX INFO: renamed from: c */
    public final zzfto f10626c;

    /* JADX INFO: renamed from: d */
    public final zzini f10627d;

    public zzcnu(zzcnt zzcntVar, zzimy zzimyVar, zzfto zzftoVar, zzimy zzimyVar2) {
        this.f10624a = zzcntVar;
        this.f10625b = zzimyVar;
        this.f10626c = zzftoVar;
        this.f10627d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzj zzjVarZzb = this.f10624a.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10625b.zzb();
        zzftn zzftnVarZzb = this.f10626c.zzb();
        Clock clock = (Clock) this.f10627d.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8291R)).booleanValue()) {
            return new zzfsx(zzjVarZzb, scheduledExecutorService, zzftnVarZzb, clock);
        }
        return null;
    }
}
