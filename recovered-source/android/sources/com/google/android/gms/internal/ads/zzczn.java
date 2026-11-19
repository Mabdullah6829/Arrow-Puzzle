package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzczn implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11837a;

    /* JADX INFO: renamed from: b */
    public final zzini f11838b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f11839c;

    public zzczn(zzimy zzimyVar, zzcos zzcosVar, zzdcq zzdcqVar) {
        this.f11837a = zzimyVar;
        this.f11838b = zzcosVar;
        this.f11839c = zzdcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        String string;
        Clock clock = (Clock) this.f11837a.zzb();
        zzcfp zzcfpVarZzb = ((zzcos) this.f11838b).zzb();
        String str = this.f11839c.m5898a().f16043g;
        zzcfn zzcfnVar = zzcfpVarZzb.f9928u;
        synchronized (zzcfnVar) {
            string = zzcfnVar.f9924a.toString();
            zzcfnVar.f9924a = zzcfnVar.f9924a.add(BigInteger.ONE);
            zzcfnVar.f9925b = string;
        }
        return new zzcfe(clock, zzcfpVarZzb, string, str);
    }
}
