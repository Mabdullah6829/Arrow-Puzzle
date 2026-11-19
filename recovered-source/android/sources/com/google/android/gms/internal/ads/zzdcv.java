package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12059a;

    /* JADX INFO: renamed from: b */
    public final zzini f12060b;

    /* JADX INFO: renamed from: c */
    public final zzcyr f12061c;

    public zzdcv(zzimy zzimyVar, zzcop zzcopVar, zzcyr zzcyrVar) {
        this.f12059a = zzimyVar;
        this.f12060b = zzcopVar;
        this.f12061c = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f12059a.zzb();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f12060b).m5711a();
        zzfkn zzfknVarM5872a = this.f12061c.m5872a();
        new zzcdq();
        zzcdr zzcdrVar = zzfknVarM5872a.f15881A;
        if (zzcdrVar == null) {
            return null;
        }
        zzfks zzfksVar = zzfknVarM5872a.f15952s;
        return new zzcdp(context, versionInfoParcelM5711a, zzcdrVar, zzfksVar != null ? zzfksVar.f15993b : null);
    }
}
