package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzeny implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final zzfkn f14354a;

    /* JADX INFO: renamed from: b */
    public final zzbxi f14355b;

    /* JADX INFO: renamed from: c */
    public final AdFormat f14356c;

    /* JADX INFO: renamed from: d */
    public zzddr f14357d = null;

    public zzeny(zzfkn zzfknVar, zzbxi zzbxiVar, AdFormat adFormat) {
        this.f14354a = zzfknVar;
        this.f14355b = zzbxiVar;
        this.f14356c = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        boolean zMo5243Z3;
        try {
            int iOrdinal = this.f14356c.ordinal();
            zzbxi zzbxiVar = this.f14355b;
            if (iOrdinal == 1) {
                zMo5243Z3 = zzbxiVar.mo5243Z3(new ObjectWrapper(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zMo5243Z3 = zzbxiVar.mo5241T(new ObjectWrapper(context));
                    }
                    throw new zzdnv("Adapter failed to show.");
                }
                zMo5243Z3 = zzbxiVar.mo5248e3(new ObjectWrapper(context));
            }
            if (zMo5243Z3) {
                zzddr zzddrVar = this.f14357d;
                if (zzddrVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8490d2)).booleanValue() || this.f14354a.f15914Y != 2) {
                    return;
                }
                zzddrVar.m5905u();
                return;
            }
            throw new zzdnv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdnv(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14354a;
    }
}
