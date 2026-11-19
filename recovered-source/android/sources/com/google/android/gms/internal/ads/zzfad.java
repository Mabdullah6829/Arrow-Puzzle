package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfad implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15261a;

    /* JADX INFO: renamed from: b */
    public final Intent f15262b;

    public zzfad(Context context, Intent intent) {
        this.f15261a = context;
        this.f15262b = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.m3150k("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8654me)).booleanValue()) {
            return zzhcf.m7367a(new zzfae(null));
        }
        boolean z = false;
        try {
            if (this.f15262b.resolveActivity(this.f15261a.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.m3150k("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
        }
        return zzhcf.m7367a(new zzfae(Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 60;
    }
}
