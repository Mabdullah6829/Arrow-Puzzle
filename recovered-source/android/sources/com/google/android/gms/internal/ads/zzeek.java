package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeek implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f13749a;

    /* JADX INFO: renamed from: b */
    public final zzcop f13750b;

    public zzeek(zzcnz zzcnzVar, zzcop zzcopVar) {
        this.f13749a = zzcnzVar;
        this.f13750b = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f13749a.m5709a();
        VersionInfoParcel versionInfoParcelM5711a = this.f13750b.m5711a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzeej(contextM5709a, versionInfoParcelM5711a, zzhcpVar);
    }
}
