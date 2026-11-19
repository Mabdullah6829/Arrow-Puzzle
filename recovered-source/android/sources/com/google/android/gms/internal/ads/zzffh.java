package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffh implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzcfk f15571a;

    /* JADX INFO: renamed from: b */
    public final boolean f15572b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f15573c;

    /* JADX INFO: renamed from: d */
    public final zzhcp f15574d;

    /* JADX INFO: renamed from: e */
    public final int f15575e;

    public zzffh(zzcfk zzcfkVar, boolean z, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, int i2) {
        this.f15571a = zzcfkVar;
        this.f15572b = z;
        this.f15574d = zzhcpVar;
        this.f15573c = scheduledExecutorService;
        this.f15575e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzbio zzbioVar = zzbix.f8348U7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && this.f15572b) {
            return zzhcf.m7367a(new zzffi(null));
        }
        if (!Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbix.f8380W7)).split(",")).contains(String.valueOf(this.f15575e))) {
            return zzhcf.m7367a(new zzffi(null));
        }
        ListenableFuture listenableFuture = zzhcj.f18518t;
        zzffg zzffgVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzffg
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzffi((String) obj);
            }
        };
        zzhcp zzhcpVar = this.f15574d;
        return zzhcf.m7371e(zzhcf.m7373g(zzhcf.m7375i(listenableFuture, zzffgVar, zzhcpVar), ((Long) zzblm.f9135b.m5057c()).longValue(), TimeUnit.MILLISECONDS, this.f15573c), Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfff
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.f15569a.f15571a.m5384d("TrustlessTokenSignal", (Exception) obj);
                return new zzffi(null);
            }
        }, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 50;
    }
}
