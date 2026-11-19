package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {

    /* JADX INFO: renamed from: m */
    public static final Api f21539m = new Api("AppSet.API", new zzn(), new Api.ClientKey());

    /* JADX INFO: renamed from: k */
    public final Context f21540k;

    /* JADX INFO: renamed from: l */
    public final GoogleApiAvailabilityLight f21541l;

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f21539m, Api.ApiOptions.f4177i, GoogleApi.Settings.f4198c);
        this.f21540k = context;
        this.f21541l = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* JADX INFO: renamed from: a */
    public final Task mo3367a() {
        if (this.f21541l.m3403c(this.f21540k, 212800000) != 0) {
            return Tasks.m10775e(new ApiException(new Status(17, null, null, null)));
        }
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4277c = new Feature[]{com.google.android.gms.appset.zze.f4040a};
        builderM3484a.f4275a = new zzm();
        builderM3484a.f4276b = false;
        builderM3484a.f4278d = 27601;
        return m3427d(0, builderM3484a.m3485a());
    }
}
