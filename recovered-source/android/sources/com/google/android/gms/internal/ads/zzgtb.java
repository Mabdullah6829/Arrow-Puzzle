package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtb extends zzgta {

    /* JADX INFO: renamed from: s */
    public final char f18168s;

    public zzgtb(char c) {
        this.f18168s = c;
    }

    @Override // com.google.android.gms.internal.ads.zzgtf
    /* JADX INFO: renamed from: a */
    public final boolean mo7123a(char c) {
        return c == this.f18168s;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = this.f18168s;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
