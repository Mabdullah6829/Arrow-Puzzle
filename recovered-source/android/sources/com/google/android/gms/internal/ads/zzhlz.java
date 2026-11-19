package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlz {
    /* JADX INFO: renamed from: a */
    public static boolean m7553a(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i2 = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static zzibr m7554b(String str) throws IOException {
        try {
            return zzhlx.m7550a(new zzico(new StringReader(str)));
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }
}
