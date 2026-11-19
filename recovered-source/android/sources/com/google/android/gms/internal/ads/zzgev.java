package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgev implements zzgep {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f17113a;

    /* JADX INFO: renamed from: b */
    public final String f17114b;

    /* JADX INFO: renamed from: c */
    public final long f17115c;

    public zzgev(ExecutorService executorService, String str, long j2) {
        this.f17113a = executorService;
        this.f17114b = str;
        this.f17115c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6966a(String str, byte[] bArr) {
        return CallbackToFutureAdapter.getFuture(new zzges(this, str, true, "application/x-protobuf", bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final ListenableFuture zza(String str) {
        return CallbackToFutureAdapter.getFuture(new zzges(this, str, false, null, new byte[0]));
    }
}
