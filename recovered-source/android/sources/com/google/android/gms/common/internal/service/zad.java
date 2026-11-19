package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
final class zad extends zag {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* JADX INFO: renamed from: g */
    public final void mo3448g(Api.AnyClient anyClient) {
        zan zanVar = (zan) ((zai) anyClient).getService();
        zae zaeVar = new zae(this);
        Parcel parcelM9076u = zanVar.m9076u();
        com.google.android.gms.internal.base.zac.m9079c(parcelM9076u, zaeVar);
        zanVar.m9075k0(parcelM9076u);
    }
}
