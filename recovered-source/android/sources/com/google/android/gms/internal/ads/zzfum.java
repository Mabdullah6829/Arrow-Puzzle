package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfum {

    /* JADX INFO: renamed from: a */
    public final Context f16574a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f16575b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f16576c;

    /* JADX INFO: renamed from: d */
    public final zzfow f16577d;

    /* JADX INFO: renamed from: e */
    public final ClientApi f16578e = new ClientApi();

    /* JADX INFO: renamed from: f */
    public final zzfmc f16579f;

    /* JADX INFO: renamed from: g */
    public final Clock f16580g;

    /* JADX INFO: renamed from: h */
    public final zzfsx f16581h;

    /* JADX INFO: renamed from: i */
    public final zzftn f16582i;

    public zzfum(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzfmc zzfmcVar, Clock clock, zzfsx zzfsxVar, zzftn zzftnVar) {
        this.f16574a = context;
        this.f16575b = versionInfoParcel;
        this.f16576c = scheduledExecutorService;
        this.f16577d = zzfowVar;
        this.f16580g = clock;
        this.f16579f = zzfmcVar;
        this.f16581h = zzfsxVar;
        this.f16582i = zzftnVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzful m6716a(com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        AdFormat adFormatM2747b = AdFormat.m2747b(zzfpVar.f3190t);
        if (adFormatM2747b == null) {
            return null;
        }
        int iOrdinal = adFormatM2747b.ordinal();
        Context context = this.f16574a;
        VersionInfoParcel versionInfoParcel = this.f16575b;
        if (iOrdinal == 1) {
            return new zzftk(this.f16578e, context, versionInfoParcel.f3398u, this.f16579f, zzfpVar, zzcbVar, this.f16576c, this.f16577d, m6717b(), this.f16580g);
        }
        if (iOrdinal == 2) {
            return new zzfuq(this.f16578e, context, versionInfoParcel.f3398u, this.f16579f, zzfpVar, zzcbVar, this.f16576c, this.f16577d, m6717b(), this.f16580g);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzftf(this.f16578e, context, versionInfoParcel.f3398u, this.f16579f, zzfpVar, zzcbVar, this.f16576c, this.f16577d, m6717b(), this.f16580g);
    }

    /* JADX INFO: renamed from: b */
    public final zzftg m6717b() {
        zzbio zzbioVar = zzbix.f8155J;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        return new zzftg(((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue(), ((Long) zzbaVar.f3098c.m5030a(zzbix.f8172K)).longValue(), this.f16580g, this.f16582i);
    }
}
