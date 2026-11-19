package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzhdb extends zzhbw {

    /* JADX INFO: renamed from: A */
    public ScheduledFuture f18535A;

    /* JADX INFO: renamed from: z */
    public ListenableFuture f18536z;

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: e */
    public final void mo6897e() {
        m7325m(this.f18536z);
        ScheduledFuture scheduledFuture = this.f18535A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f18536z = null;
        this.f18535A = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        ListenableFuture listenableFuture = this.f18536z;
        ScheduledFuture scheduledFuture = this.f18535A;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strM2450q;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strM2450q;
        }
        int length = strM2450q.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(strM2450q);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
