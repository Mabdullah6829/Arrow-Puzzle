package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzapb {

    /* JADX INFO: renamed from: c */
    public static final Pattern f6357c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f6358d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final zzeu f6359a = new zzeu();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f6360b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static void m4290a(zzeu zzeuVar) {
        while (true) {
            for (boolean z = true; zzeuVar.m6360B() > 0 && z; z = false) {
                int i2 = zzeuVar.f14888b;
                byte[] bArr = zzeuVar.f14887a;
                byte b = bArr[i2];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzeuVar.m6365G(1);
                } else {
                    int i3 = zzeuVar.f14889c;
                    if (i2 + 2 <= i3) {
                        int i4 = i2 + 1;
                        if (b == 47) {
                            int i5 = i2 + 2;
                            if (bArr[i4] == 42) {
                                while (true) {
                                    int i6 = i5 + 1;
                                    if (i6 >= i3) {
                                        break;
                                    }
                                    if (((char) bArr[i5]) == '*' && ((char) bArr[i6]) == '/') {
                                        i3 = i5 + 2;
                                        i5 = i3;
                                    } else {
                                        i5 = i6;
                                    }
                                }
                                zzeuVar.m6365G(i3 - zzeuVar.f14888b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4291b(zzeu zzeuVar, StringBuilder sb) {
        m4290a(zzeuVar);
        if (zzeuVar.m6360B() == 0) {
            return null;
        }
        String strM4292c = m4292c(zzeuVar, sb);
        if (!strM4292c.isEmpty()) {
            return strM4292c;
        }
        char cM6369K = (char) zzeuVar.m6369K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cM6369K).length());
        sb2.append(cM6369K);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m4292c(zzeu zzeuVar, StringBuilder sb) {
        char c;
        sb.setLength(0);
        int i2 = zzeuVar.f14888b;
        int i3 = zzeuVar.f14889c;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (i2 < i3 && !z) {
                    c = (char) zzeuVar.f14887a[i2];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            i2++;
        }
        zzeuVar.m6365G(i2 - zzeuVar.f14888b);
        return sb.toString();
    }
}
