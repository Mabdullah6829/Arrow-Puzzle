package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
final class zzhly extends Number {

    /* JADX INFO: renamed from: s */
    public final String f18964s;

    public zzhly(String str) {
        this.f18964s = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f18964s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhly) {
            return this.f18964s.equals(((zzhly) obj).f18964s);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f18964s);
    }

    public final int hashCode() {
        return this.f18964s.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f18964s;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f18964s;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f18964s;
    }
}
