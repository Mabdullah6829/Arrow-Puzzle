package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzicj implements CharSequence {

    /* JADX INFO: renamed from: s */
    public char[] f19666s;

    /* JADX INFO: renamed from: t */
    public String f19667t;

    private zzicj() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f19666s[i2];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f19666s.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new String(this.f19666s, i2, i3 - i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f19667t == null) {
            this.f19667t = new String(this.f19666s);
        }
        return this.f19667t;
    }
}
