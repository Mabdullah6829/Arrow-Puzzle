package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzegh implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f13873a;

    public zzegh(Context context) {
        this.f13873a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3316a(Object obj) {
        if (((Boolean) zzbkp.f9006j.m5057c()).booleanValue()) {
            zzbii.m5010a(this.f13873a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        if (((Boolean) zzbkp.f9004h.m5057c()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbii.m5010a(this.f13873a);
        }
    }
}
