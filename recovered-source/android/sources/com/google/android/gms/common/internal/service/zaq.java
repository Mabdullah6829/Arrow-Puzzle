package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zaq extends GoogleApi implements com.google.android.gms.common.internal.zad {

    /* JADX INFO: renamed from: k */
    public static final Api f4474k = new Api("ClientNotification.API", new zao(), new Api.ClientKey());

    /* JADX INFO: renamed from: e */
    public final Task m3592e(final com.google.android.gms.common.internal.zab zabVar) {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4277c = new Feature[]{com.google.android.gms.internal.base.zad.f21548b};
        builderM3484a.f4276b = false;
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                Api api = zaq.f4474k;
                zaj zajVar = (zaj) ((zab) anyClient).getService();
                Parcel parcelM9076u = zajVar.m9076u();
                com.google.android.gms.internal.base.zac.m9078b(parcelM9076u, zabVar);
                zajVar.m9075k0(parcelM9076u);
                taskCompletionSource.m10768b(null);
            }
        };
        return m3427d(2, builderM3484a.m3485a());
    }
}
