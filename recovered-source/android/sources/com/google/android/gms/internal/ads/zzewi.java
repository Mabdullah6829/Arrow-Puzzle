package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewi implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15020a;

    /* JADX INFO: renamed from: b */
    public final String f15021b;

    /* JADX INFO: renamed from: c */
    public final String f15022c;

    /* JADX INFO: renamed from: d */
    public final long f15023d;

    /* JADX INFO: renamed from: e */
    public final zzczq f15024e;

    /* JADX INFO: renamed from: f */
    public final zzfmo f15025f;

    /* JADX INFO: renamed from: g */
    public final zzflg f15026g;

    /* JADX INFO: renamed from: h */
    public final com.google.android.gms.ads.internal.util.zzj f15027h = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();

    /* JADX INFO: renamed from: i */
    public final zzdzo f15028i;

    /* JADX INFO: renamed from: j */
    public final zzdae f15029j;

    public zzewi(Context context, String str, String str2, zzczq zzczqVar, zzfmo zzfmoVar, zzflg zzflgVar, zzdzo zzdzoVar, zzdae zzdaeVar, long j2) {
        this.f15020a = context;
        this.f15021b = str;
        this.f15022c = str2;
        this.f15024e = zzczqVar;
        this.f15025f = zzfmoVar;
        this.f15026g = zzflgVar;
        this.f15028i = zzdzoVar;
        this.f15029j = zzdaeVar;
        this.f15023d = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        zzdzo zzdzoVar = this.f15028i;
        ConcurrentHashMap concurrentHashMap = zzdzoVar.f13407a;
        String str = this.f15021b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzdzoVar.m6103b("tsacc", String.valueOf(System.currentTimeMillis() - this.f15023d));
            zzdzoVar.m6103b("foreground", true != com.google.android.gms.ads.internal.util.zzs.m3208g(this.f15020a) ? "1" : "0");
        }
        zzczq zzczqVar = this.f15024e;
        zzflg zzflgVar = this.f15026g;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
        zzcfe zzcfeVar = zzczqVar.f11843t;
        synchronized (zzcfeVar.f9865d) {
            long jMo3639a = zzcfeVar.f9862a.mo3639a();
            zzcfeVar.f9871j = jMo3639a;
            zzcfp zzcfpVar = zzcfeVar.f9863b;
            synchronized (zzcfpVar.f9926s) {
                zzcfpVar.f9929v.m5390a(zzmVar, jMo3639a);
            }
        }
        bundle.putAll(this.f15025f.m6538b());
        return zzhcf.m7367a(new zzewj(this.f15020a, bundle, str, this.f15022c, this.f15027h, zzflgVar.f16043g, this.f15029j));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 12;
    }
}
