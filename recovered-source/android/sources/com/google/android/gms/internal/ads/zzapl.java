package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapl {
    /* JADX INFO: renamed from: a */
    public static long m4301a(String str) {
        String str2 = zzfm.f16091a;
        String[] strArrSplit = str.split("\\.", 2);
        long j2 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(str3);
        }
        long j3 = j2 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j3 += Long.parseLong(strTrim);
        }
        return j3 * 1000;
    }

    /* JADX INFO: renamed from: b */
    public static float m4302b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
