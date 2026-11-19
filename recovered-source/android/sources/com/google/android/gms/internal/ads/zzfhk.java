package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzfhk implements zzfnp {

    /* JADX INFO: renamed from: a */
    public final zzfid f15703a;

    /* JADX INFO: renamed from: b */
    public final zzfif f15704b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.client.zzm f15705c;

    /* JADX INFO: renamed from: d */
    public final String f15706d;

    /* JADX INFO: renamed from: e */
    public final Executor f15707e;

    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.ads.internal.client.zzx f15708f;

    /* JADX INFO: renamed from: g */
    public final zzfnf f15709g;

    public zzfhk(zzfid zzfidVar, zzfif zzfifVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfnf zzfnfVar) {
        this.f15703a = zzfidVar;
        this.f15704b = zzfifVar;
        this.f15705c = zzmVar;
        this.f15706d = str;
        this.f15707e = executor;
        this.f15708f = zzxVar;
        this.f15709g = zzfnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final Executor zza() {
        return this.f15707e;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final zzfnf zzb() {
        return this.f15709g;
    }
}
