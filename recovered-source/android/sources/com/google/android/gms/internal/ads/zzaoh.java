package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzaoh {

    /* JADX INFO: renamed from: a */
    public final int f6218a;

    /* JADX INFO: renamed from: b */
    public final int f6219b;

    /* JADX INFO: renamed from: c */
    public final int f6220c;

    /* JADX INFO: renamed from: d */
    public final int f6221d;

    /* JADX INFO: renamed from: e */
    public final int f6222e;

    /* JADX INFO: renamed from: f */
    public final int f6223f;

    public zzaoh(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f6218a = i2;
        this.f6219b = i3;
        this.f6220c = i4;
        this.f6221d = i5;
        this.f6222e = i6;
        this.f6223f = i7;
    }

    /* JADX INFO: renamed from: a */
    public static zzaoh m4255a(String str) {
        byte b;
        zzgtr.m7128a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i4 == -1 || i5 == -1 || i7 == -1) {
                    return null;
                }
                return new zzaoh(i3, i4, i5, i6, i7, length);
            }
            switch (zzgsz.m7119a(strArrSplit[i2].trim())) {
                case "end":
                    b = 2;
                    break;
                case "text":
                    b = 4;
                    break;
                case "layer":
                    b = 0;
                    break;
                case "start":
                    b = 1;
                    break;
                case "style":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i3 = i2;
            } else if (b == 1) {
                i4 = i2;
            } else if (b == 2) {
                i5 = i2;
            } else if (b == 3) {
                i6 = i2;
            } else if (b == 4) {
                i7 = i2;
            }
            i2++;
        }
    }
}
