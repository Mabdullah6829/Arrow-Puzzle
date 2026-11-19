package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdam implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f11896a;

    /* JADX INFO: renamed from: b */
    public final zzini f11897b;

    /* JADX INFO: renamed from: c */
    public final zzcop f11898c;

    public zzdam(zzcnz zzcnzVar, zzcop zzcopVar, zzimy zzimyVar) {
        this.f11896a = zzcnzVar;
        this.f11897b = zzimyVar;
        this.f11898c = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f11896a.m5709a();
        zzfqt zzfqtVar = (zzfqt) this.f11897b.zzb();
        VersionInfoParcel versionInfoParcelM5711a = this.f11898c.m5711a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzdal(contextM5709a, zzfqtVar, versionInfoParcelM5711a, zzhcpVar);
    }
}
