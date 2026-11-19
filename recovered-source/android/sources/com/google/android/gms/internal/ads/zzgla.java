package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgla extends zzfxq {

    /* JADX INFO: renamed from: f */
    public final zzgfs f17699f;

    public zzgla(Context context, ExecutorService executorService, zzgfs zzgfsVar) {
        super(context, executorService, new TaskCompletionSource().f23216a, false);
        this.f17699f = zzgfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    /* JADX INFO: renamed from: b */
    public final void mo6761b(int i2, long j2) {
        this.f17699f.mo6973b(i2, j2, null, null);
        new TaskCompletionSource().m10768b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    /* JADX INFO: renamed from: c */
    public final void mo6762c(int i2, long j2, Exception exc) {
        this.f17699f.mo6973b(i2, j2, null, exc);
        new TaskCompletionSource().m10768b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    /* JADX INFO: renamed from: d */
    public final void mo6763d(int i2, String str) {
        this.f17699f.mo6973b(i2, -1L, str, null);
        new TaskCompletionSource().m10768b(Boolean.TRUE);
    }
}
