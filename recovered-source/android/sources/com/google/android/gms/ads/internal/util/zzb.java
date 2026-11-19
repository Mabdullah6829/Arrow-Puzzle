package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzhbb;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzb {

    /* JADX INFO: renamed from: a */
    public final Runnable f3509a = new zza(this);

    /* JADX INFO: renamed from: a */
    public abstract void mo3002a();

    /* JADX INFO: renamed from: b */
    public ListenableFuture mo3108b() {
        return ((zzhbb) zzcfy.f9946a).submit(this.f3509a);
    }
}
