package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdj;

/* JADX INFO: loaded from: classes.dex */
final class zzau extends zzdj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f3493s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzax f3494t;

    public zzau(zzax zzaxVar, Context context) {
        this.f3493s = context;
        this.f3494t = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    /* JADX INFO: renamed from: h0 */
    public final void mo2910h0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f3494t.m3104i(this.f3493s, zzeVar.f3107t, true, true);
    }
}
