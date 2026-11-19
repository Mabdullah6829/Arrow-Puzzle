package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhaj {
    /* JADX INFO: renamed from: a */
    public static void m7299a(String str, long j2) {
        if (j2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m7300b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
