package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhwx extends zzhxt {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f19323e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f19324a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f19325b;

    /* JADX INFO: renamed from: c */
    public final zzhww f19326c;

    /* JADX INFO: renamed from: d */
    public final zzhwv f19327d;

    public /* synthetic */ zzhwx(int i2, BigInteger bigInteger, zzhww zzhwwVar, zzhwv zzhwvVar) {
        this.f19324a = i2;
        this.f19325b = bigInteger;
        this.f19326c = zzhwwVar;
        this.f19327d = zzhwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19326c != zzhww.f19321e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwx)) {
            return false;
        }
        zzhwx zzhwxVar = (zzhwx) obj;
        return zzhwxVar.f19324a == this.f19324a && Objects.equals(zzhwxVar.f19325b, this.f19325b) && zzhwxVar.f19326c == this.f19326c && zzhwxVar.f19327d == this.f19327d;
    }

    public final int hashCode() {
        return Objects.hash(zzhwx.class, Integer.valueOf(this.f19324a), this.f19325b, this.f19326c, this.f19327d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19326c);
        String strValueOf2 = String.valueOf(this.f19327d);
        String strValueOf3 = String.valueOf(this.f19325b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i2 = this.f19324a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i2).length() + 13);
        AbstractC0271e0.m413u(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
