package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzeqj implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final Context f14616a;

    /* JADX INFO: renamed from: b */
    public final zzdwq f14617b;

    /* JADX INFO: renamed from: c */
    public final zzflg f14618c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f14619d;

    /* JADX INFO: renamed from: e */
    public final zzfkn f14620e;

    /* JADX INFO: renamed from: f */
    public final zzcgd f14621f;

    /* JADX INFO: renamed from: g */
    public final zzclb f14622g;

    /* JADX INFO: renamed from: h */
    public final zzbqa f14623h;

    /* JADX INFO: renamed from: i */
    public final boolean f14624i;

    /* JADX INFO: renamed from: j */
    public final zzekz f14625j;

    /* JADX INFO: renamed from: k */
    public final zzdzo f14626k;

    /* JADX INFO: renamed from: l */
    public final zzdzt f14627l;

    public zzeqj(Context context, zzdwq zzdwqVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, zzcgd zzcgdVar, zzclb zzclbVar, zzbqa zzbqaVar, boolean z, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.f14616a = context;
        this.f14617b = zzdwqVar;
        this.f14618c = zzflgVar;
        this.f14619d = versionInfoParcel;
        this.f14620e = zzfknVar;
        this.f14621f = zzcgdVar;
        this.f14622g = zzclbVar;
        this.f14623h = zzbqaVar;
        this.f14624i = z;
        this.f14625j = zzekzVar;
        this.f14626k = zzdzoVar;
        this.f14627l = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        float f2;
        boolean z3;
        boolean z4 = this.f14624i;
        zzflg zzflgVar = this.f14618c;
        zzfkn zzfknVar = this.f14620e;
        zzbqa zzbqaVar = this.f14623h;
        zzdvv zzdvvVar = (zzdvv) zzhcf.m7379m(this.f14621f);
        try {
            final zzclb zzclbVarM6077a = this.f14622g;
            if (zzclbVarM6077a.mo5621y0()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8777u1)).booleanValue()) {
                    zzclbVarM6077a = this.f14617b.m6077a(zzflgVar.f16042f, null, null);
                    zzclbVarM6077a.mo5616v0("/reward", new zzbqq(zzdvvVar.mo5790i()));
                    new zzdwu();
                    zzdvvVar.mo5791j().m6076a(zzclbVarM6077a, true, z4 ? zzbqaVar : null, this.f14626k);
                    zzclbVarM6077a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzeqi
                        @Override // com.google.android.gms.internal.ads.zzcmx
                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ void mo3001a(int i2, String str, String str2, boolean z5) {
                            zzclb zzclbVar = zzclbVarM6077a;
                            zzclbVar.mo5573D0();
                            zzclbVar.mo5582K().m5629L();
                        }
                    };
                    zzclbVarM6077a.mo5582K().f10451z = new zzcmy() { // from class: com.google.android.gms.internal.ads.zzeqh
                        @Override // com.google.android.gms.internal.ads.zzcmy
                        public final /* synthetic */ void zza() {
                            zzclbVarM6077a.mo5598e0();
                        }
                    };
                    zzfks zzfksVar = zzfknVar.f15952s;
                    zzclbVarM6077a.mo5608o0(zzfksVar.f15993b, zzfksVar.f15992a);
                }
            }
            zzclb zzclbVar = zzclbVarM6077a;
            zzclbVar.mo5575E0(true);
            boolean z5 = false;
            boolean zM5100a = z4 ? zzbqaVar.m5100a(false) : false;
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            boolean zM3210i = com.google.android.gms.ads.internal.util.zzs.m3210i(this.f14616a);
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
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zM5100a, zM3210i, z2, f2, z, zzfknVar.f15904O, zzfknVar.f15905P);
            if (zzddmVar != null) {
                zzddmVar.m5904K0();
            }
            zzdnl zzdnlVarMo5789h = zzdvvVar.mo5789h();
            int i2 = zzfknVar.f15906Q;
            VersionInfoParcel versionInfoParcel = this.f14619d;
            String str = zzfknVar.f15883B;
            zzfks zzfksVar2 = zzfknVar.f15952s;
            com.google.android.gms.ads.internal.overlay.zzn.m3014a(context, new AdOverlayInfoParcel(zzdnlVarMo5789h, zzclbVar, i2, versionInfoParcel, str, zzlVar, zzfksVar2.f15993b, zzfksVar2.f15992a, zzflgVar.f16043g, zzddmVar, zzfknVar.m6482b() ? this.f14625j : null, zzclbVar.mo5471g()), true, this.f14627l);
        } catch (zzclq e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14620e;
    }
}
