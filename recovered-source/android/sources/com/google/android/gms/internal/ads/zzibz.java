package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibz extends Number {

    /* JADX INFO: renamed from: s */
    public final String f19628s;

    public zzibz(String str) {
        this.f19628s = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f19628s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibz) {
            return this.f19628s.equals(((zzibz) obj).f19628s);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f19628s);
    }

    public final int hashCode() {
        return this.f19628s.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f19628s;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return zzici.m8070a(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f19628s;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return zzici.m8070a(str).longValue();
        }
    }

    public final String toString() {
        return this.f19628s;
    }
}
