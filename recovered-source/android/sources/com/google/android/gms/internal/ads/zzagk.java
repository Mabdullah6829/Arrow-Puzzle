package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagk {
    /* JADX INFO: renamed from: a */
    public static zzagm m4116a(zzeu zzeuVar) {
        zzeuVar.m6365G(1);
        int iM6373O = zzeuVar.m6373O();
        long j2 = zzeuVar.f14888b;
        long j3 = iM6373O;
        int i2 = iM6373O / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jM6378d = zzeuVar.m6378d();
            if (jM6378d == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jM6378d;
            jArrCopyOf2[i3] = zzeuVar.m6378d();
            zzeuVar.m6365G(2);
        }
        zzeuVar.m6365G((int) ((j2 + j3) - ((long) zzeuVar.f14888b)));
        return new zzagm(jArrCopyOf, jArrCopyOf2);
    }
}
