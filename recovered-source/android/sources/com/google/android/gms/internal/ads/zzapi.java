package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
final class zzapi {

    /* JADX INFO: renamed from: c */
    public CharSequence f6392c;

    /* JADX INFO: renamed from: a */
    public long f6390a = 0;

    /* JADX INFO: renamed from: b */
    public long f6391b = 0;

    /* JADX INFO: renamed from: d */
    public int f6393d = 2;

    /* JADX INFO: renamed from: e */
    public float f6394e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f6395f = 1;

    /* JADX INFO: renamed from: g */
    public int f6396g = 0;

    /* JADX INFO: renamed from: h */
    public float f6397h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f6398i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f6399j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f6400k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX INFO: renamed from: a */
    public final zzcx m4294a() {
        Layout.Alignment alignment;
        float f2 = this.f6397h;
        float f3 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            int i2 = this.f6393d;
            if (i2 != 4) {
                f2 = i2 != 5 ? 0.5f : 1.0f;
            } else {
                f2 = 0.0f;
            }
        }
        int i3 = this.f6398i;
        if (i3 == Integer.MIN_VALUE) {
            int i4 = this.f6393d;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 == 3) {
                i3 = 2;
            } else if (i4 == 4) {
                i3 = 0;
            } else if (i4 != 5) {
                i3 = 1;
            } else {
                i3 = 2;
            }
        }
        zzcx zzcxVar = new zzcx();
        int i5 = this.f6393d;
        if (i5 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i5 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i5 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i5 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i5 != 5) {
            AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i5).length() + 23), "Unknown textAlignment: ", i5, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzcxVar.f11651c = alignment;
        float f4 = this.f6394e;
        int i6 = this.f6395f;
        if (f4 != -3.4028235E38f && i6 == 0 && (f4 < 0.0f || f4 > 1.0f)) {
            f3 = 1.0f;
        } else if (f4 != -3.4028235E38f) {
            f3 = f4;
        } else if (i6 == 0) {
            f3 = 1.0f;
        }
        zzcxVar.f11653e = f3;
        zzcxVar.f11654f = i6;
        zzcxVar.f11655g = this.f6396g;
        zzcxVar.f11656h = f2;
        zzcxVar.f11657i = i3;
        float f5 = this.f6399j;
        if (i3 == 0) {
            f2 = 1.0f - f2;
        } else if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException(String.valueOf(i3));
            }
        } else if (f2 <= 0.5f) {
            f2 += f2;
        } else {
            float f6 = 1.0f - f2;
            f2 = f6 + f6;
        }
        zzcxVar.f11660l = Math.min(f5, f2);
        zzcxVar.f11662n = this.f6400k;
        CharSequence charSequence = this.f6392c;
        if (charSequence != null) {
            zzcxVar.m5859a(charSequence);
        }
        return zzcxVar;
    }
}
