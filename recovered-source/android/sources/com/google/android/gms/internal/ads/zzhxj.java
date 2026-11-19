package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxj extends zzhxt {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f19386g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f19387a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f19388b;

    /* JADX INFO: renamed from: c */
    public final zzhxi f19389c;

    /* JADX INFO: renamed from: d */
    public final zzhxh f19390d;

    /* JADX INFO: renamed from: e */
    public final zzhxh f19391e;

    /* JADX INFO: renamed from: f */
    public final int f19392f;

    public /* synthetic */ zzhxj(int i2, BigInteger bigInteger, zzhxi zzhxiVar, zzhxh zzhxhVar, zzhxh zzhxhVar2, int i3) {
        this.f19387a = i2;
        this.f19388b = bigInteger;
        this.f19389c = zzhxiVar;
        this.f19390d = zzhxhVar;
        this.f19391e = zzhxhVar2;
        this.f19392f = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19389c != zzhxi.f19384e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxj)) {
            return false;
        }
        zzhxj zzhxjVar = (zzhxj) obj;
        return zzhxjVar.f19387a == this.f19387a && Objects.equals(zzhxjVar.f19388b, this.f19388b) && Objects.equals(zzhxjVar.f19389c, this.f19389c) && Objects.equals(zzhxjVar.f19390d, this.f19390d) && Objects.equals(zzhxjVar.f19391e, this.f19391e) && zzhxjVar.f19392f == this.f19392f;
    }

    public final int hashCode() {
        return Objects.hash(zzhxj.class, Integer.valueOf(this.f19387a), this.f19388b, this.f19389c, this.f19390d, this.f19391e, Integer.valueOf(this.f19392f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19389c);
        String strValueOf2 = String.valueOf(this.f19390d);
        String strValueOf3 = String.valueOf(this.f19391e);
        String strValueOf4 = String.valueOf(this.f19388b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i2 = this.f19392f;
        int length4 = String.valueOf(i2).length();
        int length5 = strValueOf4.length();
        int i3 = this.f19387a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i3).length() + 13);
        AbstractC0271e0.m413u(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i3);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
