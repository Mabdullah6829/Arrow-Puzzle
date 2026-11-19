package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzenu implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final Context f14324a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f14325b;

    /* JADX INFO: renamed from: c */
    public final zzcgd f14326c;

    /* JADX INFO: renamed from: d */
    public final zzfkn f14327d;

    /* JADX INFO: renamed from: e */
    public final zzclb f14328e;

    /* JADX INFO: renamed from: f */
    public final zzflg f14329f;

    /* JADX INFO: renamed from: g */
    public final zzbqa f14330g;

    /* JADX INFO: renamed from: h */
    public final boolean f14331h;

    /* JADX INFO: renamed from: i */
    public final zzekz f14332i;

    /* JADX INFO: renamed from: j */
    public final zzdzt f14333j;

    public zzenu(Context context, VersionInfoParcel versionInfoParcel, zzcgd zzcgdVar, zzfkn zzfknVar, zzclb zzclbVar, zzflg zzflgVar, boolean z, zzbqa zzbqaVar, zzekz zzekzVar, zzdzt zzdztVar) {
        this.f14324a = context;
        this.f14325b = versionInfoParcel;
        this.f14326c = zzcgdVar;
        this.f14327d = zzfknVar;
        this.f14328e = zzclbVar;
        this.f14329f = zzflgVar;
        this.f14330g = zzbqaVar;
        this.f14331h = z;
        this.f14332i = zzekzVar;
        this.f14333j = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        float f2;
        boolean z3;
        zzbqa zzbqaVar = this.f14330g;
        zzdmi zzdmiVar = (zzdmi) zzhcf.m7379m(this.f14326c);
        zzclb zzclbVar = this.f14328e;
        zzclbVar.mo5575E0(true);
        boolean z4 = this.f14331h;
        boolean z5 = false;
        boolean zM5100a = z4 ? zzbqaVar.m5100a(false) : false;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        boolean zM3210i = com.google.android.gms.ads.internal.util.zzs.m3210i(this.f14324a);
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
        zzfkn zzfknVar = this.f14327d;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zM5100a, zM3210i, z2, f3, z, zzfknVar.f15904O, false);
        if (zzddmVar != null) {
            zzddmVar.m5904K0();
        }
        zzdnl zzdnlVarMo5770h = zzdmiVar.mo5770h();
        int i2 = zzfknVar.f15906Q;
        VersionInfoParcel versionInfoParcel = this.f14325b;
        String str = zzfknVar.f15883B;
        zzfks zzfksVar = zzfknVar.f15952s;
        com.google.android.gms.ads.internal.overlay.zzn.m3014a(context, new AdOverlayInfoParcel(zzdnlVarMo5770h, zzclbVar, i2, versionInfoParcel, str, zzlVar, zzfksVar.f15993b, zzfksVar.f15992a, this.f14329f.f16043g, zzddmVar, zzfknVar.m6482b() ? this.f14332i : null, zzclbVar.mo5471g()), true, this.f14333j);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14327d;
    }
}
