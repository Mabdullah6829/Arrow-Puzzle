package com.google.android.gms.internal.ads;

import com.google.firebase.firestore.util.ExponentialBackoff;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblc {

    /* JADX INFO: renamed from: a */
    public static final zzbkh f9104a = zzbkh.m5055a("gads:delegating_web_view_client_recursion_detection:enabled", false);

    /* JADX INFO: renamed from: b */
    public static final zzbkh f9105b = zzbkh.m5055a("gads:paw_app_signals:document_start_js:enabled", false);

    /* JADX INFO: renamed from: c */
    public static final zzbkh f9106c = zzbkh.m5055a("gads:paw_app_signals:enabled", false);

    /* JADX INFO: renamed from: d */
    public static final zzbkh f9107d = zzbkh.m5055a("gads:paw_delegate_web_view_client:enabled", false);

    /* JADX INFO: renamed from: e */
    public static final zzbkh f9108e = zzbkh.m5055a("gads:paw_cache:enabled", false);

    /* JADX INFO: renamed from: f */
    public static final zzbkh f9109f = zzbkh.m5056b(30, "gads:paw_cache:refresh_interval_seconds");

    /* JADX INFO: renamed from: g */
    public static final zzbkh f9110g = zzbkh.m5056b(10, "gads:paw_cache:retry_delay_seconds");

    /* JADX INFO: renamed from: h */
    public static final zzbkh f9111h = zzbkh.m5056b(ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS, "gads:paw_cache:ttl_ms");
}
