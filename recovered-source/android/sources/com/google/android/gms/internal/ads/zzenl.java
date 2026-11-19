package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzenl implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcgd f14294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkn f14295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzenn f14296c;

    public zzenl(zzenn zzennVar, zzcgd zzcgdVar, zzfkn zzfknVar) {
        this.f14294a = zzcgdVar;
        this.f14295b = zzfknVar;
        this.f14296c = zzennVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) {
        try {
            com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzt.f3698C.f3702b;
            com.google.android.gms.ads.internal.overlay.zzn.m3014a(context, (AdOverlayInfoParcel) this.f14294a.f9959s.get(), true, this.f14296c.f14306e);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14295b;
    }
}
