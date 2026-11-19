package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeui implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f14907a;

    public zzeui(Context context) {
        this.f14907a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzeuj(ContextCompat.checkSelfPermission(this.f14907a, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 2;
    }
}
