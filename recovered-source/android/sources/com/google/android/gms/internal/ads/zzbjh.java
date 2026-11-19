package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzbjh extends zzbji {
    /* JADX INFO: renamed from: b */
    public static final String m5040b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i4 = length - 1;
            if (str.charAt(i4) != ',') {
                break;
            }
            length = i4;
        }
        if (length < i3) {
            return null;
        }
        if (i3 != 0) {
            i2 = i3;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    /* JADX INFO: renamed from: a */
    public final String mo5039a(String str, String str2) {
        String strM5040b = m5040b(str);
        String strM5040b2 = m5040b(str2);
        if (TextUtils.isEmpty(strM5040b)) {
            return strM5040b2;
        }
        if (TextUtils.isEmpty(strM5040b2)) {
            return strM5040b;
        }
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strM5040b).length() + 1 + String.valueOf(strM5040b2).length()), strM5040b, ",", strM5040b2);
    }
}
