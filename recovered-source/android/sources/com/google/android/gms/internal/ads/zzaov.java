package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
final class zzaov {

    /* JADX INFO: renamed from: a */
    public String f6306a;

    /* JADX INFO: renamed from: b */
    public int f6307b;

    /* JADX INFO: renamed from: c */
    public boolean f6308c;

    /* JADX INFO: renamed from: d */
    public int f6309d;

    /* JADX INFO: renamed from: e */
    public boolean f6310e;

    /* JADX INFO: renamed from: k */
    public float f6316k;

    /* JADX INFO: renamed from: l */
    public String f6317l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f6320o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f6321p;

    /* JADX INFO: renamed from: r */
    public zzaoo f6323r;

    /* JADX INFO: renamed from: t */
    public String f6325t;

    /* JADX INFO: renamed from: u */
    public String f6326u;

    /* JADX INFO: renamed from: f */
    public int f6311f = -1;

    /* JADX INFO: renamed from: g */
    public int f6312g = -1;

    /* JADX INFO: renamed from: h */
    public int f6313h = -1;

    /* JADX INFO: renamed from: i */
    public int f6314i = -1;

    /* JADX INFO: renamed from: j */
    public int f6315j = -1;

    /* JADX INFO: renamed from: m */
    public int f6318m = -1;

    /* JADX INFO: renamed from: n */
    public int f6319n = -1;

    /* JADX INFO: renamed from: q */
    public int f6322q = -1;

    /* JADX INFO: renamed from: s */
    public float f6324s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final String m4278a() {
        return this.f6325t;
    }

    /* JADX INFO: renamed from: b */
    public final String m4279b() {
        return this.f6326u;
    }

    /* JADX INFO: renamed from: c */
    public final void m4280c(zzaov zzaovVar) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaovVar != null) {
            if (!this.f6308c && zzaovVar.f6308c) {
                this.f6307b = zzaovVar.f6307b;
                this.f6308c = true;
            }
            if (this.f6313h == -1) {
                this.f6313h = zzaovVar.f6313h;
            }
            if (this.f6314i == -1) {
                this.f6314i = zzaovVar.f6314i;
            }
            if (this.f6306a == null && (str = zzaovVar.f6306a) != null) {
                this.f6306a = str;
            }
            if (this.f6311f == -1) {
                this.f6311f = zzaovVar.f6311f;
            }
            if (this.f6312g == -1) {
                this.f6312g = zzaovVar.f6312g;
            }
            if (this.f6319n == -1) {
                this.f6319n = zzaovVar.f6319n;
            }
            if (this.f6320o == null && (alignment2 = zzaovVar.f6320o) != null) {
                this.f6320o = alignment2;
            }
            if (this.f6321p == null && (alignment = zzaovVar.f6321p) != null) {
                this.f6321p = alignment;
            }
            if (this.f6322q == -1) {
                this.f6322q = zzaovVar.f6322q;
            }
            if (this.f6315j == -1) {
                this.f6315j = zzaovVar.f6315j;
                this.f6316k = zzaovVar.f6316k;
            }
            if (this.f6323r == null) {
                this.f6323r = zzaovVar.f6323r;
            }
            if (this.f6324s == Float.MAX_VALUE) {
                this.f6324s = zzaovVar.f6324s;
            }
            if (this.f6325t == null) {
                this.f6325t = zzaovVar.f6325t;
            }
            if (this.f6326u == null) {
                this.f6326u = zzaovVar.f6326u;
            }
            if (!this.f6310e && zzaovVar.f6310e) {
                this.f6309d = zzaovVar.f6309d;
                this.f6310e = true;
            }
            if (this.f6318m != -1 || (i2 = zzaovVar.f6318m) == -1) {
                return;
            }
            this.f6318m = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m4281d() {
        return this.f6317l;
    }
}
