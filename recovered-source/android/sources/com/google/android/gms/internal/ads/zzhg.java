package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhg {
    /* JADX INFO: renamed from: a */
    public static int m7442a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i2 >>>= 1;
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static zzhd m7443b(zzeu zzeuVar, boolean z, boolean z2) throws zzat {
        if (z) {
            m7444c(3, zzeuVar, false);
        }
        zzeuVar.m6385k((int) zzeuVar.m6375a(), StandardCharsets.UTF_8);
        long jM6375a = zzeuVar.m6375a();
        String[] strArr = new String[(int) jM6375a];
        for (int i2 = 0; i2 < jM6375a; i2++) {
            strArr[i2] = zzeuVar.m6385k((int) zzeuVar.m6375a(), StandardCharsets.UTF_8);
        }
        if (z2 && (zzeuVar.m6369K() & 1) == 0) {
            throw zzat.m4383a(null, "framing bit expected to be set");
        }
        return new zzhd(strArr);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7444c(int i2, zzeu zzeuVar, boolean z) throws zzat {
        if (zzeuVar.m6360B() < 7) {
            if (z) {
                return false;
            }
            int iM6360B = zzeuVar.m6360B();
            StringBuilder sb = new StringBuilder(String.valueOf(iM6360B).length() + 18);
            sb.append("too short header: ");
            sb.append(iM6360B);
            throw zzat.m4383a(null, sb.toString());
        }
        if (zzeuVar.m6369K() != i2) {
            if (z) {
                return false;
            }
            throw zzat.m4383a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i2))));
        }
        if (zzeuVar.m6369K() == 118 && zzeuVar.m6369K() == 111 && zzeuVar.m6369K() == 114 && zzeuVar.m6369K() == 98 && zzeuVar.m6369K() == 105 && zzeuVar.m6369K() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.m4383a(null, "expected characters 'vorbis'");
    }
}
