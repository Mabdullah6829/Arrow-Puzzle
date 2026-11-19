package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zam {

    /* JADX INFO: renamed from: a */
    public final int f4358a;

    /* JADX INFO: renamed from: b */
    public final ConnectionResult f4359b;

    public zam(ConnectionResult connectionResult, int i2) {
        Preconditions.m3544h(connectionResult);
        this.f4359b = connectionResult;
        this.f4358a = i2;
    }
}
