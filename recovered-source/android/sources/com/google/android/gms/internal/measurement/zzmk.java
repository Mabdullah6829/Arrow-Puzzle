package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmk extends RuntimeException {

    /* JADX INFO: renamed from: s */
    public final int f22648s;

    public zzmk(int i2, String str, ApiException apiException) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i2, 2) + str.length());
            sb.append(i2);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i2);
        }
        super(strValueOf, apiException);
        this.f22648s = i2;
    }
}
