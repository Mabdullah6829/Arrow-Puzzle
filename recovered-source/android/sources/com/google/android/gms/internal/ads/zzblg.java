package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblg {

    /* JADX INFO: renamed from: a */
    public static final zzbkh f9123a = zzbkh.m5056b(WorkRequest.MIN_BACKOFF_MILLIS, "gads:dynamite_load:fail:sample_rate");

    /* JADX INFO: renamed from: b */
    public static final zzbkh f9124b = zzbkh.m5055a("gads:report_dynamite_crash_in_background_thread", false);

    /* JADX INFO: renamed from: c */
    public static final zzbkh f9125c = new zzbkh("1.0", "gads:public_beta:traffic_multiplier", 4);

    /* JADX INFO: renamed from: d */
    public static final zzbkh f9126d = new zzbkh("com.google.", "gads:sdk_crash_report_class_prefix", 4);

    /* JADX INFO: renamed from: e */
    public static final zzbkh f9127e = zzbkh.m5055a("gads:sdk_crash_report_full_stacktrace", false);

    /* JADX INFO: renamed from: f */
    public static final zzbkh f9128f = new zzbkh(Double.valueOf(0.01d), "gads:trapped_exception_sample_rate", 3);
}
