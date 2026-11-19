package com.google.android.gms.internal.consent_sdk;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzde extends zzdd {
    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = 44;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        return AbstractC0271e0.m399g("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
