package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class RootTelemetryConfigManager {

    /* JADX INFO: renamed from: b */
    public static RootTelemetryConfigManager f4457b;

    /* JADX INFO: renamed from: c */
    public static final RootTelemetryConfiguration f4458c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a */
    public RootTelemetryConfiguration f4459a;

    private RootTelemetryConfigManager() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized RootTelemetryConfigManager m3548a() {
        try {
            if (f4457b == null) {
                f4457b = new RootTelemetryConfigManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4457b;
    }
}
