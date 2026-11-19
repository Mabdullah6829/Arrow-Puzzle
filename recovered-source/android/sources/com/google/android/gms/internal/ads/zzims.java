package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzims {

    /* JADX INFO: renamed from: j */
    public static final zzims f19985j = new zzims(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k */
    public static final zzims f19986k = new zzims(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l */
    public static final zzims f19987l = new zzims(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m */
    public static final zzims f19988m = new zzims(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a */
    public final double f19989a;

    /* JADX INFO: renamed from: b */
    public final double f19990b;

    /* JADX INFO: renamed from: c */
    public final double f19991c;

    /* JADX INFO: renamed from: d */
    public final double f19992d;

    /* JADX INFO: renamed from: e */
    public final double f19993e;

    /* JADX INFO: renamed from: f */
    public final double f19994f;

    /* JADX INFO: renamed from: g */
    public final double f19995g;

    /* JADX INFO: renamed from: h */
    public final double f19996h;

    /* JADX INFO: renamed from: i */
    public final double f19997i;

    public zzims(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f19989a = d5;
        this.f19990b = d6;
        this.f19991c = d7;
        this.f19992d = d;
        this.f19993e = d2;
        this.f19994f = d3;
        this.f19995g = d4;
        this.f19996h = d8;
        this.f19997i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzims.class != obj.getClass()) {
            return false;
        }
        zzims zzimsVar = (zzims) obj;
        return Double.compare(zzimsVar.f19992d, this.f19992d) == 0 && Double.compare(zzimsVar.f19993e, this.f19993e) == 0 && Double.compare(zzimsVar.f19994f, this.f19994f) == 0 && Double.compare(zzimsVar.f19995g, this.f19995g) == 0 && Double.compare(zzimsVar.f19996h, this.f19996h) == 0 && Double.compare(zzimsVar.f19997i, this.f19997i) == 0 && Double.compare(zzimsVar.f19989a, this.f19989a) == 0 && Double.compare(zzimsVar.f19990b, this.f19990b) == 0 && Double.compare(zzimsVar.f19991c, this.f19991c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f19989a);
        long j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f19990b);
        long j3 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f19991c);
        long j4 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f19992d);
        long j5 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f19993e);
        long j6 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f19994f);
        long j7 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f19995g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f19996h);
        long j8 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f19997i);
        return (((((((((((((((((int) j2) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j8)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f19985j)) {
            return "Rotate 0°";
        }
        if (equals(f19986k)) {
            return "Rotate 90°";
        }
        if (equals(f19987l)) {
            return "Rotate 180°";
        }
        if (equals(f19988m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f19989a);
        sb.append(", v=");
        sb.append(this.f19990b);
        sb.append(", w=");
        sb.append(this.f19991c);
        sb.append(", a=");
        sb.append(this.f19992d);
        sb.append(", b=");
        sb.append(this.f19993e);
        sb.append(", c=");
        sb.append(this.f19994f);
        sb.append(", d=");
        sb.append(this.f19995g);
        sb.append(", tx=");
        sb.append(this.f19996h);
        sb.append(", ty=");
        sb.append(this.f19997i);
        sb.append("}");
        return sb.toString();
    }
}
