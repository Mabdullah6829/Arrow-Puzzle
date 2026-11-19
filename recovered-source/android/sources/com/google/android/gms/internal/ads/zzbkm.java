package com.google.android.gms.internal.ads;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.firebase.firestore.util.ExponentialBackoff;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkm {

    /* JADX INFO: renamed from: a */
    public static final zzbkh f8983a = zzbkh.m5056b(ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS, "gads:app_permissions_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: b */
    public static final zzbkh f8984b = zzbkh.m5056b(5000, "gads:audio_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: c */
    public static final zzbkh f8985c = zzbkh.m5056b(WorkRequest.MIN_BACKOFF_MILLIS, "gads:battery_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: d */
    public static final zzbkh f8986d = zzbkh.m5056b(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, "gads:device_info_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: e */
    public static final zzbkh f8987e = zzbkh.m5056b(600000, "gads:hsdp_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: f */
    public static final zzbkh f8988f = zzbkh.m5056b(5000, "gads:memory_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: g */
    public static final zzbkh f8989g = zzbkh.m5056b(600000, "gads:sdk_environment_caching_expiry_ms:expiry");

    /* JADX INFO: renamed from: h */
    public static final zzbkh f8990h = zzbkh.m5056b(5000, "gads:telephony_caching_expiry_ms:expiry");
}
