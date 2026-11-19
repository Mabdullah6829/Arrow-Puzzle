package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbp implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11952a;

    /* JADX INFO: renamed from: b */
    public final zzini f11953b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f11954c;

    public zzdbp(zzdcq zzdcqVar, zzini zziniVar, zzini zziniVar2) {
        this.f11952a = zziniVar;
        this.f11953b = zziniVar2;
        this.f11954c = zzdcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f11952a.zzb();
        final VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f11953b).m5711a();
        final zzflg zzflgVarM5898a = this.f11954c.m5898a();
        return new zzgti() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzfkn zzfknVar = (zzfkn) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.f3483c = zzfknVar.f15883B;
                zzatVar.f3486f = zzfknVar.f15885C.toString();
                zzatVar.f3485e = versionInfoParcelM5711a.f3396s;
                zzatVar.f3484d = zzflgVarM5898a.f16043g;
                return zzatVar;
            }
        };
    }
}
