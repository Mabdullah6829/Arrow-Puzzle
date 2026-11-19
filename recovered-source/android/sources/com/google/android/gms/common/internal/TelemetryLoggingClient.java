package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    /* JADX INFO: renamed from: b */
    Task mo3550b(TelemetryData telemetryData);
}
