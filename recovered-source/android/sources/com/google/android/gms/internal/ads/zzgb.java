package com.google.android.gms.internal.ads;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class zzgb {

    /* JADX INFO: renamed from: a */
    public final int f16892a;

    /* JADX INFO: renamed from: a */
    public static String m6835a(int i2) {
        char c = (char) ((i2 >> 24) & 255);
        char c2 = (char) ((i2 >> 16) & 255);
        char c3 = (char) ((i2 >> 8) & 255);
        char c4 = (char) (i2 & 255);
        StringBuilder sb = new StringBuilder(AbstractC0271e0.m395c(String.valueOf(c).length(), String.valueOf(c2).length(), String.valueOf(c3).length(), String.valueOf(c4).length()));
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public String toString() {
        return m6835a(this.f16892a);
    }
}
