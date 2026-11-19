package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzemn implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final VersionInfoParcel f14227a;

    /* JADX INFO: renamed from: b */
    public final zzcgd f14228b;

    /* JADX INFO: renamed from: c */
    public final zzfkn f14229c;

    /* JADX INFO: renamed from: d */
    public final zzclb f14230d;

    /* JADX INFO: renamed from: e */
    public final zzflg f14231e;

    /* JADX INFO: renamed from: f */
    public final zzbqa f14232f;

    /* JADX INFO: renamed from: g */
    public final boolean f14233g;

    /* JADX INFO: renamed from: h */
    public final zzekz f14234h;

    /* JADX INFO: renamed from: i */
    public final zzdzt f14235i;

    public zzemn(VersionInfoParcel versionInfoParcel, zzcgd zzcgdVar, zzfkn zzfknVar, zzclb zzclbVar, zzflg zzflgVar, boolean z, zzbqa zzbqaVar, zzekz zzekzVar, zzdzt zzdztVar) {
        this.f14227a = versionInfoParcel;
        this.f14228b = zzcgdVar;
        this.f14229c = zzfknVar;
        this.f14230d = zzclbVar;
        this.f14231e = zzflgVar;
        this.f14233g = z;
        this.f14232f = zzbqaVar;
        this.f14234h = zzekzVar;
        this.f14235i = zzdztVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        float f2;
        boolean z3;
        zzflg zzflgVar = this.f14231e;
        zzbqa zzbqaVar = this.f14232f;
        zzcvd zzcvdVar = (zzcvd) zzhcf.m7379m(this.f14228b);
        zzclb zzclbVar = this.f14230d;
        zzclbVar.mo5575E0(true);
        boolean z4 = this.f14233g;
        boolean zM5100a = z4 ? zzbqaVar.m5100a(true) : true;
        boolean z5 = false;
        if (z4) {
            synchronized (zzbqaVar) {
                z3 = zzbqaVar.f9250b;
            }
            if (z3) {
                z5 = true;
                z2 = z5;
            } else {
                z2 = false;
                z5 = true;
            }
        } else {
            z2 = z5;
        }
        if (z5) {
            synchronized (zzbqaVar) {
                f2 = zzbqaVar.f9251c;
            }
        } else {
            f2 = 0.0f;
        }
        float f3 = f2;
        zzfkn zzfknVar = this.f14229c;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zM5100a, true, z2, f3, z, zzfknVar.f15904O, false);
        if (zzddmVar != null) {
            zzddmVar.m5904K0();
        }
        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzt.f3698C.f3702b;
        zzdnl zzdnlVarMo5739i = zzcvdVar.mo5739i();
        int i2 = zzfknVar.f15906Q;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzflgVar.f16047k;
            if (zzxVar == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i4 = zzxVar.f3277s;
                if (i4 == 1) {
                    i2 = 7;
                } else if (i4 == 2) {
                    i2 = 6;
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.f14227a;
        int i6 = i2;
        String str = zzfknVar.f15883B;
        zzfks zzfksVar = zzfknVar.f15952s;
        com.google.android.gms.ads.internal.overlay.zzn.m3014a(context, new AdOverlayInfoParcel(zzdnlVarMo5739i, zzclbVar, i6, versionInfoParcel, str, zzlVar, zzfksVar.f15993b, zzfksVar.f15992a, zzflgVar.f16043g, zzddmVar, zzfknVar.m6482b() ? this.f14234h : null, zzclbVar.mo5471g()), true, this.f14235i);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14229c;
    }
}
