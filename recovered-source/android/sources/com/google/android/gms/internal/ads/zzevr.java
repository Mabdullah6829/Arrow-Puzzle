package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevr implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f14988a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f14989b;

    public zzevr(Context context, zzhcp zzhcpVar) {
        this.f14989b = zzhcpVar;
        this.f14988a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8739re)).booleanValue()) {
            return zzhcf.m7367a(new zzevs(null, false));
        }
        final ContentResolver contentResolver = this.f14988a.getContentResolver();
        if (contentResolver == null) {
            return zzhcf.m7367a(new zzevs(null, false));
        }
        return this.f14989b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzevs(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 61;
    }
}
