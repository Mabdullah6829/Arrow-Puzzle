package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeob implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14368a;

    /* JADX INFO: renamed from: b */
    public final zzini f14369b;

    /* JADX INFO: renamed from: c */
    public final zzina f14370c;

    public zzeob(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14368a = zziniVar;
        this.f14369b = zziniVar2;
        this.f14370c = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f14368a.zzb();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f14369b).m5711a();
        zzdno zzdnoVar = (zzdno) this.f14370c.f20011a;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzeoa(context, versionInfoParcelM5711a, zzdnoVar, zzhcpVar);
    }
}
