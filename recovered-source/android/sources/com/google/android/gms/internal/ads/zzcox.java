package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcox implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f10652a;

    /* JADX INFO: renamed from: b */
    public final zzini f10653b;

    public zzcox(zzcnz zzcnzVar, zzimy zzimyVar) {
        this.f10652a = zzcnzVar;
        this.f10653b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzcbg zzb() {
        Context contextM5709a = this.f10652a.m5709a();
        zzfqt zzfqtVar = (zzfqt) this.f10653b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzbup zzbupVarM5144a = zztVar.f3718r.m5144a(contextM5709a, VersionInfoParcel.m3031w(), zzfqtVar);
        zzbuj zzbujVar = zzbum.f9398a;
        zzbupVarM5144a.getClass();
        return new zzcbg(contextM5709a, zztVar.f3718r.m5144a(contextM5709a, VersionInfoParcel.m3031w(), zzfqtVar).m5148a("google.afma.sdkConstants.getSdkConstants", zzbujVar, zzbujVar), VersionInfoParcel.m3031w(), zzhcpVar);
    }
}
