package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzegs implements zzdgf {

    /* JADX INFO: renamed from: s */
    public final Context f13892s;

    /* JADX INFO: renamed from: t */
    public final zzceg f13893t;

    public zzegs(Context context, zzceg zzcegVar) {
        this.f13892s = context;
        this.f13893t = zzcegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
        String str = zzfkyVar.f16006b.f16002b.f15976e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzceg zzcegVar = this.f13893t;
        Context context = this.f13892s;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.f16005a.f15998a.f16040d;
        zzcegVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8405Y0)).booleanValue() && zzcegVar.m5361a(context) && zzceg.m5360g(context)) {
            synchronized (zzcegVar.f9837j) {
            }
        }
        zzcegVar.m5366h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
    }
}
