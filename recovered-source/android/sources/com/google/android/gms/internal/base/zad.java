package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class zad {

    /* JADX INFO: renamed from: a */
    public static final Feature f21547a;

    /* JADX INFO: renamed from: b */
    public static final Feature f21548b;

    /* JADX INFO: renamed from: c */
    public static final Feature[] f21549c;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        f21547a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        f21548b = feature2;
        f21549c = new Feature[]{feature, feature2};
    }
}
