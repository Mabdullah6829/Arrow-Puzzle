package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: s */
    public final ConnectionResult f4515s;

    public zzaf(ConnectionResult connectionResult) {
        Preconditions.m3538b(connectionResult.m3394w(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f4515s = connectionResult;
    }
}
