package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: s */
    public final int f4159s;

    public GooglePlayServicesRepairableException(int i2) {
        super("Google Play Services not available");
        this.f4159s = i2;
    }
}
