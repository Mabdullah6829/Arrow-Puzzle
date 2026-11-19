package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflv {
    /* JADX INFO: renamed from: a */
    public static Bundle m6493a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* JADX INFO: renamed from: b */
    public static void m6494b(Bundle bundle, String str, String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m6495c(Bundle bundle, String str, int i2, boolean z) {
        if (z) {
            bundle.putInt(str, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6496d(Bundle bundle, String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6497e(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }
}
