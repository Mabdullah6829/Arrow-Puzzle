package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.material.card.MaterialCardViewHelper;

/* JADX INFO: loaded from: classes2.dex */
final class zzn extends Api.AbstractClientBuilder<zzd, Api.ApiOptions.NoOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* JADX INFO: renamed from: b */
    public final Api.Client mo3419b(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzd(context, looper, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
