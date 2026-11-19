package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhw implements zzhq {

    /* JADX INFO: renamed from: a */
    public final Context f19273a;

    /* JADX INFO: renamed from: b */
    public final zzhy f19274b;

    public zzhw(Context context) {
        zzhy zzhyVar = new zzhy();
        this.f19273a = context.getApplicationContext();
        this.f19274b = zzhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final /* bridge */ /* synthetic */ zzhr zza() {
        return new zzhx(this.f19273a, this.f19274b.zza());
    }
}
