package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class zao {

    /* JADX INFO: renamed from: a */
    public final SparseIntArray f4496a;

    /* JADX INFO: renamed from: b */
    public final GoogleApiAvailabilityLight f4497b;

    public zao() {
        this(GoogleApiAvailability.f4154e);
    }

    /* JADX INFO: renamed from: a */
    public final int m3603a(Context context, Api.Client client) {
        int i2;
        Preconditions.m3544h(context);
        Preconditions.m3544h(client);
        int iM3403c = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        SparseIntArray sparseIntArray = this.f4496a;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(minApkVersion, -1);
        }
        if (i2 != -1) {
            return i2;
        }
        SparseIntArray sparseIntArray2 = this.f4496a;
        synchronized (sparseIntArray2) {
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        iM3403c = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i3);
                    if (iKeyAt > minApkVersion && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iM3403c == -1) {
                iM3403c = this.f4497b.m3403c(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, iM3403c);
        }
        return iM3403c;
    }

    public zao(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f4496a = new SparseIntArray();
        Preconditions.m3544h(googleApiAvailabilityLight);
        this.f4497b = googleApiAvailabilityLight;
    }
}
