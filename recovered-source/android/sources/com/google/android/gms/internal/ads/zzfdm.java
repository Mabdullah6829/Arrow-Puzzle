package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdm implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f15492a;

    /* JADX INFO: renamed from: b */
    public final Context f15493b;

    /* JADX INFO: renamed from: c */
    public final zzhcp f15494c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f15495d;

    /* JADX INFO: renamed from: e */
    public final zzely f15496e;

    /* JADX INFO: renamed from: f */
    public final zzflg f15497f;

    /* JADX INFO: renamed from: g */
    public final VersionInfoParcel f15498g;

    public zzfdm(com.google.android.gms.ads.internal.util.zzj zzjVar, Context context, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzely zzelyVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel) {
        this.f15492a = zzjVar;
        this.f15493b = context;
        this.f15494c = zzhcpVar;
        this.f15495d = scheduledExecutorService;
        this.f15496e = zzelyVar;
        this.f15497f = zzflgVar;
        this.f15498g = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (java.util.Arrays.asList(r1.split(",")).contains(r5.f15493b.getPackageName()) == false) goto L28;
     */
    @Override // com.google.android.gms.internal.ads.zzfcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdm.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 56;
    }
}
