package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzne {
    /* JADX INFO: renamed from: m */
    static boolean m8768m(int i2, boolean z) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z && i3 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    int mo8769b(zzv zzvVar);

    /* JADX INFO: renamed from: k */
    int mo8596k();

    /* JADX INFO: renamed from: l */
    default void mo8597l(zznd zzndVar) {
    }

    /* JADX INFO: renamed from: o */
    String mo4011o();

    /* JADX INFO: renamed from: z */
    default void mo8603z() {
    }

    int zza();
}
