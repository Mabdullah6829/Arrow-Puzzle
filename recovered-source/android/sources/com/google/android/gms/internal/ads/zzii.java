package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class zzii extends zzig {

    /* JADX INFO: renamed from: u */
    public final int f19933u;

    public zzii(int i2, zzhs zzhsVar) {
        super(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 15), "Response code: ", i2), zzhsVar, AdError.INTERNAL_ERROR_2004, 1);
        this.f19933u = i2;
    }
}
