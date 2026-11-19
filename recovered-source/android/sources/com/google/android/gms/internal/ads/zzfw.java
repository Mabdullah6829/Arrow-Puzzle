package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw {

    /* JADX INFO: renamed from: a */
    public final String f16688a;

    public zzfw(String str) {
        this.f16688a = str;
    }

    /* JADX INFO: renamed from: a */
    public static zzfw m6736a(zzeu zzeuVar) {
        String str;
        zzeuVar.m6365G(2);
        int iM6369K = zzeuVar.m6369K();
        int i2 = iM6369K >> 1;
        int i3 = iM6369K & 1;
        int iM6369K2 = zzeuVar.m6369K() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = iM6369K2 | (i3 << 5);
        String str2 = i2 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i4).length();
        String str3 = i4 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(length + length2, length3, str3));
        sb.append(str);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        sb.append(i4);
        return new zzfw(sb.toString());
    }
}
