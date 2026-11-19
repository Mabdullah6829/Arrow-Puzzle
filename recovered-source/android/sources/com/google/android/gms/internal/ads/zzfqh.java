package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f16287a;

    /* JADX INFO: renamed from: b */
    public final zzcop f16288b;

    /* JADX INFO: renamed from: c */
    public final zzini f16289c;

    /* JADX INFO: renamed from: d */
    public final zzini f16290d;

    public zzfqh(zzcnz zzcnzVar, zzcop zzcopVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f16287a = zzcnzVar;
        this.f16288b = zzcopVar;
        this.f16289c = zzimyVar;
        this.f16290d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f16287a.m5709a();
        VersionInfoParcel versionInfoParcelM5711a = this.f16288b.m5711a();
        zzdxh zzdxhVar = (zzdxh) this.f16289c.zzb();
        new zzeiv();
        return new zzfqt(contextM5709a, versionInfoParcelM5711a, zzdxhVar, new zzcbs(), (zzcnn) this.f16290d.zzb());
    }
}
