package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends GoogleApi implements TelemetryLoggingClient {

    /* JADX INFO: renamed from: k */
    public static final Api f4476k = new Api("ClientTelemetry.API", new zar(), new Api.ClientKey());

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    /* JADX INFO: renamed from: b */
    public final Task mo3550b(final TelemetryData telemetryData) {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4277c = new Feature[]{com.google.android.gms.internal.base.zad.f21547a};
        builderM3484a.f4276b = false;
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                Api api = zat.f4476k;
                zak zakVar = (zak) ((zau) anyClient).getService();
                Parcel parcelM9076u = zakVar.m9076u();
                com.google.android.gms.internal.base.zac.m9078b(parcelM9076u, telemetryData);
                zakVar.m9075k0(parcelM9076u);
                taskCompletionSource.m10768b(null);
            }
        };
        return m3427d(2, builderM3484a.m3485a());
    }
}
