package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhft extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final int f18621a;

    /* JADX INFO: renamed from: b */
    public final int f18622b;

    /* JADX INFO: renamed from: c */
    public final int f18623c;

    /* JADX INFO: renamed from: d */
    public final int f18624d;

    /* JADX INFO: renamed from: e */
    public final zzhfs f18625e;

    /* JADX INFO: renamed from: f */
    public final zzhfr f18626f;

    public /* synthetic */ zzhft(int i2, int i3, int i4, int i5, zzhfs zzhfsVar, zzhfr zzhfrVar) {
        this.f18621a = i2;
        this.f18622b = i3;
        this.f18623c = i4;
        this.f18624d = i5;
        this.f18625e = zzhfsVar;
        this.f18626f = zzhfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18625e != zzhfs.f18619d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhft)) {
            return false;
        }
        zzhft zzhftVar = (zzhft) obj;
        return zzhftVar.f18621a == this.f18621a && zzhftVar.f18622b == this.f18622b && zzhftVar.f18623c == this.f18623c && zzhftVar.f18624d == this.f18624d && zzhftVar.f18625e == this.f18625e && zzhftVar.f18626f == this.f18626f;
    }

    public final int hashCode() {
        return Objects.hash(zzhft.class, Integer.valueOf(this.f18621a), Integer.valueOf(this.f18622b), Integer.valueOf(this.f18623c), Integer.valueOf(this.f18624d), this.f18625e, this.f18626f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18625e);
        String strValueOf2 = String.valueOf(this.f18626f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.f18623c;
        int length3 = String.valueOf(i2).length();
        int i3 = this.f18624d;
        int length4 = String.valueOf(i3).length();
        int i4 = this.f18621a;
        int length5 = String.valueOf(i4).length();
        int i5 = this.f18622b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i5).length() + 15);
        AbstractC0271e0.m413u(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        AbstractC1456a.m2455v(sb, ", ", i2, "-byte IV, and ", i3);
        AbstractC1456a.m2455v(sb, "-byte tags, and ", i4, "-byte AES key, and ", i5);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
