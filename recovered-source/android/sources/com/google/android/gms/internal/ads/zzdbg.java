package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbg implements zzdgf, zzdls {

    /* JADX INFO: renamed from: s */
    public final Context f11930s;

    /* JADX INFO: renamed from: t */
    public final zzflg f11931t;

    /* JADX INFO: renamed from: u */
    public final VersionInfoParcel f11932u;

    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.util.zzg f11933v;

    /* JADX INFO: renamed from: w */
    public final zzece f11934w;

    /* JADX INFO: renamed from: x */
    public final zzfqt f11935x;

    /* JADX INFO: renamed from: y */
    public final zzecz f11936y;

    public zzdbg(Context context, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzj zzjVar, zzece zzeceVar, zzfqt zzfqtVar, zzecz zzeczVar) {
        this.f11930s = context;
        this.f11931t = zzflgVar;
        this.f11932u = versionInfoParcel;
        this.f11933v = zzjVar;
        this.f11934w = zzeceVar;
        this.f11935x = zzfqtVar;
        this.f11936y = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: a */
    public final void mo3343a(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8329T4)).booleanValue()) {
            m5889b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5889b() {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8313S4)).booleanValue()) {
            String str2 = this.f11931t.f16043g;
            zzcff zzcffVarZzi = this.f11933v.zzi();
            com.google.android.gms.ads.internal.zzf zzfVar = com.google.android.gms.ads.internal.zzt.f3698C.f3712l;
            boolean zM6167f = this.f11936y.m6167f();
            if (zzcffVarZzi != null) {
                zzfVar.getClass();
                str = zzcffVarZzi.f9876d;
            } else {
                str = null;
            }
            zzfVar.m3250a(this.f11930s, this.f11932u, false, zzcffVarZzi, str, str2, null, this.f11935x, null, null, zM6167f);
        }
        this.f11934w.m6150a();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: y */
    public final void mo3344y(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        m5889b();
    }
}
