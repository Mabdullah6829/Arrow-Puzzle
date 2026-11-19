package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import p001B.C0084j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends Exception {
    public zzg(int i2, String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public final C0084j m9142a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new C0084j(super.getMessage(), 3);
    }
}
