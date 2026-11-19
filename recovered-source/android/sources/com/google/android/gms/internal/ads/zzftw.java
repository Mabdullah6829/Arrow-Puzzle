package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftw {

    /* JADX INFO: renamed from: a */
    public final Object f16523a;

    /* JADX INFO: renamed from: b */
    public final long f16524b;

    /* JADX INFO: renamed from: c */
    public final Clock f16525c;

    /* JADX INFO: renamed from: d */
    public final long f16526d;

    /* JADX INFO: renamed from: e */
    public final double f16527e;

    /* JADX INFO: renamed from: f */
    public final int f16528f;

    public zzftw(Object obj, Clock clock, double d, int i2) {
        if (clock == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.f16523a = obj;
        this.f16525c = clock;
        this.f16524b = clock.currentTimeMillis();
        this.f16526d = Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8522f0)).longValue() * 1000, WorkRequest.MIN_BACKOFF_MILLIS), 21600000L);
        this.f16527e = d;
        this.f16528f = i2;
    }

    /* JADX INFO: renamed from: a */
    public final long m6695a() {
        return this.f16526d - (this.f16525c.currentTimeMillis() - this.f16524b);
    }
}
