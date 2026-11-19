package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzici {
    /* JADX INFO: renamed from: a */
    public static BigDecimal m8070a(String str) {
        m8071b(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < WorkRequest.MIN_BACKOFF_MILLIS) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static void m8071b(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }
}
